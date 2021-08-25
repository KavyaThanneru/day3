package question14;
import java.util.Scanner;

public class trendynum {
	public static void main(String[] args) {
		int n,a,count=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		a=(n/10)%10;
		while(n!=0)
			n =n/10;
		count++;
	
	if(a%3==0 && count==3)
	{
		System.out.println("Trendy Number");
	}
	else
	{
		System.out.println("Not a Trendy Number");
	}
}

}
