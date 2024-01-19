package section17.exemples.exemple03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        String path = "src/main/java/section17/exemples/exemple03/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }


    }
}
