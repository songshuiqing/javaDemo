package com.java.cn;

/**
 * @author Administrator
 *
 * @date 2019年4月3日 上午9:56:08
 */
public class StringDemo {
    
	public static void main(String[] args) {
		
		String a = new String("string");
		String b = new String("string");
		String c = "string";
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(c.equals(b));
		System.out.println(c == b);
	}
}
