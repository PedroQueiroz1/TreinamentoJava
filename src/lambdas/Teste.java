package lambdas;

public class Teste {

	public static void exibirMediaNumfloats(float media, float... args) {
	    if (args.length == 2) {
	        float num1 = args[0];
	        float num2 = args[1];
	        System.out.println("Média dos números " + num1 + " e " + num2 
	            + " é igual a: " + media);
	    } else {
	        System.err.println("Erro: número incorreto de argumentos.");
	    }
	}

	public static void main(String[] args) {
		float num1 = 1.0f;
		float num2 = 2.0f;
		float media = (num1 + num2)/2;
		
		exibirMediaNumfloats(media, num1, num2);
	}
}
