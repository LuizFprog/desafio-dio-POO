package br.com.dio;

import java.time.LocalDate;

import br.com.dio.desafio_dominio.Curso;
import br.com.dio.desafio_dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Curso Java", "Descrição curso java", 8);
		Curso curso2 = new Curso("Curso JavaScript", "Descrição curso javascript", 8);
		
		System.out.println(curso1);
		System.out.println(curso2);

		Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descrição da mentoria java", LocalDate.now());
		Mentoria mentoria2 = new Mentoria("Mentoria JavaScript", "Descrição da mentoria javascript", LocalDate.now());
	}
}
