package b.crozz.floralebox.feature;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.IOException;
import io.particle.android.sdk.utils.Async;

public class InicioActivity extends AppCompatActivity {
    Button boton;
    TextView humedad;
    private Object aDevice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_activity);

        humedad = findViewById(R.id.Humedad);
        humedad.setText("humedad %"+humidity);

        boton = (Button) findViewById(R.id.btn_configuracion);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent conf = new Intent(InicioActivity.this, ConfiguracionActivity.class);
                startActivity(conf);

            }
        });

        Async.executeAsync(490025000851363136363935, new Async.ApiWork<ParticleDevice, Integer>() {

            public Integer callApi(ParticleDevice particleDevice)
                    throws ParticleCloudException, IOException {
                return particleDevice.getVariable("myVariable");
            }        
ParticleCloudSDK.getCloud().logIn("ido@particle.io", "myl33tp4ssw0rd");

    }



    }
