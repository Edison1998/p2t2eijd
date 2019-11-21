package mx.edu.tesoem.isc.eijd.p2t2eijd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agregarColor(View view){
        Intent add = new Intent(this, agregar_col.class);
        startActivity(add);
        finish();
    }

    public void mostrarColor(View view){
        Intent show = new Intent(this, mostrar_col.class);
        startActivity(show);
        finish();
    }
}