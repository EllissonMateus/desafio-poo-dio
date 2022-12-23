package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria extends Conteudo{

	private LocalDate data;
	
	public Mentoria() {};
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo = " + getTitulo() + ", descricao = " + getDescricao() + ", data = " + data + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, getDescricao(), getTitulo());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mentoria other = (Mentoria) obj;
		return Objects.equals(data, other.data) && Objects.equals(getDescricao(), other.getDescricao())
				&& Objects.equals(getTitulo(), other.getTitulo());
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	
}
