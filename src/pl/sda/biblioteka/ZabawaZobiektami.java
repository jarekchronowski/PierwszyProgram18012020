package pl.sda.biblioteka;

public class ZabawaZobiektami {
    public static void main(String()args){

    {
        Ksiazka mojaPierwszaKsiazka = new Ksiazka();
        Ksiazka mojaDrugaKsiazka = new Ksiazka();
        Ksiazka mojaTrzeciaKsiazka = new Ksiazka();
        Ksiazka mojaCzwartaKsiazka = new Ksiazka();

        mojaPierwszaKsiazka.setTytul("Pan Taduesz");
        mojaDrugaKsiazka.setTytul("Ballady i Romansa");
        mojaTrzeciaKsiazka.setTytul("Dziady");
        mojaCzwartaKsiazka.setTytul("W  Pustyni i w puszczy");

        mojaTrzeciaKsiazka.setAutor("Adam Mickiewicz");
        mojaTrzeciaKsiazka.setrokWydania("1822");


        System.out.println(mojaPierwszaKsiazka.getTytul());
        System.out.println(mojaDrugaKsiazka.getTytul());
        System.out.println(mojaTrzeciaKsiazka.getTytul());
        System.out.println(mojaTrzeciaKsiazka.getAutor);


        System.out.println(mojaCzwartaKsiazka.getTytul());

    }

}
