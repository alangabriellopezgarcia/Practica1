package mx.edu.tesoem.isc.jagg.a7s21prac1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = findViewById(R.id.txtnombre);


    }
    public  void llamarpantalla(View View){
        String nombre = txtnombre.getText().toString();
        Intent intent = new Intent(this,pantalla2Activity.class);
        intent.putExtra( "Nombre",nombre);
        startActivity(intent);

    }
}