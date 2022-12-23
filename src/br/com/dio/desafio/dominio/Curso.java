package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso extends Conteudo{

	private int cargaHoraria;
	
	public Curso() {}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo = " + getTitulo() + ", descricao = " + getDescricao() + ", cargaHoraria = " + cargaHoraria + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cargaHoraria, getDescricao(), getTitulo());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return cargaHoraria == other.cargaHoraria && Objects.equals(getDescricao(), other.getDescricao())
				&& Objects.equals(getTitulo(), other.getTitulo());
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	
}
