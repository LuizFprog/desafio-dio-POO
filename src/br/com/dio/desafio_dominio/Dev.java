package br.com.dio.desafio_dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudoFinalizados = new LinkedHashSet<>();
	
	public void inscreverBootCamp(BootCamp bootCamp)
	{
		this.conteudoInscritos.addAll(bootCamp.getListaConteudos());
		bootCamp.getDevsInscritos().add(this);
	}
	
	public void progredir()
	{
		Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
		if(conteudo.isPresent())
		{
			this.conteudoFinalizados.add(conteudo.get());
			this.conteudoInscritos.remove(conteudo.get());
		}
		else
		{
			System.err.println("Você não está matriculado em nenhum conteudo");
		}
	}
	
	public double calcularTotalXp()
	{
		return this.conteudoFinalizados.stream().mapToDouble(Conteudo::calcularXp).sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}

	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
	}

	public Set<Conteudo> getConteudoFinalizados() {
		return conteudoFinalizados;
	}

	public void setConteudoFinalizados(Set<Conteudo> conteudoFinalizados) {
		this.conteudoFinalizados = conteudoFinalizados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoFinalizados, conteudoInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoFinalizados, other.conteudoFinalizados)
				&& Objects.equals(conteudoInscritos, other.conteudoInscritos) && Objects.equals(nome, other.nome);
	}
	
	
}
