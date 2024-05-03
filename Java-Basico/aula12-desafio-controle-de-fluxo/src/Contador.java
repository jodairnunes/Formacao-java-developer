import java.util.Scanner;

// Definição da classe ParametrosInvalidosException que estende Exception
class ParametrosInvalidosException extends Exception {
    // Construtor que recebe uma mensagem de erro
    public ParametrosInvalidosException(String mensagem) {
        // Chama o construtor da classe Exception passando a mensagem de erro
        super(mensagem);
    }
}

// Classe principal Contador
public class Contador {
    // Método principal main
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura do terminal
        Scanner terminal = new Scanner(System.in);
        
        // Solicita ao usuário que digite o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro");
        // Lê o primeiro parâmetro fornecido pelo usuário
        int parametroUm = terminal.nextInt();
        
        // Solicita ao usuário que digite o segundo parâmetro
        System.out.println("Digite o segundo parâmetro");
        // Lê o segundo parâmetro fornecido pelo usuário
        int parametroDois = terminal.nextInt();
        
        // Tentativa de executar o código
        try {
            // Chamada do método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) { // Captura a exceção ParametrosInvalidosException
            // Imprime a mensagem de erro capturada
            System.out.println(e.getMessage());
        } finally {
            // Fecha o Scanner terminal
            terminal.close();
        }
    }
    
    // Método para contar e imprimir números entre os parâmetros fornecidos
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior ou igual ao segundo
        if (parametroUm >= parametroDois) {
            // Se for, lança uma exceção com a mensagem apropriada
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        // Calcula a quantidade de números entre os parâmetros
        int contagem = parametroDois - parametroUm;
        
        // Loop para imprimir os números entre os parâmetros
        for (int i = 1; i <= contagem; i++) {
            // Imprime o número atual
            System.out.println("Imprimindo o número " + i);
        }
    }
}
