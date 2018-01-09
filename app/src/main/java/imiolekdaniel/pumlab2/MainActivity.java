package imiolekdaniel.pumlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.Button1)
    Button Zmiana_miejsca;
    @BindView(R.id.Button2)
    Button Lista_miejsc;
    @BindView(R.id.EditText)
    EditText EditText;
    @BindView(R.id.TextView)
    TextView TextView;
    @BindView(R.id.Ikona)
    ImageView ic;

    @OnClick(R.id.Button1)
    void OnClick(View View) {
        String g = EditText.getText().toString();
        TextView.setText(g);
    }

    @OnClick(R.id.Button2)
    void OnClick2(View View) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        Bundle bundle = new Bundle();
        String enteredText = EditText.getText().toString();
        bundle.putString("Key", enteredText);
        intent.putExtras(bundle);
        startActivity(intent);


        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        Glide.with(MainActivity.this).load(
                "https://s1.kozaczek.pl/2014/12/23/teletubbies-baby-s-3147210b-ggg-R1.jpg").into(ic);

        Intent getData = getIntent();
        Bundle bundle = getIntent().getExtras();


        if (bundle != null) {
            String newcity = bundle.getString("CityName");
            TextView.setText(newcity);
        }


    }


}


