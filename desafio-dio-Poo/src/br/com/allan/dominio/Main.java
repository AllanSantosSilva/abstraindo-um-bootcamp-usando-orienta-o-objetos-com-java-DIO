package br.com.allan.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		Curso curso2 = new Curso();
		
		curso.setTitulo("JAVA");
		curso.setDescricao("descricao JAVA");
		curso.setCargaHoraria(8);
		
		curso2.setTitulo("C#");
		curso2.setDescricao("descricao C#");
		curso2.setCargaHoraria(7);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("conhecendo java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("java develop");
		bootcamp.setDescricao("descrição do bootcamp");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev = new Dev();
		dev.setNome("dev1");
		dev.inscreverBootcamp(bootcamp);
		dev.progredir();
		dev.calcularTotalXp();
		System.out.println("conteudos inscritos " + dev.getConteudosInscritos());
		System.out.println("conteudos concluidos " + dev.getConteudosConcluidos());
		System.out.println("xp" + dev.calcularTotalXp());
		
		System.out.println("--------------------------------------");
		
		Dev dev2 = new Dev();
		dev2.setNome("dev2");
		dev2.inscreverBootcamp(bootcamp);
		dev2.progredir();
		dev2.calcularTotalXp();
		System.out.println("conteudos inscritos " + dev2.getConteudosInscritos());
		System.out.println("conteudos concluidos " + dev2.getConteudosConcluidos());
		System.out.println("xp" + dev.calcularTotalXp());
		
	}
}
