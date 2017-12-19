package imiolekdaniel.pumlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button Zmiana_miejsca = findViewById(R.id.Button1);
        Button Lista_miejsc = findViewById(R.id.Button2);
        final EditText EditText = findViewById((R.id.EditText));
        final TextView TextView = findViewById((R.id.TextView));


        Lista_miejsc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        Zmiana_miejsca.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MBundle(EditText, TextView);
            }


        });


    }

    private void MBundle(EditText editText, TextView textView) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        String zmienna = editText.getText().toString();
        textView.setText(zmienna);
        Bundle bundle = new Bundle();
        bundle.putString("item", zmienna);
        intent.putExtras(bundle);
    }


}


