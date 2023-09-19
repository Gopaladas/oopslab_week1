import java.util.*;

public class calc{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("enter the \n 0 for add \n 1 for sub \n 2 for mul\n 3 for div \n 4 for module");
		
		int num = sc.nextInt();
		
		if(num == 0){
			int val = a + b;
			System.out.println("addintion of two numbers : "+val);
		}
		
		else if(num == 1){
			int val = a - b;
			System.out.println("subtraction of two numbers : "+val);
		}
		else if(num == 2){
			int val = a * b;
			System.out.println("multiplication of two numbers : "+val);
		}
		else if(num == 3){
			int val = a / b;
			System.out.println("division of two numbers : "+val);
		}
		else if(num == 4){
			int val = a % b;
			System.out.println("module of two numbers : "+val);
		}
	}
}
