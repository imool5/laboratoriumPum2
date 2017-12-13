package imiolekdaniel.pumlab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Button Button_Miejsce =findViewById(R.id.Button1);
        Button Lista =findViewById(R.id.Button2);
        EditText EditText= findViewById((R.id.EditText));
        TextView TextView= findViewById((R.id.TextView));


        Button_Miejsce.setOnClickListener();

    }
}

