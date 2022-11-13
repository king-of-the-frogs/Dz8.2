import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Урок 6. Collections Framework (скачан).txt");
        int counter = 0;
        String word;

        Scanner sc = new Scanner(file, StandardCharsets.UTF_8);
        while (sc.hasNextLine()) {
            word = sc.nextLine();
            if (word.contains(""))
                counter++;
        }

        System.out.println(counter);


        for(int i = 1; i < 11; i++){
            for(int j = 1; j < 11; j++){
                System.out.print(j * i + "  ");
            }
            System.out.println("");
        }
}
}


