package guvi;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	System.out.println("The reverse of the number "+n+" is");
	while(n!=0)
	{
		int i=n%10;
		System.out.println(""+i);
		n/=10;
	}

	}

}
