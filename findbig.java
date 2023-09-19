import java.util.*;

public class findbig{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		if(a > b && a > c && a > d && a > e){
			System.out.println(a + "  is greater among all ");
		}
		else if(b > a && b > c && b > d && b > e){
			System.out.println(b + "  is greater among all ");
		}
		else if(c > a && c > b && c > d && c > e){
			System.out.println(c + "  is greater among all ");
		}
		else if(d > a && d > b && d > c && d > e){
			System.out.println(d + "  is greater among all ");
		}
		else if(e > a && e > b && e > c && e > d){
			System.out.println(e + "  is greater among all ");
		}
		
		System.out.println();
		
		if(a < b && a < c && a < d && a < e){
			System.out.println(a + "  is Smaller among all ");
		}
		else if(b < a && b < c && b < d && b < e){
			System.out.println(b + "  is Smaller among all ");
		}
		else if(c < a && c < b && c < d && c < e){
			System.out.println(c + "  is Smaller among all ");
		}
		else if(d < a && d < b && d < c && d < e){
			System.out.println(d + "  is Smaller among all ");
		}
		else if(e < a && e < b && e < c && e < d){
			System.out.println(e + "  is Smaller among all ");
		}
		
	}
}
