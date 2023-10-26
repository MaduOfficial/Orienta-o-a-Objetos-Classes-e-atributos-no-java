package com.madu.poo.classes.e.atributos.exercicios;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Maria";
		livro.anoLancamento = 2015;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Madu";
		
		System.out.println("Nome do livro = " + livro.nome);
	}

}
