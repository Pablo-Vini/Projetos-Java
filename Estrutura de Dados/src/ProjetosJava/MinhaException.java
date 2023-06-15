package ProjetosJava;


public class MinhaException{

	public static void main(String[] args){


		int[] numeros = {4, 8, 16, 32, 63, 128};

		int[] denom = {2, 0, 4, 8, 0, 2, 4};

		for (int i=0; i<numeros.length; i++) {
			try {
				
				if(numeros[i] % 2 != 0) {
					//lançar a exception aqui
					throw new DivisaoNaoExata(numeros[i], denom[i]);
				}
				
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
				System.out.println("Aconteceu um erro");
				e.printStackTrace();
			}
		}
	}
}
