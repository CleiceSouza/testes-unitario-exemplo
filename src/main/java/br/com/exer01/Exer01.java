package br.com.exer01;

public class Exer01 {
	
	private Double nota;

	
	public Exer01() {
		
	}

	public Exer01(Double nota) {
		this.nota = nota;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	public boolean notaValida() {
		if (nota <0 || nota >10) {
			System.out.println("Nota inválida !");
			return false;
		} else {
			System.out.println("Nota Válida !");
			return true;
		}
		
	}
	
	
	

}
