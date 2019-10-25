package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
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

        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);

        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
