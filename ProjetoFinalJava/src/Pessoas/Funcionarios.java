package Pessoas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Funcionarios extends Pessoa {
	double salarioBruto;
	List<Dependentes> listaDependentes = new ArrayList<>();

	
	public Funcionarios() {
	}

	public Funcionarios(String nome, String cpf, LocalDate dataNasc, double salarioBruto) {
		super(nome, cpf, dataNasc);
		this.salarioBruto = salarioBruto;

	}

	public Funcionarios(String nome, String cpf, LocalDate dataNasc, double salarioBruto,
			List<Dependentes> listaDependentes) {
		super(nome, cpf, dataNasc);
		this.salarioBruto = salarioBruto;
		this.listaDependentes = listaDependentes;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public List<Dependentes> getListaDependentes() {
		return listaDependentes;
	}

	public void setListaDependentes(List<Dependentes> listaDependentes) {
		this.listaDependentes = listaDependentes;
	}

}
