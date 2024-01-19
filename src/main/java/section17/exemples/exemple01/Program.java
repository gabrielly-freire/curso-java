package section17.exemples.exemple01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        String path = "src/main/java/section17/exemples/exemple01/in.txt";

        File file = new File(path);

        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());

        }catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }finally {
            if (sc != null)
                sc.close();
        }

    }
}
