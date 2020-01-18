package pl.sda.wyscig;

public class WyscigSamochodow {

    private static void ustalWygranyPojazd(Samochod pojazd1, Samochod pojazd2) {
        if (pojazd1.sprawdzPrzebieg() > pojazd2.sprawdzPrzebieg()) {
            System.out.println("wygrało Auto nr 1 - " + pojazd1.getMarka());
        } else if (pojazd2.sprawdzPrzebieg() > pojazd1.sprawdzPrzebieg()) {
            System.out.println("Wygralo Auto 2 - " + pojazd2.getMarka());

        } else {
            System.out.println("Remis");
        }
    }

    public static void main(String[] args) {
        Samochod bmw = new Samochod();
        bmw.setMarka("BMW");
        Samochod fiat = new Samochod();
        fiat.setMarka("Fiat");


        bmw.ustawPredkosc(5.7);
        bmw.jedz();
        fiat.jedz();
        bmw.ustawPredkosc(3.5);
        fiat.jedz();
        bmw.jedz();
        bmw.jedz();
        bmw.jedz();
        fiat.ustawPredkosc(3.3);
        bmw.jedz();
        bmw.jedz();

        System.out.println("Przebieg BMW to " + bmw.sprawdzPrzebieg());
        System.out.println("Przebieg Fiata to " + fiat.sprawdzPrzebieg());

        ustalWygranyPojazd (bmw, fiat );
    }
}

