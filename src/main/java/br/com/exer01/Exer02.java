package br.com.exer01;

public class Exer02 {
	private String nome;
	private String senha;

	public Exer02(String nome, String senha) {
		this.setNome(nome);
		this.setSenha(senha);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	  public String verificaSenha() {
	        if (this.getNome().equalsIgnoreCase(this.getSenha())) {
	            return "Erro Senha Igual ao Nome !";
	        } else {
	            return "Confirmado Senha Diferente de Nome";
	        }
	    }
	}
