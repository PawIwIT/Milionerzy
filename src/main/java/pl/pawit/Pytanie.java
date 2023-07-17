package pl.pawit;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Pytanie {
    int licznikPytan = 0;

    public String wyswietlPytanie() throws IOException {

        Scanner sc = new Scanner(System.in);
        Path inputPath = Paths.get("src/main/resources/pytania.txt");
        List<String> lines = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
        boolean kontynuacja = true;

        while (kontynuacja)
            for (int i = 0; i < lines.size(); i++) {
                String[] elementPytania = lines.get(i).split("//");
                wyswietlPytanieIOdpowiedzi(elementPytania);
                String wyborUzytkownika="";

                boolean wrocDoPytania = true;
                while (wrocDoPytania) {
                    wyborUzytkownika=sc.nextLine();
                    if (Walidator.czyOdpmaPopFormat(wyborUzytkownika)) {
                        wrocDoPytania = false;
                    } else {
                        System.out.println("Niepoprawna forma odpowiedzi: Korzystaj z liter : A,B,C,D");
                    }
                }
                char poprawnaOdp = elementPytania[5].charAt(0);
                if (wyborUzytkownika.equalsIgnoreCase(String.valueOf(elementPytania[5].charAt(0)))) {
                    System.out.println("Brawo to poprawna odpowiedz");
                    licznikPytan++;
                    System.out.println("masz na koncie: " + KwotyEnum.znajdzKwotePoNumerzePytania(licznikPytan));

                } else {
                    System.out.println("przegrales");
                    licznikPytan = 0;
                    kontynuacja = false;
                    break;
                }
            }
        return null;
    }

    private void wyswietlPytanieIOdpowiedzi(String[] elementPytania) {
        for (int j = 0; j < elementPytania.length - 1; j++) {
            System.out.println(elementPytania[j]);
        }
    }
}

