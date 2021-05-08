package Teste;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Dados.Leitura;
import Pessoas.Dependentes;
import Pessoas.Funcionarios;

public class TesteGit {
	public static void main(String[] args) throws IOException {
		//Como usar a função de leitura
		List<Funcionarios> testeF = new ArrayList<>();
		testeF = Leitura.leitorFuncionario();
		System.out.println(testeF.get(0).getNome());
		
		List<Dependentes> testeD = new ArrayList<>();
		testeD = Leitura.leitorDependente();
		System.out.println(testeD.get(0).getNome());
	}
}
