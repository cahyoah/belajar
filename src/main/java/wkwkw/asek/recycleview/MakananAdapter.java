package wkwkw.asek.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ASUS on 26/08/2017.
 */

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MakananViewHolder> {


    private Context context;
    private ArrayList<Makanan> makanan;

    public MakananAdapter(Context context, ArrayList<Makanan> makanan) {
        this.context = context;
        this.makanan = makanan;
    }


    @Override
    public MakananAdapter.MakananViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MakananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MakananViewHolder holder, int position) {
        holder.namaMakanan.setText(makanan.get(position).getNamaMakanan());
        holder.imgMakanan.setImageResource(makanan.get(position).getGambarMakanan());
    }

    @Override
    public boolean onFailedToRecycleView(MakananViewHolder holder) {
        return super.onFailedToRecycleView(holder);
    }

    @Override
    public int getItemCount() {
        return makanan.size();
    }

    public class MakananViewHolder extends RecyclerView.ViewHolder{
        TextView namaMakanan;
        ImageView imgMakanan;

        public MakananViewHolder(View itemView) {
            super(itemView);
            namaMakanan= (TextView) itemView.findViewById(R.id.txt_nama_makanan);
            imgMakanan = (ImageView) itemView.findViewById(R.id.img_makanan);

        }
    }



}
