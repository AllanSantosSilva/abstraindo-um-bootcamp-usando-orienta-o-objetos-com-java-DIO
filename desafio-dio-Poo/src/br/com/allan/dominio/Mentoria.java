package br.com.allan.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate data;
	
	

	public Mentoria() {
		
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public double calcularXP() {
		
		return XP_PADRAO * 2;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", data=" + this.getData() + "]";
	}



	

	

	
	
	
	
}
