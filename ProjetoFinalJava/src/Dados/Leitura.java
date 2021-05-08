package Dados;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Leitura {
	
	public static void leitorPessoas() throws FileNotFoundException {
		BufferedReader leitor = new BufferedReader(new FileReader("./Dados/Funcionários.csv"));
	}
}
