package chaoyang.io;

public class TryDemo {
   
	public static void main(String[] args) {
		try {
			Integer str= 7/8;
			System.out.println(str);
            
		} catch (Exception e) {
			System.out.println("哈哈");
		}finally {
			System.out.println("嘿嘿");
		}
	}
}
