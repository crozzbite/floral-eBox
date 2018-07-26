package b.crozz.floralebox.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton;
        Button boton2;


        boton = (Button) findViewById(R.id.btnregistro);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, RegistroActivity.class);
                startActivity(i);

            }
        });

        boton2 = (Button) findViewById(R.id.btningresar);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, InicioActivity.class);
                startActivity(i);

            }
        });

    }

}
