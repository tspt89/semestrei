import java.util.Scanner;
public class physicist{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int x = 0;
		int y = 0;
		int z = 0;
		for (int i=0; i<a; i++) {
		
				x+=sc.nextInt();
				
				y+=sc.nextInt();
				
				z+=sc.nextInt();
				
		}
		if(x==0 && y==0 && z==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}