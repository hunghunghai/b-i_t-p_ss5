// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[30];
        int numStudents = 0;

        System.out.println("Nhập điểm của sinh viên (nhập -1 để kết thúc):");

        // Nhập danh sách điểm và đếm số lượng sinh viên
        for (int i = 0; i < grades.length; i++) {
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            if (grade >= 5) {
                numStudents++;
            }
            grades[i] = grade;
        }

        System.out.println("Số lượng sinh viên đã thi đỗ: " + numStudents);
    }
}                                                     