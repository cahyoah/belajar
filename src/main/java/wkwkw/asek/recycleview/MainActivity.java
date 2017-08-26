package wkwkw.asek.recycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ImageView imageViewMakanan;
    TextView namaViewMakanan;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewMakanan = (ImageView) findViewById(R.id.img_makanan);
        namaViewMakanan = (TextView) findViewById(R.id.txt_nama_makanan);
        recyclerView = (RecyclerView) findViewById(R.id.rv_makanan);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] namaMakanan = {"bandeng" , "lunpia", "roti brownis", "roti rembulan", "tahu bakso", "wingko"};
        int[] gambarMakanan = {R.mipmap.ic_launcher , R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
        final ArrayList<Makanan> makananArrayList = new ArrayList<>();
        for(int i =0 ; i< namaMakanan.length; i++){
            Makanan makanan = new Makanan( namaMakanan[i], gambarMakanan[i]);
            makananArrayList.add(makanan);
        }

        MakananAdapter makananAdapter = new MakananAdapter(this, makananArrayList);
        recyclerView.setAdapter(makananAdapter);



    }
}
