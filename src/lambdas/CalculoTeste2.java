package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo calculo = (x, y) -> { 
			return x + y;
		};
		
		System.out.println(calculo.executar(2, 3));
	}
}
