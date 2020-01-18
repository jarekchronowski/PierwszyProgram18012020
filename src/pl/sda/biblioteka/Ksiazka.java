package pl.sda.biblioteka;

public class Ksiazka {
    private String tytul = "brak tytułu";
    private String autor = "brak autora";
    private int rokWydania;

    public void setTytul(String nowyTytul){
        tytul = nowyTytul;
    }
    public String getTytul() {
        return tytul;
    }

    public int setAutor (String nowyAutor){
        if(nowyAutor.length() > 5){
            autor = nowyAutor;
    }else{
            System.out.println("Nazwa autora" + nowyAutor + "za krotko podaj wartosc dluzsza niz 5 znakow");
        }
    public String getAutor() {

    }
        return autor;

    public void setRokWydania(int nowyRokWydania){
        rokWydania = nowyRokWydania;
    }
    public int getRokWydania(){

    }
        return rokWydania;
    }

    public void setrokWydania(String s) {
    }
}
