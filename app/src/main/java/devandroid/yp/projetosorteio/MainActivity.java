package devandroid.yp.projetosorteio;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void sortearNumero(View view){

        TextView texto = findViewById(R.id.textoMutante);

        int x = new Random().nextInt(11);

        texto.setText(""+x);
    }

}