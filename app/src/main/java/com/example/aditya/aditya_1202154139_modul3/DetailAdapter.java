package com.example.aditya.aditya_1202154139_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailAdapter extends RecyclerView.Adapter <DetailAdapter.ViewHolder> {


    private ArrayList<String> arrayListMenu; // untuk Judul
    private ArrayList<String> arrayListsPrice; // untuk Menu
    private ArrayList<Integer> gambar; //untuk gambar
    //Membuat Konstruktor pada Class RecyclerViewAdapter
    DetailAdapter(ArrayList<String> arrayListMenu, ArrayList<String> arrayListsPrice, ArrayList<Integer> Gambar){

        this.arrayListMenu = arrayListMenu;
        this.arrayListsPrice = arrayListsPrice;
        this.gambar = Gambar;
    }



    //ViewHolder  Untuk Menyimpan Referensi Dari View-View
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView menu, price;
        private ImageView gambar;
        private LinearLayout ItemList;

        public ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView

            menu = itemView.findViewById(R.id.title);
            price = itemView.findViewById(R.id.desc);
            gambar = itemView.findViewById(R.id.gambar);
            ItemList = itemView.findViewById(R.id.itemlist);

        }
    }

    @Override

    public DetailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_itemlist, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;

    }

    @Override

    public void onBindViewHolder(final DetailAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String menu = arrayListMenu.get(position);//Mengambil data Merek sesuai dengan posisi yang telah ditentukan
        final String price = arrayListsPrice.get(position);//Mengambil data  deskripsi sesuai dengan posisi yang ditentukan
        final Integer image = gambar.get(position);//Mengambil data gambar sesuai dengan posisi yang ditentukan
        holder.menu.setText(menu);
        holder.price.setText(price);
        holder.gambar.setImageResource(image); // Mengambil gambar sesuai posisi yang ditentukan

        //Membuat Aksi Saat List Ditekan
        //holder adalah dia yang akan mengarahkan ke ITEM tertentu dalam artian Detail Menu

        holder.ItemList.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                String komposisi = " ADITYA EKA SAPUTRA_1202154139_MODUL3 ";
                switch (position){
                    case 0:
                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 1:

                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;

                    case 2:

                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;

                    case 3:

                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 4:

                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;

                    case 5:

                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;

                    case 6:

                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;

                    case 7:

                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;

                    case 8:

                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;

                    case 9:

                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;

                    case 10:

                        intent.putExtra("menu", arrayListMenu.get(position));
                        intent.putExtra("price", arrayListsPrice.get(position));
                        intent.putExtra("image", gambar.get(position));
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                }

            }

        });

    }




    //getItemCount Fungsi ini harus selalu mengembalikan seberapa banyak DetailMenu yang akan ditampilkan di aplikasi
    public int getItemCount() {

        return arrayListMenu.size();

    }

}