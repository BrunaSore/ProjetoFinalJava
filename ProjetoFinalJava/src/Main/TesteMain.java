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
				System.out.println("Arquivo n�o encontrado. Sugest�o: Pessoas.csv.");
				nomeArquivoEntrada = scan.nextLine();
			}
		}
		System.out.println("Digite o nome do arquivo de sa�da: ");
		nomeArquivoSaida = scan.nextLine();
		
		for (int i = 0; i < funcionarios.size(); i++) {
			funcionarios.get(i).addDep();
			String.format("%.2f",funcionarios.get(i).calculoINSS());
			String.format("%.2f",funcionarios.get(i).calculoIR());
			String.format("%.2f",funcionarios.get(i).calculoSalario());
		}
		
		Escrita.escritaFuncionarios(nomeArquivoSaida, funcionarios);
		
	}
}
