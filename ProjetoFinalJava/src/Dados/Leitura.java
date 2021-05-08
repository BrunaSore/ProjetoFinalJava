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
	
	public static List<Funcionarios> leitorFuncionario() throws IOException {
		BufferedReader leitor = new BufferedReader(new FileReader("./src/Arquivos/Funcionários.csv"));

		String linha = "";
		List<Funcionarios> listaFuncionarios = new ArrayList<>();
		
		while(true) {
			
			linha = leitor.readLine();

			if(linha != null) {
				String [] campos = linha.split(";");
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate data = LocalDate.parse(campos[2], formato);
				Funcionarios funcionario = new Funcionarios(campos[0], campos[1], data, Double.parseDouble(campos[3]));
				listaFuncionarios.add(funcionario);
			}else {
				break;
			}
		}
	leitor.close();
	return listaFuncionarios;
	}
	
	public static List<Dependentes> leitorDependente() throws IOException {
		BufferedReader leitor = new BufferedReader(new FileReader("./src/Arquivos/Dependentes.csv"));

		String linha = "";
		List<Dependentes> listaDependentes = new ArrayList<>();
		
		while(true) {
			
			linha = leitor.readLine();

			if(linha != null) {
				String [] campos = linha.split(";");
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate data = LocalDate.parse(campos[2], formato);
				Dependentes dependente = new Dependentes(campos[0], campos[1], data, campos[3]);
				listaDependentes.add(dependente);
			}else {
				break;
			}
		}
	leitor.close();
	return listaDependentes;
	}
}
