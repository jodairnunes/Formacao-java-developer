public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double salarioMin = 2500;

        System.out.println(salarioMin);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);

        // constantes
        int numero = 10;
        numero = 15; 
        System.out.println(numero);

        final double CONST_PI = 3.14;
        System.out.println(CONST_PI);
    }
}
