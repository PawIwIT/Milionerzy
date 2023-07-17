package pl.pawit;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Pytanie pytanie = new Pytanie();
        List<Pytanie> listaPytan = new ArrayList<>();
        boolean czyKontynuowac = true;
        Scanner scanner = new Scanner(System.in);

        while (czyKontynuowac) {
            System.out.println("1. Wyswietl pytanie");
            //ekran pytana
            System.out.println("2. Skorzystaj z kola ratunkowego, kliknij X");
            System.out.println("3. Sprawdz laczna pule wygranej");
            System.out.println("4. Rezygnacja z gry");

            int wybranaOpcja = scanner.nextInt();
            switch (wybranaOpcja) {
                case 1 -> pytanie.wyswietlPytanie();
                case 2 -> System.out.println("wybrano 2");
                case 3 -> System.out.println("wybrano 3");
                case 4 -> czyKontynuowac = false;
            }


        }

    }
}