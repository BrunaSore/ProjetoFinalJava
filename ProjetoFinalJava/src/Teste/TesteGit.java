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
		List<Funcionarios> listaFuncionarios = new ArrayList<>();
		List<Dependentes> listaDependentes = new ArrayList<>();
		listaFuncionarios = Leitura.leitorPessoas();
		for (int i = 0; i < listaFuncionarios.size(); i++) {
			System.out.println("Funcionário: " + listaFuncionarios.get(i).getNome());
			listaDependentes = listaFuncionarios.get(i).getListaDependentes();
		for(int j = 0; j < listaDependentes.size(); j++) {
			System.out.println("Dependente: " + listaDependentes.get(j).getNome());

		}
		System.out.println("\n");
		}
	}
}
