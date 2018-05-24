package com.service;

import java.util.List;
import java.util.Map;

import com.po.MzywAzcBdxx;

public interface MzywAzcBdxxService {

	public List<MzywAzcBdxx> queryListAz(Map<Object, Object> map);

	public int queryListCountAz(Map<Object, Object> map);

	public List<String> querySbdw();

	public List<String> queryXxmc();

	public MzywAzcBdxx queryXqById(String id);

	public void delInfoById(MzywAzcBdxx bdxx);

	public void saveInfo(MzywAzcBdxx mzywAzcBdxx);

	public void submitById(String id);

	public int queryListCountQx(Map<Object, Object> map);

	public List<MzywAzcBdxx> queryListQx(Map<Object, Object> map);

}
