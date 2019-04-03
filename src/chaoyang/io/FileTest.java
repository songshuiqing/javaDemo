package chaoyang.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		//第一步：
		FileInputStream fis = null;
		
		//第二步：
		try {
			//第四步：
			//File f = new File("E:\\b.txt");
			//fis = new FileInputStream(f);
			
			fis = new FileInputStream("文件.log");
			//public int read() 从此输入流中读取一个数据字节
			//int a = fis.read();
			//System.out.println(a);
			
			
			//调用read方法，将内容放入byte数组中，同时返回字节数，如果返回的是-1，说明已经读完了。
			
			//public int read(byte[] b)  调用read方法，将内容放入byte数组中，同时返回如果因为已经到达文件末尾而没有更多的数据，则返回 -1
			byte[] bArr = new byte[1024];
			
			//int a = fis.read(bArr);
			//System.out.println(a); //字节数
			
			int len = 0;
			StringBuffer sb=new StringBuffer("");
			while((len = fis.read(bArr)) != -1){
				sb.append(new String(bArr,0,len,"utf-8"));
				System.out.println(sb);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			//第三步
			if(fis != null){
				try {
					fis.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
