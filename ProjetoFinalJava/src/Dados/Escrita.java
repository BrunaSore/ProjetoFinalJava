package Dados;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Escrita {

	public static void escritaFuncionarios() throws IOException {
		String caminhoPadrao = "./src/Arquivos/ArquivosEscrita/";
		String extensao = ".csv";
		Date data = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("_yyyy_MM_dd_HH_mm_ss");
		BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoPadrao + "Funcionario" + formato.format(data) + extensao));
	
		
	}
}
