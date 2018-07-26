package b.crozz.floralebox.feature;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RegistroActivity extends AppCompatActivity {

    Button boton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_activity);

        boton2 = (Button) findViewById(R.id.btnregresar_registro);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent y = new Intent(RegistroActivity.this, MainActivity.class);
                startActivity(y);

            }
        });
    }
}