package imiolekdaniel.pumlab2;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import butterknife.OnClick;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.lista)
    TextView listaMiast;

    String newcity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        Bundle passData = getIntent().getExtras();
        String passedText = passData.getString("item");
        listaMiast.setText(passedText);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Gliwice", 21, "Słonecznie"));
        places.add(new Place("Głogówek", 11, "Duże opady deszczu"));
        places.add(new Place("Opole", 18, "Lekkie zachmurzenie"));
        places.add(new Place("Warszawa", 13, "Burze"));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        OnClickPlace listener = (view, position) -> {

            newcity = places.get(position).getPlace_name();
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("CityName", newcity);
            intent.putExtras(bundle);
            startActivity(intent);
        };


        PlaceAdapter placeAdapter = new PlaceAdapter(places, listener);
        recyclerView.setAdapter(placeAdapter);
    }
}