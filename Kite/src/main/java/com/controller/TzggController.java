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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.po.MzywFjxx;
import com.po.MzywTzgg;
import com.service.TongGaoService;
import com.utils.PageDto;

@Controller
public class TzggController {
	@Autowired
	private TongGaoService tongGaoService;

	// 跳转到通告页面
	@RequestMapping(value = "/user/tzggCx", method = RequestMethod.GET)
	public String tzggCxGet() {
		return "tzgg/tzggCx";
	}

	// 通告分页查询
	@ResponseBody
	@RequestMapping(value = "/user/tzggCx", method = RequestMethod.POST)
	public PageDto<MzywTzgg> tzggCxPost(int pageIndex, int pageSize, String tzggbt, String startDate, String endDate,
			String tzggzt) {
		if (startDate.length() == 0) {
			startDate = "2001-01-01";
		}
		if (endDate.length() == 0) {
			Date now = new Date();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			endDate = df.format(now);
		}
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("start", (pageIndex - 1) * pageSize);
		map.put("end", pageSize);
		map.put("tzggbt", "%" + tzggbt + "%");
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("tzggzt", tzggzt);
		List<MzywTzgg> list = tongGaoService.queryList(map);
		System.out.println("=======");
		System.out.println(list.size());
		PageDto<MzywTzgg> dto = new PageDto<MzywTzgg>();
		dto.setList(list);
		dto.setPageIndex(pageIndex);
		dto.setPageSize(pageSize);
		int count = tongGaoService.queryListCount(map);
		dto.setCount(count);
		dto.setPageTotal(count, pageSize);
		return dto;
	}

	// 通告查看通过id查看
	@RequestMapping(value = "/user/tzggCha", method = RequestMethod.GET)
	public String tzggCha(String id, Model model) {
		MzywTzgg mzywTzgg = tongGaoService.queryByID(id);
		model.addAttribute("MzywTzgg", mzywTzgg);
		//查看附件通过id查
		String ysbxxid=id;
		MzywFjxx mzywFjxx = tongGaoService.queryByFJID(ysbxxid);
		model.addAttribute("MzywFjxx", mzywFjxx);
		return "tzgg/ggXq";
	}

	// 通告发布
	@RequestMapping(value = "/user/tzggFaBu", method = RequestMethod.GET)
	public String tzggFaBu(String id, Model model) {
		MzywTzgg mzywTzgg = tongGaoService.queryByID(id);
		model.addAttribute("MzywTzgg", mzywTzgg);
		return "tzgg/ggFb";
	}

	// 通知公告发布，通过id更新状态
	@RequestMapping(value = "/user/tzggFaBu", method = RequestMethod.POST)
	public void tzggFabu(String id, String tzggzt) {
		tongGaoService.updateZtById(id, tzggzt);
	}
	
	// 通告删除
	@RequestMapping(value = "/user/tzggdelete", method = RequestMethod.GET)
	public String delete(String id) {
		tongGaoService.delete(id);
		return "tzgg/tzggCx";
	}
//跳转公告新增页面
	@RequestMapping(value = "/user/tzggxz", method = RequestMethod.GET)
	public String tzggzxGet() {
		return "tzgg/ggxz";
	}
	
	// 通告保存
	@RequestMapping(value = "/user/tzggZanCun", method = RequestMethod.POST)
	public void tzggZanCun(MzywTzgg mzywTzgg) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String now = df.format(new Date());
		mzywTzgg.setFbsj(now);
		tongGaoService.tzggZanCun(mzywTzgg);
		
	}

	// 通告更新
	@RequestMapping(value = "/user/tzggGX", method = RequestMethod.POST)
	public void tzggGX(String tzggbt, String tzggzw, String id) {
		tongGaoService.tzggGX(tzggbt, tzggzw, id);
	}
	
	
	

	@RequestMapping(value = "/user/ggFb", method = RequestMethod.GET)
	public String ggFbGet() {

		return "tzgg/ggFb";
	}

	@RequestMapping(value = "/user/ggXq", method = RequestMethod.GET)
	public String ggXqGet() {

		return "tzgg/ggXq";
	}
	
	
	
	//上传
	@RequestMapping(value="/upload2",method=RequestMethod.POST)
	public String update2(HttpServletRequest request,MultipartFile photo,Integer id) {
		//获取文件名和服务器文件名
		String fileName = photo.getOriginalFilename();
		String fileNameServer = System.currentTimeMillis()+fileName.substring(fileName.lastIndexOf("."));
		//保存到数据库 userName、password、fileName、fileNameServer
		MzywFjxx mzywFjxx = new MzywFjxx();
		mzywFjxx.setId(id);
		mzywFjxx.setFjhzm(fileNameServer);//服务器文件名
		mzywFjxx.setFjmc(fileName);//文件名
		tongGaoService.updateFJGX(mzywFjxx);
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
	@RequestMapping(value="/down",method=RequestMethod.POST)  
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
	
	
	
}
