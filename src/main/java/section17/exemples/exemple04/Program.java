package section17.exemples.exemple04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "src/main/java/section17/exemples/exemple04/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }

    }
}
