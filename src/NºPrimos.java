import javax.swing.JOptionPane; 

public class N�Primos {

	public static void main(String[] args){
		
		int num, cont=2;
		boolean primo;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un n�mero: "));
		while(cont<=num){
			primo=true;
		for(int i=2; i<=cont/2; i++){
			if(cont%i==0){
				primo=false;
			}
			if(primo==true){
				System.out.println(cont);
				cont=cont+1;
			}
		}
		}
	}
}
