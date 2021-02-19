
public class Exemplos {
	public static void main(String[] args) {
		String[] array = { "olá", "olá" };
		System.out.println(array);
		System.out.println(somaDosPares(10));
	}

	public static int somaDosPares(int x) {
		int soma = 0;
		for (int i = 0; i <= x; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
			}
		}
		return soma;	 
	}
}
