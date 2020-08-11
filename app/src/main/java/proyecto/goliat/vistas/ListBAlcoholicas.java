package proyecto.goliat.vistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import proyecto.goliat.entidades.Producto;
import proyecto.goliat.R;
import proyecto.goliat.adaptadores.AdaptadorBAlcoholicas;

public class ListBAlcoholicas extends AppCompatActivity {
    ArrayList<Producto> listBAlcoholicas;
    RecyclerView reciclerBAlcoholicas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_b_alcoholicas);
        listBAlcoholicas = new ArrayList<>();
        reciclerBAlcoholicas = findViewById(R.id.reciclerBAlcoholicas);
        reciclerBAlcoholicas.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        llenarProductos();

        AdaptadorBAlcoholicas adapter = new AdaptadorBAlcoholicas(listBAlcoholicas);
        reciclerBAlcoholicas.setAdapter(adapter);
    }
    private void llenarProductos() {
        listBAlcoholicas.add(new Producto("Pilsen 1 L", "S/.7.00", R.drawable.logo_cuadrado));
        listBAlcoholicas.add(new Producto("Cristal 1 L", "S/.7.00", R.drawable.logo_cuadrado));
        //listBAlcoholicas.add(new Producto("manzanas", "$3.99", R.drawable.logo_cuadrado));
        //listBAlcoholicas.add(new Producto("manzanas", "$3.99", R.drawable.logo_cuadrado));
        //listBAlcoholicas.add(new Producto("manzanas", "$3.99", R.drawable.logo_cuadrado));
        //listBAlcoholicas.add(new Producto("manzanas", "$3.99", R.drawable.logo_cuadrado));
        //listBAlcoholicas.add(new Producto("manzanas", "$3.99", R.drawable.logo_cuadrado));
    }
}
