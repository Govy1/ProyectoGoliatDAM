package proyecto.goliat.vistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import proyecto.goliat.entidades.Producto;
import proyecto.goliat.R;
import proyecto.goliat.adaptadores.AdaptadorGolosinas;

public class ListGolosinas extends AppCompatActivity {
    ArrayList<Producto> listGolosinas;
    RecyclerView reciclerGolosinas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_golosinas);
        listGolosinas = new ArrayList<>();
        reciclerGolosinas = findViewById(R.id.reciclerGolosinas);
        reciclerGolosinas.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        llenarProductos();

        AdaptadorGolosinas adapter = new AdaptadorGolosinas(listGolosinas);
        reciclerGolosinas.setAdapter(adapter);
    }
    private void llenarProductos() {
        listGolosinas.add(new Producto("Rellenitas (Chocolate)", "S/.0.60", R.drawable.logo_cuadrado));
        listGolosinas.add(new Producto("Rellenitas (Menta)", "S/.0.60", R.drawable.logo_cuadrado));
        listGolosinas.add(new Producto("Rellenitas (Fresa)", "S/.0.60", R.drawable.logo_cuadrado));
        listGolosinas.add(new Producto("Rellenitas (Coco)", "S/.0.60", R.drawable.logo_cuadrado));
        //listGolosinas.add(new Producto("manzanas", "$3.99", R.drawable.logo_cuadrado));
       // listGolosinas.add(new Producto("manzanas", "$3.99", R.drawable.logo_cuadrado));
       // listGolosinas.add(new Producto("manzanas", "$3.99", R.drawable.logo_cuadrado));
    }
}
