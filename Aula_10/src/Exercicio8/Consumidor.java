package Exercicio8;

/**
 * 
 * @author João Victor Telles Gementi - RA:81616650 - Turma:SIN3AN-MCA
 * 			
 *
 */

public class Consumidor {
	private NoticiarioAssina noticiario;
	private String nome;
	public Consumidor(String nome,NoticiarioAssina noticiario) {
		this.noticiario = noticiario;
		this.nome = nome;
		this.noticiario.inscrever(this);
	}
	public void update() {
		System.out.println(nome+" recebeu noticia: "+noticiario.getNoticia().toString());
	}
	
	public String getNome() {
		return this.nome;
	}

}
