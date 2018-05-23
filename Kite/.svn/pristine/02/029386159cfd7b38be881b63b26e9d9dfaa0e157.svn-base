package com.service;

import com.po.MzywShswcGhjz;
import com.po.MzywShswcMzxx;
import com.po.MzywShswcSzxx;
import com.po.MzywShswcYtwy;
import com.utils.PageDto;

public interface MzywShswcSzxxService {
	/* 逝者信息 start */
	// 获取逝者信息列表
	PageDto<MzywShswcSzxx> queryList(int pageIndex, int pageSize, String szxm, String startDate, String endDate,
			String szsfzhm, String bygmc, String zcbs);

	// 根据id获取逝者信息
	MzywShswcSzxx queryById(String id);

	// 根据id删除逝者信息
	void deleteById(String id);

	// 更新对象信息
	void update(MzywShswcSzxx mzy);

	// 新增对象信息
	void add(MzywShswcSzxx mzy);

	/* 逝者信息 end */
	/* 骨灰江葬 start */
	// 获取骨灰江葬信息列表
	PageDto<MzywShswcGhjz> queryGhjzList(int pageIndex, int pageSize, String szxm, String startDate, String endDate,
			String szsfzhm, String bygmc, String zcbs);

	// 根据id获取骨灰江葬信息
	MzywShswcGhjz queryGhjzById(String id);

	// 根据id删除骨灰江葬信息
	void deleteGhjzById(String id);

	// 更新骨灰江葬对象信息
	void updateGhjz(MzywShswcGhjz mzy);

	// 新增骨灰江葬对象信息
	void addGhjz(MzywShswcGhjz mzy);

	// 更新骨灰江葬信息
	void updateGhjzById(String id, String zcbs, String szsfzhm, String szxm, String szhjd, String jbrsfzhm,
			String jbrxm, String jbrdhhm);

	/* 骨灰江葬 end */
	/* 遗体外运 start */
	// 获取遗体外运信息列表
	PageDto<MzywShswcYtwy> queryYtwyList(int pageIndex, int pageSize, String szxm, String startDate, String endDate,
			String szsfzhm, String bygmc, String zcbs);

	// 根据id获取遗体外运信息
	MzywShswcYtwy queryYtwyById(String id);

	// 根据id删除遗体外运信息
	void deleteYtwyById(String id);

	// 更新遗体外运对象信息
	void updateYtwy(MzywShswcYtwy mzy);

	// 新增遗体外运对象信息
	void addYtwy(MzywShswcYtwy mzy);

	/* 遗体外运 end */
	/* 墓葬信息 start */
	// 获取墓葬信息信息列表
	PageDto<MzywShswcMzxx> queryMzxxList(int pageIndex, int pageSize, String szxm, String startDate, String endDate,
			String szsfzhm, String mxqymc,String zcbs,String zsxz);

	// 根据id获取墓葬信息信息
	MzywShswcMzxx queryMzxxById(String id);

	// 根据id删除墓葬信息信息
	void deleteMzxxById(String id);

	// 更新墓葬信息对象信息
	void updateMzxx(MzywShswcMzxx mzy);

	// 新增墓葬信息对象信息
	void addMzxx(MzywShswcMzxx mzy);
	/* 墓葬信息 end */
}
