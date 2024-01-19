package section17.exemples.exemple02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        String path = "src/main/java/section17/exemples/exemple02/in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }finally {
            try {
                if (fr != null || br !=null){
                    fr.close();
                    br.close();
                }
            }catch (IOException ex){
                System.out.println("Error: " + ex.getMessage());
            }

        }

    }
}
