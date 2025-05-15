package br.com.eaugusto;

public class StudentGrades {
	
	private String studentName;
	
	private double average;
	
	private double grade1;
	private double grade2;
	private double grade3;
	private double grade4;
	
	public String checkStudentStatus() {
		if (this.average < 5) {
			return "Reprovado";
		} else if (this.average < 7) {
			return "Em Recuperação";
		} else {
			return "Aprovado";
		}
	}
	
	public void calculateAverage() {
		double allGrades = this.grade1 + this.grade2 + this.grade3 + this.grade4;
		this.setAverage(allGrades / 4);
	}
	
	private boolean isValidGrade(double grade) {
// Could be reduced to a single return statement, but I want to use IF to practice it;
		if (grade >= 0 && grade <= 10) {
			return true;
		} else {			
			return false;
		}
	}
	
	private void gradeError() {
		System.out.println("A nota deve estar entre 0 e 10.");
	}
	
	private void gradeSuccess(double grade) {
		System.out.println("Nota " + grade + " adicionada ao aluno " + this.studentName + " com sucesso.");
	}
	
	public void setAverage(double average) {
		this.average = average;
	}
	
	public void setStudentName(String studentName) {
		if (studentName.isBlank() || (studentName.length() <= 2)) {
			System.out.println("Por favor digite um nome com pelo menos 3 letras.");
			System.exit(0);
		} else {
			this.studentName = studentName;
		}
	}
	
	public void setGrade1(double grade1) {
		if (isValidGrade(grade1)) {
			this.grade1 = grade1;
			gradeSuccess(grade1);
		} else {
			gradeError();
			System.exit(0);
		}
	}
	
	public void setGrade2(double grade2) {
		if (isValidGrade(grade2)) {
			this.grade2 = grade2;
			gradeSuccess(grade2);
		} else {
			gradeError();
			System.exit(0);
		}
	}
	
	public void setGrade3(double grade3) {
		if (isValidGrade(grade3)) {
			this.grade3 = grade3;
			gradeSuccess(grade3);
		} else {
			gradeError();
			System.exit(0);
		}
	}
	
	public void setGrade4(double grade4) {
		if (isValidGrade(grade4)) {
			this.grade4 = grade4;
			gradeSuccess(grade4);
		} else {
			gradeError();
			System.exit(0);
		}
	}
	
	public double getAverage() {
		return average;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public double getGrade1() {
		return grade1;
	}
	
	public double getGrade2() {
		return grade2;
	}
	
	public double getGrade3() {
		return grade3;
	}
	
	public double getGrade4() {
		return grade4;
	}
}
