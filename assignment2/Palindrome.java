package week1.assignment2;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343;
		int t,s,rem;
		t=num;
		for (s = 0; num>0; num/=10) {
			rem=num%10;
			s=(s*10)+rem;
			
		}
		if (s==t) {
			System.out.println(t+ " is Palindrome");
			
		} else {
			System.out.println(t+ " is Not Palindrome");

		}
	}

}
