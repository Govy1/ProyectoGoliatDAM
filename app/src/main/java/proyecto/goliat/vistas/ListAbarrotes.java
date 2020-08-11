package proyecto.goliat.vistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import proyecto.goliat.entidades.Producto;
import proyecto.goliat.R;
import proyecto.goliat.adaptadores.AdaptadorAbarrotes;

public class ListAbarrotes extends AppCompatActivity {
    ArrayList<Producto> listAbarrotes;
    RecyclerView reciclerAbarrotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_abarrotes);
        listAbarrotes = new ArrayList<>();
        reciclerAbarrotes = findViewById(R.id.reciclerAbarrotes);
        reciclerAbarrotes.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        llenarProductos();

        AdaptadorAbarrotes adapter = new AdaptadorAbarrotes(listAbarrotes);
        reciclerAbarrotes.setAdapter(adapter);
    }


    private void llenarProductos() {
        listAbarrotes.add(new Producto("Avena", "S/.1.00", R.drawable.logo_cuadrado));
        listAbarrotes.add(new Producto("Café", "S/.1.50", R.drawable.logo_cuadrado));
        listAbarrotes.add(new Producto("Jabón Moncler 160g", "S/.1.50", R.drawable.logo_cuadrado));
        listAbarrotes.add(new Producto("Harina", "S/.0.99", R.drawable.logo_cuadrado));
        listAbarrotes.add(new Producto("Sazonadores", "S/.1.00", R.drawable.logo_cuadrado));
        listAbarrotes.add(new Producto("Mermelada", "S/.1.50", R.drawable.logo_cuadrado));
        listAbarrotes.add(new Producto("Mayonesa", "S/.1.00", R.drawable.logo_cuadrado));
    }
}
