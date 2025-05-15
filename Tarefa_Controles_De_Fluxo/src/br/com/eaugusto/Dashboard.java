package br.com.eaugusto;

import java.util.Scanner;

public class Dashboard {
	
	public static void main(String[] args) {
		
		String separator = "------------------------------------------";
		
		Scanner s = new Scanner(System.in);
		
		StudentGrades student1 = new StudentGrades();
		
		System.out.println("Digite o nome do aluno: ");
		String studentName = s.nextLine();
		student1.setStudentName(studentName);
		
		System.out.println("Digite a primeira nota: ");
		double grade1 = s.nextDouble();
		student1.setGrade1(grade1);
		
		System.out.println("Digite a segunda nota: ");
		double grade2 = s.nextDouble();
		student1.setGrade2(grade2);
		
		System.out.println("Digite a terceira nota: ");
		double grade3 = s.nextDouble();
		student1.setGrade3(grade3);

		System.out.println("Digite a quarta nota: ");
		double grade4 = s.nextDouble();
		student1.setGrade4(grade4);
		
		System.out.println(separator);
		System.out.println("Calculando a média...");
		student1.calculateAverage();
		System.out.println(separator);
		
		System.out.println("Aluno: " + student1.getStudentName());
		System.out.println("Média: " + student1.getAverage());
		System.out.println("Status: " + student1.checkStudentStatus());
		
		s.close();
	}
}
