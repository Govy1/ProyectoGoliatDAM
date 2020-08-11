package proyecto.goliat.vistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import proyecto.goliat.entidades.Producto;
import proyecto.goliat.R;
import proyecto.goliat.adaptadores.AdaptadorPLimpieza;

public class ListPLimpieza extends AppCompatActivity {
    ArrayList<Producto> listPLimpieza;
    RecyclerView reciclerPLimpieza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_p_limpieza);
        listPLimpieza = new ArrayList<>();
        reciclerPLimpieza = findViewById(R.id.reciclerPLimpieza);
        reciclerPLimpieza.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        llenarProductos();

        AdaptadorPLimpieza adapter = new AdaptadorPLimpieza(listPLimpieza);
        reciclerPLimpieza.setAdapter(adapter);
    }
    private void llenarProductos() {
        listPLimpieza.add(new Producto("Lavavajillas en pasta 800g", "S/.5.00", R.drawable.logo_cuadrado));
        listPLimpieza.add(new Producto("Lejía CLOROX Tradicional Galonera 4000g", "S/.11.50", R.drawable.logo_cuadrado));
        listPLimpieza.add(new Producto("Papel Aluminio BELL'S 16m x 30cm", "S/.6.50", R.drawable.logo_cuadrado));
        listPLimpieza.add(new Producto("Detergente en Polvo BOLIVAR Active Duo 2.6Kg", "S/.27.50", R.drawable.logo_cuadrado));
        listPLimpieza.add(new Producto("Jabón para Ropa BOLIVAR Glicerina Empaque 210g", "S/.2.00", R.drawable.logo_cuadrado));
        listPLimpieza.add(new Producto("Escobilla SCOTCH-BRITE Quitapelusa", "S/.24.90", R.drawable.logo_cuadrado));
        listPLimpieza.add(new Producto("Papel Toalla ELITE Mega Rollo", "S/.6.20", R.drawable.logo_cuadrado));
        listPLimpieza.add(new Producto("Papel Higiénico SUAVE Rindemax 24 un", "S/.21.50", R.drawable.logo_cuadrado));
    }
}
