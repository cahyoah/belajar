package wkwkw.asek.recycleview;

/**
 * Created by ASUS on 26/08/2017.
 */

public class Makanan {

    private String namaMakanan;
    private  int gambarMakanan;

    public Makanan(String namaMakanan, int gambarMakanan) {
        this.namaMakanan = namaMakanan;
        this.gambarMakanan = gambarMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public int getGambarMakanan() {
        return gambarMakanan;
    }

}

