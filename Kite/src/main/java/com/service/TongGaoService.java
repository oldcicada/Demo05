package com.service;


import java.util.List;
import java.util.Map;

import com.po.MzywTzgg;

public interface TongGaoService {

		List<MzywTzgg> queryList(Map<Object,Object> map);

		int queryListCount(Map<Object,Object> map);
}
