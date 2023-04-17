package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		
		//Polimorfismo
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 3)); // 5
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 3)); // 6
		
	}
}
