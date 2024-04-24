public class OperadoresConcatenacao {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);
             
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        
    }
}
