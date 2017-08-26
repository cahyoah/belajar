package wkwkw.asek.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    public static String EXTRA_MAKANAN = "extra_makanan";
    private TextView namaMakanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        namaMakanan = (TextView) findViewById(R.id.nama_makanan);
        Makanan makanan = getIntent().getParcelableExtra(EXTRA_MAKANAN);


       namaMakanan.setText(makanan.getNamaMakanan());
    }
}
