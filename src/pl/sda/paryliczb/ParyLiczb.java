package pl.sda.paryliczb;

public class ParyLiczb {
    int iloscDopasowan = 0;
    int[][] znalezioneParyLiczb = new int[201][2];

    public void drukujParyLiczbPetlaFor() {

        int[] tablicaLiczb = new int[201];

        for (int i = 0; i < 201; i++) {
            tablicaLiczb[i] = i - 100;
        }
        for (int i = 0; i < tablicaLiczb.length; i++) {
            for (int j = 0; j < tablicaLiczb.length; j++) {
                if (tablicaLiczb[i] + tablicaLiczb[j] == 4) {
                    sprawdzDuplikaty(tablicaLiczb[i], tablicaLiczb[j]);
                }
            }
        }
    }

    private void sprawdzDuplikaty(int Liczba1, int Liczba2) {
        for (int i = 0; i < iloscDopasowan; i++) {
            if ((znalezioneParyLiczb[i][0] == Liczba1
                    && znalezioneParyLiczb[i][1] == Liczba2)
                    ||
                    (znalezioneParyLiczb[i][0] == Liczba2
                            && znalezioneParyLiczb[i][1] == Liczba1)) {
                return;

            }
        }
        znalezioneParyLiczb[iloscDopasowan][0] = Liczba1;
        znalezioneParyLiczb[iloscDopasowan][1] = Liczba2;
        iloscDopasowan++;
        System.out.println(Liczba1 + "    " + Liczba2 + " ilosc dopasowan : " + iloscDopasowan);
        System.out.println();

    }
}

