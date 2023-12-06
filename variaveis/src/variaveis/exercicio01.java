package variaveis;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner leia = new Scanner(System.in);
		 float salario;
		 float abono;
		 System.out.println("Digite o Salário");
		 salario=leia.nextLong();
		 System.out.println("\n seu salario é = " + salario);
		 System.out.println("\n Digite o Abono");
		 abono=leia.nextLong();
		 System.out.println("\n seu abono é = " + abono);
		 
		 float novoSalario= salario + abono;
		 System.out.println(novoSalario);
				 
	}
	
}
