package Condicionais;


import java.util.Scanner;
public class exercicio01 {

	public static void main(String[] args) {
		int A;
		int B;
		int C;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A");
		A = leia.nextInt();
		
		System.out.println("Digite o número B");
		B = leia.nextInt();
		
		System.out.println("Digite o número C");
		C = leia.nextInt();
		
		if(A+B>C) {
			System.out.println("A soma de A + B é maior do que C");
			
			if (A +B ==C) {
				System.out.println(" A Soma de A + B é igual a C");
			}
			
			if (A+B<C) {
				System.out.println(" A Soma de A + B é menor a C");
				
			}
			
			
			
		}
	}

}
