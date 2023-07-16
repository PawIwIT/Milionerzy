package pl.pawit;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Pytanie {
    public String wyswietlPytanie() throws IOException {
        Scanner sc = new Scanner(System.in);
        Path inputPath = Paths.get("src/main/resources/pytania.txt");
        List<String> lines = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
        int lacznaKwotaWygranej = 0;

        for (int i = 0; i < lines.size(); i++) {
            String[] elementPytania = lines.get(i).split("//");
            for (int j = 0; j < elementPytania.length - 1; j++) {
                System.out.println(elementPytania[j]);
            }

            String wyborUzytkownika = sc.nextLine();
            if (wyborUzytkownika.equalsIgnoreCase(elementPytania[5])) {
                lacznaKwotaWygranej += 500;
                System.out.println("BRAWO");
                System.out.println("masz na koncie " + lacznaKwotaWygranej);
            } else {
                System.out.println("przegrales");
            }
        }

        return null;
    }
}
