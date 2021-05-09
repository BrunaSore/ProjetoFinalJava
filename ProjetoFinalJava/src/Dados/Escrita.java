package Dados;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Pessoas.Dependentes;
import Pessoas.Funcionarios;

public class Escrita {

	public static void escritaFuncionarios(String nomeArquivo, List<Funcionarios> funcionarios) throws IOException {
		String caminhoPadrao = "./src/Arquivos/ArquivosEscrita/";
		String extensao = ".csv";
		Date data = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("_yyyy-MM-dd_HH-mm-ss");
		BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoPadrao + nomeArquivo + formato.format(data) + extensao));
	
		String linha;
		List<Funcionarios> listaFuncionarios = new ArrayList<>();
		listaFuncionarios = funcionarios;
		for (int i = 0; i < listaFuncionarios.size(); i++) {
			//INSERIR PS CAMPOS DE DESCONTO DO IMPOSTO DE RENDA, DESCONTO INSS E SALÁRIO LÍQUIDO 
			linha =listaFuncionarios.get(i).getNome() + ";" + listaFuncionarios.get(i).getCpf() + ";";
			escritor.append(linha + "\n");
		}
		
		escritor.close();
	}
}
