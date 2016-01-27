
public class Pokemon {
	public static void main(String[] args) {
		// String a codificar
		String frase = "Paco@es@un c1ch4nd4";
		String frase1 = "Paco@es@un";
		String frase2 = " c1ch4nd4";
		String resultado = "";
		for (int i = 0; i < frase1.length(); i++) {
			if (frase1.substring(i, i + 1).contains("@")) {
				resultado = resultado + " ";

			} else {
				resultado += frase1.substring(i, i + 1);
			}

		}

		for (int i = 0; i < frase2.length(); i++) {
			if (frase2.substring(i, i + 1).contains("1")) {
				resultado = resultado + "a";

			} else if (frase2.substring(i, i + 1).contains("4")) {
				resultado = resultado + "o";

			} else {
				resultado += frase2.substring(i, i + 1);
			}

		}
		System.out.println(resultado);

	}

}
