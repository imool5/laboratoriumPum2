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


       Button Button_Miejsce =findViewById(R.id.Button1);
        Button Button_Lista =findViewById(R.id.Button2);
        final EditText EditText= findViewById((R.id.EditText));
        final TextView TextView= findViewById((R.id.TextView));


        //Button_Miejsce.setOnClickListener();

        Button_Lista.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
               Intent intent = new Intent(MainActivity.this,Main2Activity.class);
               startActivity(intent);
            }
        });

        Button_Miejsce.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
              String zmienna =EditText.getText().toString();
               TextView.setText(zmienna);
            }
        });




    }


    }


