package practicePrograms;

public class SeparateSpecialChar {
	public static void main(String[] args) {
		String s="as#jk123@";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(s);
	}

}
