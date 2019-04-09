package com.java.cn;

/**
 * 
 * @author Administrator
 *
 * @date 2019年4月3日 上午9:12:40
 */
public class Demo {
    
	public static void main(String[] args) {
		String time="2015-12-06 19:04:08";
		//是否以2开头
		boolean startsWith = time.startsWith("2");
		System.out.println(startsWith);
		//是否以08结尾
		boolean endsWith = time.endsWith("08");
		System.out.println(endsWith);
		//去除字符串中的:
		String replace = time.replaceAll(":", "");
		System.out.println(replace);
		//返回指定字符在此字符串中最后一次出现处的索引
		int lastIndexOf = time.lastIndexOf(":");
		System.out.println(lastIndexOf);
	}
}
