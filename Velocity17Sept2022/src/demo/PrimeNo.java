package demo;

public class PrimeNo {
	public static void main(String[] args) {
		int n=100;
		
		if(n==0||n==1) {
			System.out.println(n+"not a prime number");
			
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%2==0) {
			System.out.println(n+"is not a prime number");
			break;
		}else {
			System.out.println(n+"is a prime number");
			break;
		}
	}

}
}
