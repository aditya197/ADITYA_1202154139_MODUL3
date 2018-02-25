package com.example.aditya.aditya_1202154139_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DetailAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Menu;
    private ArrayList<String> Price;
    private ArrayList<Integer> Gambar;

    //array menu

    private String[] menu = {"Aqua", "Equil", "Club", "Cleo", "Le Minerale", "Pristine", "Ades","Evian",
            "Nestle","Vit"};

    //array Price ( Disini adalah detail Penjelasan dari Menu )

    private String[] price = {"Ini adalah minuman merek Aqua", "Ini adalah minuman merek Equil",
            "Ini adalah minuman merek Club", "Ini adalah minuman merek Cleo",
            "Ini adalah minuman merek Le Minerale", "Ini adalah minuman merek Pristine", "Ini adalah minuman merek Ades",
            "Ini adalah minuman merek Evian", "Ini adalah minuman merek Nestle", "Ini adalah minuman merek Vit"};

    //array gambar (Disini adalah detail gambar yang diambil dari drawable)

    private int[] image = {R.drawable.aqua, R.drawable.equil, R.drawable.club,
            R.drawable.cleo, R.drawable.leminerale,
            R.drawable.pristine,R.drawable.ades,R.drawable.evian,R.drawable.nestle,R.drawable.vit};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Menu = new ArrayList<>();
        Price = new ArrayList<>();
        Gambar = new ArrayList<>();
        recyclerView= findViewById(R.id.recyclerview);
        DaftarItem();



        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        //Layout Manager mengatur tampilan dari komponen di dalam Manifest.
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new DetailAdapter(Menu, Price, Gambar);
        //Memasang Adapter pada RecyclerView
        //sebuah library yang digunakan sebagai tempat untuk menampilkan banyak data, mirip seperti ListView(Daftar data yang ada)
        recyclerView.setAdapter(adapter);
    }



    private void DaftarItem() {
        for (int w=0; w<menu.length; w++){
            Gambar.add(image[w]);
            Menu.add(menu[w]);
            Price.add(price[w]);
        }

    }

}