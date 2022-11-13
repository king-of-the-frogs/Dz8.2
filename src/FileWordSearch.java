import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileWordSearch {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Урок 6. Collections Framework (скачан).txt");
        String[] words = null;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;
        String input = "/[Сс]трад.*/gm";
        int count = 0;
        while ((s = br.readLine()) != null) {
            words = s.split(" ");
            for (String word : words) {
                if (word.equals(input)) {
                    count++;
                }
            }
        }
        if (count != 0) {
            System.out.println(count);
        } else {
            System.out.println("Не найдено");
        }

        fr.close();
    }


}



