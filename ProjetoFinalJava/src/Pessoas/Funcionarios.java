package Pessoas;

import java.time.LocalDate;

public class Funcionarios extends Pessoa{
		double salarioBruto;
		
	public Funcionarios(String nome, String cpf, LocalDate dataNasc, double salarioBruto) {
		super(nome, cpf, dataNasc);
		this.salarioBruto = salarioBruto;
	}

}
