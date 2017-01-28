package guvi;
import java.util.Scanner;
class name
{
	private int m,n;
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		m = sc.nextInt();
		n = sc.nextInt();
	}
	public void Lcm()
	{
		int p=m;
		while(m%n!=0)
			m=m+p;
		System.out.println("The Lcm of given twqo numbers is "+m);
	}
}
public class lcm {
  public static void main(String[] args)
  {
	  name n = new name();
	  n.accept();
	  n.Lcm();
	  
  }
}
