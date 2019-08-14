import java.util.Scanner;

public class Translation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String wordS = sc.nextLine();
        String wordT = sc.nextLine();
        
        char[] transT = new char[wordT.length()];
        transT = voltea(0, wordT, transT);
        String palabraTrad = new String(transT);
        
        System.out.println(iguales(wordS, palabraTrad));
    }
    
    public static char[] voltea(int i, String entrada, char[] salida){
        if(i >= entrada.length())
            return salida;
        else{
            salida[entrada.length()-1-i] = entrada.charAt(i);
            return voltea(i + 1,entrada,salida);
        }
    }

    public static String iguales(String str1, String str2){
        if(str1.length() == 0 || str2.length() == 0){
            return "YES";
        }
        else if(str1.length() != str2.length()){
            return "NO";
        }
        else{
            char str1Char = str1.charAt(0);
            char str2Char = str2.charAt(0);
            if(str1Char == str2Char){
                String str1Red = str1.substring(1);
                String str2Red = str2.substring(1);
                return iguales(str1Red, str2Red);
            }
            else{
                return "NO";
            }
        }
    }
} 
