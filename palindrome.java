import java.util.*;

public class palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(n!=0){
			int rem = n%10;
			sum = sum*10 + rem;
			n = n/10;
		}
		System.out.println(sum);
		if(temp == sum){
			System.out.println("Palindrome :D");
		}
		else{
			System.out.println("Not palindrome :(");
		}
	}
}
