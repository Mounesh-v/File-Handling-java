import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CreateFile {
    public static void main(String[] args) throws Exception {
        File file =new File("myFile.txt");
        file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.getName());//Gives File name
        FileWriter fw = new FileWriter(file);
        // fw.write("Hello File Handling");
        // fw.close();

        FileReader fr = new FileReader(file);
        System.out.println(fr.read());

    }
}
