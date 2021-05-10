package Dados;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Pessoas.Dependentes;
import Pessoas.Funcionarios;

public class Escrita {
	static double  salarioLiquido = 0;
	static double ir = 0;
	static double inss = 0;

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
			BigDecimal bd = new BigDecimal(listaFuncionarios.get(i).getSalarioLiquido()).setScale(2, RoundingMode.HALF_EVEN);
			salarioLiquido = bd.doubleValue();
			bd = new BigDecimal(listaFuncionarios.get(i).getDescontoIR()).setScale(2, RoundingMode.HALF_EVEN);
			ir = bd.doubleValue();
			bd = new BigDecimal(listaFuncionarios.get(i).getDescontoInss()).setScale(2, RoundingMode.HALF_EVEN);
			inss = bd.doubleValue();
			String.format("%.2f",inss);

			linha =listaFuncionarios.get(i).getNome() + ";" + listaFuncionarios.get(i).getCpf() + ";" + String.format("%.2f",ir) + ";" + String.format("%.2f",inss) + ";" + String.format("%.2f",salarioLiquido) + ";" ;
			escritor.append(linha + "\n");
		}
		
		escritor.close();
	}
}
