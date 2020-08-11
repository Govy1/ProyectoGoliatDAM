package proyecto.goliat.vistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import proyecto.goliat.entidades.Producto;
import proyecto.goliat.R;
import proyecto.goliat.adaptadores.AdaptadorBebidas;

public class ListBebidas extends AppCompatActivity {
    ArrayList<Producto> listBebidas;
    RecyclerView reciclerBebidas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bebidas);
        listBebidas = new ArrayList<>();
        reciclerBebidas = findViewById(R.id.reciclerBebidas);
        reciclerBebidas.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        llenarProductos();

        AdaptadorBebidas adapter = new AdaptadorBebidas(listBebidas);
        reciclerBebidas.setAdapter(adapter);
    }


    private void llenarProductos() {
        listBebidas.add(new Producto("Inca Kola 296 mL", "S/.1.00", R.drawable.logo_cuadrado));
        listBebidas.add(new Producto("Coca Cola 296 mL", "S/.1.00", R.drawable.logo_cuadrado));
        listBebidas.add(new Producto("Inca Kola 625 mL", "S/.2.50", R.drawable.logo_cuadrado));
        listBebidas.add(new Producto("Coca Cola 625 mL", "S/.2.50", R.drawable.logo_cuadrado));
        listBebidas.add(new Producto("Inca Kola 1 L", "S/.3.20", R.drawable.logo_cuadrado));
        listBebidas.add(new Producto("Coca Cola 1 L", "S/.3.20", R.drawable.logo_cuadrado));
        listBebidas.add(new Producto("Inca Kola 1.5 L", "S/.5.00", R.drawable.logo_cuadrado));
        listBebidas.add(new Producto("Coca Cola 1.5 L", "S/.5.00", R.drawable.logo_cuadrado));
        listBebidas.add(new Producto("Inca Kola 3 L", "S/.10.50", R.drawable.logo_cuadrado));
        listBebidas.add(new Producto("Coca Cola 3 L", "S/.10.50", R.drawable.logo_cuadrado));
    }
}
