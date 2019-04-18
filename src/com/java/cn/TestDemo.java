package com.java.cn;

import java.util.UUID;

/**
 * @author Administrator
 *
 * @date 2019年4月3日 上午9:56:08
 */
public class TestDemo {
    
	public static void main(String[] args) {
		
		String a = new String("string");
		String b = new String("string");
		String c = "string";
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(c.equals(b));
		System.out.println(c == b);
		
		//字符串截取
		String substring = c.substring(0,3);
		System.out.println("子字符串="+substring);
		
		String str = UUID.randomUUID().toString().replaceAll("-", "");
		System.out.println(str);
		
		
	}
	
}
