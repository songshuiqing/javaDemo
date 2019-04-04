package com.java.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 *
 * @date 2019年4月3日 上午9:12:40
 * 
 *  Map集合的遍历
 */
public class Demo {
    
	public static void main(String[] args) {

		Map<String,String> map =new HashMap<String,String>();
		map.put("编程", "java");
		map.put("书籍", "疯狂java");
		map.put("代码", "javaCode");
		
		for (String str : map.keySet()) {
			String st = map.get(str);
			System.out.println(str+"="+st);
		}

	}
}
