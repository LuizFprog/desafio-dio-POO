package br.com.dio.desafio_dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
	private String nome;
	private String descricao;
	private final LocalDate dataInicio = LocalDate.now();
	private final LocalDate dataFinal = dataInicio.plusDays(45);
	private Set<Dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> listaConteudos = new LinkedHashSet<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public Set<Conteudo> getListaConteudos() {
		return listaConteudos;
	}
	public void setListaConteudos(Set<Conteudo> listaConteudos) {
		this.listaConteudos = listaConteudos;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataFinal, dataInicio, descricao, devsInscritos, listaConteudos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BootCamp other = (BootCamp) obj;
		return Objects.equals(dataFinal, other.dataFinal) && Objects.equals(dataInicio, other.dataInicio)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(devsInscritos, other.devsInscritos)
				&& Objects.equals(listaConteudos, other.listaConteudos) && Objects.equals(nome, other.nome);
	}
	
	
}
