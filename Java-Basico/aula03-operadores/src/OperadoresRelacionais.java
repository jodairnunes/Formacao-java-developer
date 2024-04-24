public class OperadoresRelacionais {
	public static void main(String[] args) {
		int numero1 = 1;
		int numero2 = 2;

		boolean simNao = numero1 == numero2;
		System.out.println("Numero1 é igual a Numero2? " + simNao);

		simNao = numero1 != numero2;
		System.out.println("Numero1 é diferente de Numero2? " + simNao);

		if(numero1 > numero2) {
			System.out.println("Numero1 é maior que Numero2");
		} if(numero1 < numero2) {
			System.out.println("Numero1 é menor que Numero2");
		}

		String nome1 = "Arthur";
		String nome2 = new String("Arthur");
		System.out.println(nome1.equals(nome2));
	}
}
