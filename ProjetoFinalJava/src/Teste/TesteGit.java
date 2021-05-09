package Teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dados.Escrita;
import Dados.Leitura;
import Pessoas.Funcionarios;

public class TesteGit {
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
		Escrita.escritaFuncionarios(nomeArquivoSaida, funcionarios);
		
	}
}
