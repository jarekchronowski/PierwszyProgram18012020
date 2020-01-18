package pl.sda.programowanie;

import java.util.Scanner;

public class KontrolaDostepu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. int);
        System.out.println("Podaj rok urodzenia");
        int biezacyrok = 2020;
        int rokurodzenia = scanner.nextInt();

        if (biezacyrok - rokurodzenia > 18) ;
        {
            System.out.println("Hello");
        }else{
            if (biezacyrok - rokurodzenia = 18) ;
            {
                System.out.println("Podaj miesiąc w formacie 1-12");
                int miesiac = scanner.nextInt();
                if (biezacyMiesiac >= miesiacurodzenia);{
                    System.out.println("Witaj weryfikacja miesiąca poprawna");
                } else {
                    System.out.println("Brak dostępu na poziomie weryfikacji miesiąca");

            } else {
                System.out.println("Brak dostępu");

            }
        }
    }
}