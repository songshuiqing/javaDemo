package com.java.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @date 2019年4月3日 上午9:12:40
 *  Map集合的遍历
 */
public class MapDemo {
    
	public static void main(String[] args) {

		Map<String,String> map =new HashMap<String,String>();
		map.put("编程", "java");
		map.put("书籍", "疯狂java");
		map.put("代码", "javaCode");
		
		//keySet其实是遍历了 2次，一次是转为 Iterator对象，另一次是从 hashMap中取出key所对应的 value
		for (String str : map.keySet()) {
			String st = map.get(str);
			System.out.println(str+"="+st);
		}
		
		//entrySet只是遍历了一次就把 key和 value都放到了 entry中，效率更高
		for (String str : map.keySet()) {
			String st = map.get(str);
			System.out.println("键="+str+"***"+"值="+st);
		}

	}
}
