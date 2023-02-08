package practicePrograms;

public class ReverseString1 {
	public static void main(String[] args) {
		String s="I Like Automation";
		s=s.replaceAll("\\s", "");
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		
		}
		System.out.print(rev);
	}

}
