package com.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.service.FxbService;
import com.utils.DictUtil;
import com.utils.PageDto;
import com.utils.excelutils;
import com.po.MzywFjxx;
import com.po.MzywFxb;
import com.po.MzywTzgg;

@Controller
public class FxbController {
	

	@Autowired
	private FxbService fxbService;
	
	//法宣办信息查询详情
	@RequestMapping(value="/user/fxbXxCxQx",method=RequestMethod.GET)
	public String fxbXxCxQxGet() {
		return "fxb/fxbXxCxQx";
	}
	@ResponseBody
	@RequestMapping(value="/user/fxbXxCxQx",method=RequestMethod.POST)
	public PageDto<MzywFxb> fxbXxCxQxPost(int pageIndex,int pageSize,String xxbt,String startDate,String endDate,
			String shjg,String tjzt,String lmmc){
		    PageDto<MzywFxb> dto = fxbService.queryList(pageIndex, pageSize, xxbt, startDate, endDate, shjg, tjzt, lmmc);
		    List<MzywFxb> list = dto.getList();
			for (MzywFxb mzy: list) {
				String mc = DictUtil.getDictMc("shenhe",mzy.getShjg());
				mzy.setShjg(mc);
			}
			
			for (MzywFxb mzy: list) {
				String mc = DictUtil.getDictMc("tijiaozt",mzy.getTjzt());
				mzy.setTjzt(mc);
			}
			
			for (MzywFxb mzy: list) {
				String mc= DictUtil.getDictMc("lmmc",mzy.getLmmc());
				mzy.setLmmc(mc);;
			}
	       return dto;
}
	
	
	
	@RequestMapping(value="/user/xxbsBsQxjj",method=RequestMethod.GET)
	public String xxbsBsQxjjGet(String id,Model model) {
		MzywFxb mzywFxb = fxbService.queryById(id);
		model.addAttribute("MzywFxb",mzywFxb);
		return "fxb/xxbsBsQxjj";
	}
	
	//跳转到法宣办新增页面
	@RequestMapping(value="/user/fxbxz",method=RequestMethod.GET)
	public String fxbxzGet() {
		return "fxb/fxbxz";
	}
	//法宣办新增
	@RequestMapping(value ="/user/fxbZanCun", method = RequestMethod.POST)
	public void fxbZanCun(MzywFxb mzywFxb) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String now = df.format(new Date());
		mzywFxb.setZhxgsj(now);
		fxbService.fxbZanCun(mzywFxb);
		
	}
	
	//法宣办报送，通过id更新状态
			@RequestMapping(value="/user/fxbBS",method=RequestMethod.POST)
			public void fxbBS(String id,String zcbs) {
				fxbService.updateZtById(id,zcbs);
			}
	
			//法宣办删除
			@RequestMapping(value="/user/fxbdelete",method=RequestMethod.GET)
			public String delete(String id) {
				fxbService.delete(id);
				return "fxb/fxbXxCxQx";
			}
		
			//法宣办更新
			@RequestMapping(value="/user/fxbGX",method=RequestMethod.POST)
			public void fxbGX(String xxbt,String sbdw,String xxzw,String zz,String fgld,String sbry,String id) {
				fxbService.fxbGX(xxbt,sbdw,xxzw,zz,fgld,sbry,id);	
	
			}
	        //法宣办上传
			@RequestMapping(value="/fxb/upload",method=RequestMethod.POST)
			public String update2(HttpServletRequest request,MultipartFile photo,Integer id) {
				//获取文件名和服务器文件名
				String fileName = photo.getOriginalFilename();
				String fileNameServer = System.currentTimeMillis()+fileName.substring(fileName.lastIndexOf("."));
				//保存到数据库 userName、password、fileName、fileNameServer
				MzywFjxx mzywFjxx = new MzywFjxx();
				mzywFjxx.setId(id);
				mzywFjxx.setFjhzm(fileNameServer);//服务器文件名
				mzywFjxx.setFjmc(fileName);//文件名
				fxbService.updateFJGX(mzywFjxx);
				//文件保存到本地服务器
				
				//获取文件需要上传到的路径
				String path = request.getSession().getServletContext().getRealPath("/upload");
		        System.out.println(path);
				//创建文件夹
				File file = new File(path);
				if(!file.exists()) {
					file.mkdirs();
				}
				//创建文件
				file = new File(path,fileNameServer);
				try {
					photo.transferTo(file);
				}catch(IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return "tzgg/tzggCx";
				}
			
			
			//法宣办下载
			@RequestMapping("/down")  
		    public void down(HttpServletRequest request,HttpServletResponse response) throws Exception{  
		        //模拟文件，myfile.txt为需要下载的文件  
		        String fileName = request.getSession().getServletContext().getRealPath("upload")+"/myfile.txt";  
		        //获取输入流  
		        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));  
		        //假如以中文名下载的话  
		        String filename = "下载文件.txt";  
		        //转码，免得文件名中文乱码  
		        filename = URLEncoder.encode(filename,"UTF-8");  
		        //设置文件下载头  
		        response.addHeader("Content-Disposition", "attachment;filename=" + filename);    
		        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型    
		        response.setContentType("multipart/form-data");   
		        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());  
		        int len = 0;  
		        while((len = bis.read()) != -1){  
		            out.write(len);  
		            out.flush();  
		        }  
		        out.close();  
		    }  
		




			
			
			
			
			
			
			
			
	
	
	
           //法宣办用户
	
	
	
		
	
	
	
	
	//法宣办用户查询首页
	@RequestMapping(value="/user/xxbsCxFxby",method=RequestMethod.GET)
	public String xxbsCxFxbyGet() {
		return "fxb/xxbsCxFxby";
	}
	//法宣办用户分页查询首页加下拉框渲染
		@ResponseBody
		@RequestMapping(value="/user/xxbsCxFxby",method=RequestMethod.POST)
		public PageDto<MzywFxb> xxbsCxFxby(int pageIndex,int pageSize,String xxbt,String sbdw, String startDate,String endDate,
				String shjg,String tjzt,String lmmc){
			    PageDto<MzywFxb> dto = fxbService.queryList(pageIndex, pageSize, xxbt,sbdw, startDate, endDate, shjg, tjzt, lmmc);
			    List<MzywFxb> list = dto.getList();
				for (MzywFxb mzy: list) {
					String mc = DictUtil.getDictMc("shenhe",mzy.getShjg());
					mzy.setShjg(mc);
				}
				
				for (MzywFxb mzy: list) {
					String mc = DictUtil.getDictMc("tijiaozt",mzy.getTjzt());
					mzy.setTjzt(mc);
				}
				
				for (MzywFxb mzy: list) {
					String mc= DictUtil.getDictMc("lmmc",mzy.getLmmc());
					mzy.setLmmc(mc);;
				}
				
				for (MzywFxb mzy: list) {
					String mc= DictUtil.getDictMc("sbdw",mzy.getSbdw());
					mzy.setSbdw(mc);
				}
		       return dto;
	}
		
	
	
	
	
	//法宣办用户查询详情
		@RequestMapping(value="/user/xxbsShFxby",method=RequestMethod.GET)
		public String xxbsCxFxby(String id,Model model) {
			MzywFxb mzywFxb = fxbService.queryById(id);
			model.addAttribute("MzywFxb",mzywFxb);
			
			//查看附件通过id查
			String ysbxxid=id;
			MzywFjxx mzywFjxx = fxbService.queryByFJID(ysbxxid);
			model.addAttribute("MzywFjxx", mzywFjxx);
	
			return "fxb/xxbsShFxby";
		}
	
	
	@RequestMapping(value="/user/xxbsXqFxby",method=RequestMethod.GET)
	public String xxbsXqFxbyGet(String id,Model model) {
		MzywFxb mzywFxb = fxbService.queryById(id);
		model.addAttribute("mzywFxb",mzywFxb);
		return "fxb/xxbsXqFxby";
	}
	
	//法宣办用户审核页面
	@RequestMapping(value="/user/xxbsXqQxjj",method=RequestMethod.GET)
	public String xxbsXqQxjj(String id,Model model) {
		MzywFxb mzywFxb = fxbService.queryById(id);
		model.addAttribute("mzywFxb",mzywFxb);
		return "fxb/xxbsXqQxjj";
	}
	
	//法宣办用户审核，通过id更新状态
	@RequestMapping(value="/user/fxbSH",method=RequestMethod.POST)
	public void fxbSH(String id,String tjzt) {
		fxbService.updateSHById(id,tjzt);
	}
	
}
