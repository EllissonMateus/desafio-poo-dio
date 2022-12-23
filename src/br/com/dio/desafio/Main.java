package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descricao curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descricao curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descricao mentoria Java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devEllisson = new Dev();
		devEllisson.setNome("Ellisson");
		devEllisson.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Ellisson " + devEllisson.getConteudosInscritos());
		devEllisson.progredir();
		System.out.println("-------------------------");
		System.out.println("Conteúdos inscritos Ellisson " + devEllisson.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Ellisson " + devEllisson.getConteudosConcluidos());
		devEllisson.progredir();
		System.out.println("Xp:" + devEllisson.calcularXp());
		
		System.out.println("--------------------------------------------------------------------");
		
		Dev devMateus = new Dev();
		devMateus.setNome("Mateus");
		devMateus.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Mateus " + devMateus.getConteudosInscritos());
		devMateus.progredir();
		System.out.println("-------------------------");
		System.out.println("Conteúdos inscritos Mateus " + devMateus.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Mateus " + devMateus.getConteudosConcluidos());
		System.out.println("Xp:" + devMateus.calcularXp());
		
		
		
		
		
		

	}

}
