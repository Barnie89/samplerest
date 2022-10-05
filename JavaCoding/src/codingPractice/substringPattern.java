package codingPractice;

public class substringPattern {

	public static void main(String[] args) {
		
		String c="123456789";
		//o/p : 123)456(78-9
		String v= c.substring(0,3)+")"+c.substring(3,6)+"("+c.substring(6,8)+"-"+c.substring(8,9);
		System.out.println(v);
		

	}

}
