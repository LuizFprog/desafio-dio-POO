package br.com.dio;

import java.time.LocalDate;

import br.com.dio.desafio_dominio.BootCamp;
import br.com.dio.desafio_dominio.Conteudo;
import br.com.dio.desafio_dominio.Curso;
import br.com.dio.desafio_dominio.Dev;
import br.com.dio.desafio_dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Conteudo curso1 = new Curso("Curso Java", "Descrição curso java", 8);
		Conteudo curso2 = new Curso("Curso JavaScript", "Descrição curso javascript", 4);
		
//		System.out.println(curso1);
//		System.out.println(curso2);

		Conteudo mentoria1 = new Mentoria("Mentoria Java", "Descrição da mentoria java", LocalDate.now());
//		Conteudo mentoria2 = new Mentoria("Mentoria JavaScript", "Descrição da mentoria javascript", LocalDate.now());
		
//		System.out.println(mentoria1);
//		System.out.println(mentoria2);
		
		BootCamp bootCamp = new BootCamp();
		bootCamp.setNome("BootCamp Java");
		bootCamp.setDescricao("Descrição");
		bootCamp.getListaConteudos().add(curso1);
		bootCamp.getListaConteudos().add(curso2);
		bootCamp.getListaConteudos().add(mentoria1);
		
		Dev dev1 = new Dev();
		dev1.setNome("João");
		dev1.inscreverBootCamp(bootCamp);
		System.out.println("Conteudos Inscritos dev1: " + dev1.getConteudoInscritos());
		System.out.println();
		dev1.progredir();
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteudos Inscritos dev1: " + dev1.getConteudoInscritos());
		System.out.println("Conteudos Concluidos dev1: " + dev1.getConteudoFinalizados());
		System.out.println("XP João: " + dev1.calcularTotalXp());
		System.out.println();
		System.out.println();
		
		Dev dev2 = new Dev();
		dev2.setNome("Maria");
		dev2.inscreverBootCamp(bootCamp);
		System.out.println("Conteudos Inscritos dev2: " + dev2.getConteudoInscritos());
		System.out.println();
		dev2.progredir();
		System.out.println("Conteudos Inscritos dev2: " + dev2.getConteudoInscritos());
		System.out.println("Conteudos Concluidos dev2: " + dev2.getConteudoFinalizados());
		System.out.println("XP Maria: " + dev2.calcularTotalXp());
	}
}
