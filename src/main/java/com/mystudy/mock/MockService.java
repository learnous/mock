package com.mystudy.mock;

import java.util.List;
import java.util.Map;

public interface MockService {
	List<Map<String, Object>> getMock();
	void insertMock(Integer param);
}
