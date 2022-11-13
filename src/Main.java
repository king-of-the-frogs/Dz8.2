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


        int num = 1;
        int pum = 2;
        int tum = 3;
        for(int i = 1; i <= 10; ++i) {
            int lol = num * i;
            System.out.printf("%d ",lol);

        }
        System.out.println("\n");
        for(int i = 1; i <= 10; ++i) {
            int kek = pum * i;
            System.out.printf("%d ",kek);

        }
        System.out.println("\n");
        for(int i = 1; i <= 10; ++i) {
            int cheburek = tum * i;
            System.out.printf("%d ",cheburek);
        }
    }
}


