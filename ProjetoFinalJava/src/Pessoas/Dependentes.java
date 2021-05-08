package Pessoas;

import java.time.LocalDate;

public class Dependentes extends Pessoa{
		String parentesco;
		
	public Dependentes(String nome, String cpf, LocalDate dataNasc, String parentesco) {
		super(nome, cpf, dataNasc);
		this.parentesco = parentesco;
	}

}
