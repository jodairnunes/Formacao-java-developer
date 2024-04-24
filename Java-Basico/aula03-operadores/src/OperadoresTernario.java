public class OperadoresTernario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int a = 5;
        int b = 6;

        // String resultado1 = "";
        // if(a == b){
        //     resultado1 = "Verdadeiro";
        // }else {
        //     resultado1 = "Falso";
        // }
        // System.out.println(resultado1);

        String resultado2 = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultado2);
        
        int resultado3 = a == b ? 1 : 0;
        System.out.println(resultado3);
    }
}
