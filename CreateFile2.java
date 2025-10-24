import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CreateFile2 {
    public static void main(String[] args) throws Exception {
        // FileWriter fw =  new FileWriter("buffer.txt");
        // BufferedWriter bw = new BufferedWriter(fw);
        // bw.write("This Buffer File");
        // bw.close();

        FileReader fr = new FileReader("Buffer.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        
    }
}
