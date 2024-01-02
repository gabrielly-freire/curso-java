package section08.entities.student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String name = leia.nextLine();
        double grade1 = leia.nextDouble();
        double grade2 = leia.nextDouble();
        double grade3 = leia.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);

        double finalGrade =  student.finalGrade();

        System.out.printf("FINAL GRADE = %.2f\n", finalGrade);

        if (finalGrade > 60){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.println("MISSING "+ (60 - finalGrade) + " POINTS");
        }
    }
}
