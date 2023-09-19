import java.util.*;

public class quadratic{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values a b c ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double d = Math.pow(b,2) - (4*a*c);
		
		if(d>=0){
			double val = Math.sqrt(d);
			double x1 = (-b + val)/(2*a);
			double x2 = (-b - val)/(2*a);
			System.out.println("x1 = "+x1 +"  "+"x2 = "+x2);	
		}
		
		else{
			double val = -b;
			double b1 = 0-d;
			double val1 = Math.sqrt(b1);
			System.out.println("roots are imaginary : "+ val +"+-i"+ val1 +"/2");
		}
	}
}
