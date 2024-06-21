package advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[10]; // Mảng chứa 10 sinh viên

		// Phương thức nhập thông tin cho 10 sinh viên
		for (int i = 0; i < students.length; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
			students[i] = new Student();
			students[i].input(scanner);
		}

		// Phương thức in thông tin của 10 sinh viên
		System.out.println("Danh sách sinh viên:");
		for (Student student : students) {
			student.print();
		}
	}
}
