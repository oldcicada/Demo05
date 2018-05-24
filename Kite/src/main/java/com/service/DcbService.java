package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.po.MzywDcbCxbdjf;
import com.po.MzywDcbPxbzjf;
import com.po.MzywDcbZhpfCx;
import com.po.MzywDcbZhpfwh;
import com.utils.PageDto;

@Service
public interface DcbService {

	//按条件查询
	public PageDto<MzywDcbCxbdjf> findPxbzByBsdwTime(int pageIndex,int pageSize,String bsdw,String startDate,String endDate);

	//通过ID查询评先表彰人信息
	public MzywDcbCxbdjf lookOne(String id);

	//宣传报道查询分页
	public PageDto<MzywDcbPxbzjf> findXcbdByBsdwTime(int pageIndex, int pageSize, String bsdw, String startDate,
			String endDate, String bdlx);

	//添加评先表彰报送信息
	public int bsPxbz(String id,String hjmc, String bzsj, String bjdwmc, String zpjf);

	//暂存报送信息
	public int zcBsPxbz(String id, String hjmc, String bzsj, String bjdwmc, String zpjf);

	//删除评先表彰信息
	public int deletPxbz(String id);

	//宣传报道详情页面渲染
	public MzywDcbPxbzjf lookOneXcbd(String id);

	//报送宣传报道信息
	public int bsXcbd(String id, String bzkwmtwzmc, String kysj, String bdlx, String xwbt, String zz, String bz,String zcbs);

	//暂存宣传报道信息
	public int zcBsXcbd(String id, String bzkwmtwzmc, String kysj, String bdlx, String xwbt, String zz, String bz,
			String zcbs);

	//删除宣传报道信息
	public int deletXcbd(String id);

	//分页查询综合评分
	public PageDto<MzywDcbZhpfCx> findZhpfCx(int pageIndex, int pageSize, String csfl, int year);

	
	//综合评分详情
	public List<MzywDcbZhpfwh> lookZhpf(String id);

	
	
}
