package Dados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Pessoas.Dependentes;
import Pessoas.Funcionarios;

public class Leitura {

	public static void leitorPessoas() throws IOException {
		BufferedReader leitor = new BufferedReader(new FileReader("./src/Arquivos/Pessoas.csv"));

		
		String linha = "";
		
		
		List<Funcionarios> listaFuncionarios = new ArrayList<>();
		List<Dependentes> listaDependentes = new ArrayList<>();

		while (true) {
			
			linha = leitor.readLine();
			
			if(linha == null) {
				break;
			}
			if (!linha.isEmpty()) {
				String[] campos = linha.split(";");
				if(campos[3].equalsIgnoreCase("sobrinho") || campos[3].equalsIgnoreCase("filho") || campos[3].equalsIgnoreCase("outros")) {
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyyMMdd");
					LocalDate data = LocalDate.parse(campos[2], formato);
					Dependentes dependente = new Dependentes(campos[0], campos[1], data, campos[3]);
					listaDependentes.add(dependente);
					System.out.println("Dependente: " + dependente.getNome());
					
				} else {
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyyMMdd");
					LocalDate data = LocalDate.parse(campos[2], formato);
					Funcionarios funcionario = new Funcionarios(campos[0], campos[1], data, Double.parseDouble(campos[3]));
					listaFuncionarios.add(funcionario);
					System.out.println("Funcionário: " + funcionario.getNome());
				}
			} 		
		
		}
		leitor.close();
	}

}