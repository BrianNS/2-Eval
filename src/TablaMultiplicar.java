import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
		//variables
		int n;
		//Pedir número
		System.out.println("Introduce un número: ");
		n = tec.nextInt();
		
		//Calcular la multiplicación
		System.out.println("tabla del "+n);
		for(int i = 1; i <= 10; i++){
			System.out.println(n+ " * "+i+ " = " +n*i);
		}
	}
}
