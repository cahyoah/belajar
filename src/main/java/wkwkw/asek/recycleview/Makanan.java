package wkwkw.asek.recycleview;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ASUS on 26/08/2017.
 */

public class Makanan implements Parcelable {

    private String namaMakanan;
    private  int gambarMakanan;

    public Makanan(String namaMakanan, int gambarMakanan) {
        this.namaMakanan = namaMakanan;
        this.gambarMakanan = gambarMakanan;
    }

    protected Makanan(Parcel in) {
        namaMakanan = in.readString();
        gambarMakanan = in.readInt();
    }

    public static final Creator<Makanan> CREATOR = new Creator<Makanan>() {
        @Override
        public Makanan createFromParcel(Parcel in) {
            return new Makanan(in);
        }

        @Override
        public Makanan[] newArray(int size) {
            return new Makanan[size];
        }
    };

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public int getGambarMakanan() {
        return gambarMakanan;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(namaMakanan);
        parcel.writeInt(gambarMakanan);
    }
}

