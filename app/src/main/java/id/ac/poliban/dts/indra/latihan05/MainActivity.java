package id.ac.poliban.dts.indra.latihan05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAjax = findViewById(R.id.btAjax);
        Button btRealMadrid = findViewById(R.id.btRealMadrid);
        Button btFiorentina = findViewById(R.id.btFiorentina);

        btAjax.setOnClickListener(v -> Toast.makeText(this, "Hai ajax", Toast.LENGTH_SHORT).show());
        btRealMadrid.setOnClickListener(v -> Toast.makeText(this, "Hai Real Madrid", Toast.LENGTH_SHORT).show());
        btFiorentina.setOnClickListener(v -> Toast.makeText(this, "Hai Fiorentina", Toast.LENGTH_SHORT).show());

    }
}
