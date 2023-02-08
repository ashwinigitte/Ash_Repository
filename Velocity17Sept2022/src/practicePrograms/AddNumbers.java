package practicePrograms;

public class AddNumbers {
	public static void main(String[] args) {
		String s="ab3cd6bg89";
		int digit=0;
		String a="";
		
		for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i))) {
			a=s.substring(i,i+1);
			digit=digit+Integer.parseInt(a);
		}
	}
		System.out.println(digit);
	}

}
