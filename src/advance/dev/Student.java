package advance.dev;

import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	private double averageScore;

	// Constructor, getters, và setters
	public Student() {
		// Khởi tạo mặc định
	}

	// Phương thức nhập thông tin sinh viên từ bàn phím
	public void input(Scanner scanner) {
		System.out.print("Nhập tên: ");
		this.name = scanner.nextLine();
		System.out.print("Nhập tuổi: ");
		this.age = scanner.nextInt();
		scanner.nextLine(); // Consume the newline left-over
		System.out.print("Nhập địa chỉ: ");
		this.address = scanner.nextLine();
		System.out.print("Nhập số điện thoại: ");
		this.phoneNumber = scanner.nextLine();
		System.out.print("Nhập điểm trung bình: ");
		this.averageScore = scanner.nextDouble();
		scanner.nextLine(); // Consume the newline left-over
	}

	// Phương thức in thông tin sinh viên
	public void print() {
		System.out.println("Tên: " + name);
		System.out.println("Tuổi: " + age);
		System.out.println("Địa chỉ: " + address);
		System.out.println("Số điện thoại: " + phoneNumber);
		System.out.println("Điểm trung bình: " + averageScore);
	}
}
