package pl.pawit;

import java.util.Arrays;
import java.util.List;

public class Walidator {

    private static final List<String> listaDozwolonychLiter = Arrays.asList("A", "B", "C", "D","a", "b", "c", "d", "kolo");

    //metoda statyczna przyjmujaca w parametrze stringa - zwracajaca boolena // sprawdza to co uzytkownik wspisal jest zgodne z oczekiwaniami


    public static boolean czyOdpmaPopFormat(String litera) {
        return listaDozwolonychLiter.contains(litera);
    }
}