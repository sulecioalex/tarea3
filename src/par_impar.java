import java.util.Scanner;
public class par_impar {
	public static void main(String[] args){ 
		Scanner n=new Scanner(System.in) ;
		System.out.println("introdusca un numero ");
		int numero =n.nextInt();
		if (numero%2==0) System.out.println("par");
		else System.out.println("impar");				
		} 	

}
