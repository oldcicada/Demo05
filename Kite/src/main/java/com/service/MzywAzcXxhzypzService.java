package com.service;

import java.util.List;
import java.util.Map;

import com.po.MzywAzcXxhzypz;

public interface MzywAzcXxhzypzService {

	public List<MzywAzcXxhzypz> queryList(Map<Object, Object> map);

	public int queryListCount(Map<Object, Object> map);

	public MzywAzcXxhzypz queryXqById(String id);

	public void saveXxxx(MzywAzcXxhzypz mzywAzcXxhzypz);

	public void xfByID(String id,String status);

	public void whXxxxById(String id, String pzmc, String xx, String zhxgsj, String zhxgyh);

	public List<String> queryPzmc();

	public String queryZy(String xxmc);

}
