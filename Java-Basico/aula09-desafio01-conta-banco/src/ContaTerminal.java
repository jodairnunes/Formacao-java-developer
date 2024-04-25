import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        // Criação de um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número de sua Agência: ");
        //Obter pela scanner os valores digitados no terminal
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        double saldo = 100;
        int usuario = 1021;


        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + usuario + " e seu saldo R$" + saldo + " já está disponível para saque");
        
        // Não esqueça de fechar o Scanner
        scanner.close();
    }
}
