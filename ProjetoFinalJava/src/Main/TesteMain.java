package Main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dados.Escrita;
import Dados.Leitura;
import Pessoas.Funcionarios;

public class TesteMain {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String nomeArquivoEntrada;
		String nomeArquivoSaida;
		
		List<Funcionarios> funcionarios = new ArrayList<>();
		
		boolean continua = true;
		System.out.println("Digite o nome do arquivo de entrada: ");
		nomeArquivoEntrada = scan.nextLine();
		while(continua) {
			try {
				funcionarios = Leitura.leitorPessoas(nomeArquivoEntrada);
				continua = false;
			} catch(FileNotFoundException ex) {
				System.out.println("Arquivo não encontrado. Sugestão: Pessoas.csv.");
				nomeArquivoEntrada = scan.nextLine();
			}
		}
		System.out.println("Digite o nome do arquivo de saída: ");
		nomeArquivoSaida = scan.nextLine();
		
		double testeInss = 0;
		double testeIr = 0;
		double testeSal = 0;
		
		for (int i = 0; i < funcionarios.size(); i++) {
			funcionarios.get(i).addDep();
			testeInss = funcionarios.get(i).calculoINSS();
			testeIr = funcionarios.get(i).calculoIR();
			testeSal = funcionarios.get(i).calculoSalario();
			BigDecimal bd = new BigDecimal(testeSal).setScale(2, RoundingMode.HALF_EVEN);
			testeSal = bd.doubleValue();
		}
		
		Escrita.escritaFuncionarios(nomeArquivoSaida, funcionarios);
		
	}
}
