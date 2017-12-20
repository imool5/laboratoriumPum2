package imiolekdaniel.pumlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.Button1)
    Button Zmiana_miejsca;
    @BindView(R.id.Button2)
    Button Lista_miejsc;
    @BindView(R.id.EditText)
    EditText EditText;
    @BindView(R.id.TextView)
    TextView TextView;

    @OnClick(R.id.Button1)
    void OnClick(View View) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);

        startActivity(intent);
    }

   

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);




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


