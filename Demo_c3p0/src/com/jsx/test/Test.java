package com.jsx.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.jsx.utils.JdbcUtil;

public class Test {
	
	@org.junit.Test
	public void jdbcTest() throws SQLException {
		long start = System.currentTimeMillis();
		for (int i = 1; i <= 20; i++){
			JdbcUtil jdbc = new JdbcUtil();
			String sql = "select * from user";
			List<Map<String, Object>> list = jdbc.findModeResult(sql, null);
			for (int j = 0; j < list.size(); j++) {
				System.out.println(list.get(j));
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("用时：" + (end - start));
	}
	

}
