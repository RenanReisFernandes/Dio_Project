package aplication;

import java.time.LocalDate;

import entities.Course;
import entities.Mentorship;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mentorship mentoria = new Mentorship();
		mentoria.setTitle("Mentoria Java");
		mentoria.setDescription("Mentoria de Java");
		mentoria.setDate(LocalDate.now());
		System.out.println(mentoria);
		
		Course curso = new Course();
		curso.setTitle("Java");
		curso.setDescription("Curso de java");
		curso.setWorkLoad(10);
		System.out.println(curso);

	}

}
