package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvSuperHero;
    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSuperHero = findViewById(R.id.rvSuperHero);
        SuperHero hero = new SuperHero("Petruk", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQL3s6Jap-LJdTH5OtE5plhXmu8JfOFPt8Ilq9JL4c7FJ-jiXWW");
        listSuperHero.add(hero);
        hero = new SuperHero("Gareng", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSMEkvUp9OwvFV0KTjIfAxGMqVrD4ACV3jvVTOrKDE3HNYyH5X6");
        listSuperHero.add(hero);
        hero = new SuperHero("Gatotkaca", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTc97V1QtHsBD6X103rRuQQJBYlf2QL-KoxJh7ypWEYNFTzP9HC");
        listSuperHero.add(hero);
        hero = new SuperHero("Werkudara", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQgYSJm1FAQ08i_pnOHMKIDMSf1zFT8WvwfA-aS1SlFDNIKzu");
        listSuperHero.add(hero);
        hero = new SuperHero("Arjuna", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRSj2RfkC9-NpUGe7SoWZpjAqWrk1nbHYuzpY2T_sORFYZ3yET8");
        listSuperHero.add(hero);
        hero = new SuperHero("Bima", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSMEkvUp9OwvFV0KTjIfAxGMqVrD4ACV3jvVTOrKDE3HNYyH5X6");
        listSuperHero.add(hero);
        hero = new SuperHero("Nakula", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQL3s6Jap-LJdTH5OtE5plhXmu8JfOFPt8Ilq9JL4c7FJ-jiXWW");
        listSuperHero.add(hero);
        hero = new SuperHero("Sadewa", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSMEkvUp9OwvFV0KTjIfAxGMqVrD4ACV3jvVTOrKDE3HNYyH5X6");
        listSuperHero.add(hero);

        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);

        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
