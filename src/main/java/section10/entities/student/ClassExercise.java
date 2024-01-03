package section10.entities.student;

import java.util.Scanner;

public class ClassExercise {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = leia.nextInt();

        Student students[] = new Student[9];

        for (int i = 0; i < n; i++){
            leia.nextLine();
            System.out.printf("\nRent #%d:\n", (i+1));
            System.out.print("Name: ");
            String name = leia.nextLine();
            System.out.print("Email: ");
            String email = leia.nextLine();
            System.out.print("Room: ");
            int room = leia.nextInt();
            System.out.println();

            students[room] = new Student(name, email, room);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < 9; i++){
            if (students[i] != null){
                System.out.println(students[i]);
            }
        }
    }
}
