import java.util.Scanner;

public class Brain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filas = sc.nextInt();
		int col = sc.nextInt();
		boolean c = false;

		String[][] colores = new String[filas][col];

		for(int i=0; i < filas; i++){
			for(int j=0; j < col; j++){
				colores[i][j] = sc.next();
				switch(colores[i][j]){
					case "C":case "M":case "Y": c = true;
					break;
				}
			}
		}

		System.out.println((c)?"#Color":"#Black&White");
	}
}