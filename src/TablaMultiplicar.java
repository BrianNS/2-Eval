import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args){
		Scanner tec = new Scanner(System.in);
		int n;
		System.out.println("Introduce un n�mero: ");
		n = tec.nextInt();
		System.out.println("tabla del "+n);
		for(int i = 1; i <= 10; i++){
			System.out.println(n+ " * "+i+ " = " +n*i);
		}
	}
}
