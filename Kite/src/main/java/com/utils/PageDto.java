package com.utils;

import java.util.List;

public class PageDto<T> {

	private int pageIndex;//当前页码
	private int pageSize;//分页大小
	private int pageTotal;//总页数
	private List<T> list;//数据
	
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageTotal() {
		return pageTotal;
	}
	/**
	 * 计算总页数
	 * @param totalData 
	 * @param pageSize 
	 */
	public void setPageTotal(int totalData,int pageSize) {
		if(totalData%pageSize ==0){
			pageTotal=totalData/pageSize;
		}else{
			pageTotal=totalData/pageSize+1;
		}
		
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
}
