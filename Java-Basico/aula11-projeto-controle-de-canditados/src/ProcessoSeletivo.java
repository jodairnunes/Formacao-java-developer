
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		//imprimirSelecionados();
		//selecaoCandidatos();
		//analizarCanditado(1900.0);
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
		
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarLigando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarLigando = !atendeu;
			if(continuarLigando) {
				tentativasRealizadas++;
			}else {
				System.out.println("CONTATO REALIZADO COM SUCESSO!");
			}
		}while(continuarLigando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
	}
	
	//método auxiliar para gerar um valor booleano aleatório
	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		
		
		System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
		
		for(int i=0; i < candidatos.length; i++) {
			System.out.println((i+1) +  "º" + " Candidato selecionado: " + candidatos[i]);
		}
		
		System.out.println("Forma abreviada de interação: FOR EACH");
		
		for(String candidato: candidatos) {
			System.out.println("Candidato selecionado: " + candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados <= 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candito " + candidato + " Solicitou este valor de salário R$" + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	static void analizarCanditado(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o canditado");
		}else if(salarioBase == salarioPretendido){
			System.out.println("Ligar para o canditado com contra proposta");
		}else {
			System.out.println("Aguardnado o resultado dos demais canditados");
		}
	}
}
