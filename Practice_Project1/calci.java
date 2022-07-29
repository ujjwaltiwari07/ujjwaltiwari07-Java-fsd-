package implict;
import java.util.Scanner;

public class calci {
public static void main(String[] args) {
		calci f=new calci();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.print("enter number perform operation");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result;
		
		System.out.println("enter number 1 for add,2nd for div, 3 for mul, 4 for sub");
		int res=sc.nextInt();
		switch(res)
		{
		case 1:
			 result=a+b;
			System.out.println(result);
			break;
		case 2:
			 result=a/b;
			System.out.println(result);
			break;
		case 3:
			 result=a*b;
			System.out.println(result);
			break;
		case 4:
			 result=a-b;
			System.out.println(result);
			break;
			
		case 0:
			System.exit(0);
			
			
			
		}
		
		}
		
		}
		}

