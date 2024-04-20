package edu.javadeveloper.primeirasemana;
public class App {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Arthur";
        String segundoNome = "Medeiros";


        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
