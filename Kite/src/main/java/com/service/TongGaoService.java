package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.po.MzywFjxx;
import com.po.MzywTzgg;

public interface TongGaoService {

	List<MzywTzgg> queryList(Map<Object, Object> map);

	int queryListCount(Map<Object, Object> map);

	// 报送信息
	// public int tzggBS(String id,String hjmc, String bzsj, String bjdwmc, String
	// zpjf);

	// 暂存报送信息
	// public int tzggZC(String id, String hjmc, String bzsj, String bjdwmc, String
	// zpjf);

	// 删除通告信息
	void delete(String id);

	// 通告通过id查
	MzywTzgg queryByID(String id);

	// 通知公告发布，通过id更新状态
	void updateZtById(String id, String tzggzt);

	// 通知公告暂存
	void tzggZanCun(MzywTzgg mzywTzgg);
	
	// 通知公告更新
	void tzggGX(String tzggbt, String tzggzw,String id);
//上传
	void upload(MzywFjxx mzywFjxx);
	void upload(MzywTzgg mzywTzgg);
//查附件
	MzywFjxx queryByFJID(String ysbxxid);
	
	MzywFjxx queryTFById(String id);
//通过附件id进行更新

	void updateFJGX(MzywFjxx mzywFjxx);
	

}
