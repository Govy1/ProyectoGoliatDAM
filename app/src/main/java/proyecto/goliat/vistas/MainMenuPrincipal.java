package proyecto.goliat.vistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import proyecto.goliat.entidades.Producto;
import proyecto.goliat.R;
import proyecto.goliat.adaptadores.AdaptadorCard;

public class MainMenuPrincipal extends AppCompatActivity {
    RecyclerView recyclerProductos;
    ArrayList<Producto> listaProductos;
    //botones
    Button btnabarrotes, btngolosinas, btnbebidas, btnalcohol, btnlimpieza;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_principal);
        btnabarrotes = findViewById(R.id.btnabarrotes);
        btngolosinas = findViewById(R.id.btngolosinas);
        btnbebidas = findViewById(R.id.btnbebidas);
        btnalcohol = findViewById(R.id.btnalcohol);
        btnlimpieza = findViewById(R.id.btnlimpieza);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        Producto p = new Producto("Pilsen 1 L", "S/.7.00", R.drawable.logo_cuadrado);
        databaseReference.child("Contacto").setValue(p);
        //llenarProductosNube();
        //myRef.setValue("Hello, World!");
        //Lista de Productos recientes
        listaProductos = new ArrayList<>();
        recyclerProductos = findViewById(R.id.recicler);
        recyclerProductos.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        llenarProductos();
        AdaptadorCard adapter = new AdaptadorCard(listaProductos);
        recyclerProductos.setAdapter(adapter);

        //ejecucion de botones
        btnabarrotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainMenuPrincipal.this, ListAbarrotes.class);
                startActivity(intent1);
            }
        });
        btngolosinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainMenuPrincipal.this, ListGolosinas.class);
                startActivity(intent2);
            }
        });
        btnbebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainMenuPrincipal.this, ListBebidas.class);
                startActivity(intent3);
            }
        });
        btnalcohol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainMenuPrincipal.this, ListBAlcoholicas.class);
                startActivity(intent4);
            }
        });
        btnlimpieza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(MainMenuPrincipal.this, ListPLimpieza.class);
                startActivity(intent5);
            }
        });
    }
    private void llenarProductos() {
        listaProductos.add(new Producto("Pilsen 1 L", "S/.7.00", R.drawable.logo_cuadrado));
        listaProductos.add(new Producto("Cristal 1 L", "S/.7.00", R.drawable.logo_cuadrado));
        listaProductos.add(new Producto("Sazonadores", "S/.1.00", R.drawable.logo_cuadrado));
        listaProductos.add(new Producto("Lavavajillas en pasta 800g", "S/.5.00", R.drawable.logo_cuadrado));
        listaProductos.add(new Producto("Inca Kola 1.5 L", "S/.5.00", R.drawable.logo_cuadrado));
        listaProductos.add(new Producto("Papel Toalla ELITE Mega Rollo", "S/.6.20", R.drawable.logo_cuadrado));
        listaProductos.add(new Producto("Coca Cola 1.5 L", "S/.5.00", R.drawable.logo_cuadrado));
        listaProductos.add(new Producto("Rellenitas (Fresa)", "S/.0.60", R.drawable.logo_cuadrado));
        listaProductos.add(new Producto("Rellenitas (Coco)", "S/.0.60", R.drawable.logo_cuadrado));
        listaProductos.add(new Producto("Inca Kola 1 L", "S/.3.20", R.drawable.logo_cuadrado));
        listaProductos.add(new Producto("Mermelada", "S/.1.50", R.drawable.logo_cuadrado));
        listaProductos.add(new Producto("Coca Cola 1 L", "S/.3.20", R.drawable.logo_cuadrado));
        listaProductos.add(new Producto("Harina", "S/.0.99", R.drawable.logo_cuadrado));
    }
    private void llenarProductosNube() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        DatabaseReference usersRef = myRef.child("Productos");
        Map<String, Producto> product = new HashMap<>();
        product.put("Pilsen 1 L", new Producto("Pilsen 1 L", "S/.7.00", R.drawable.logo_cuadrado));
        product.put("Cristal 1 L", new Producto("Cristal 1 L", "S/.7.00", R.drawable.logo_cuadrado));
        product.put("Lavavajillas en pasta 800g", new Producto("Lavavajillas en pasta 800g", "S/.5.00", R.drawable.logo_cuadrado));
        product.put("Sazonadores", new Producto("Sazonadores", "S/.1.00", R.drawable.logo_cuadrado));
        product.put("Inca Kola 1,5 L", new Producto("Inca Kola 1.5 L", "S/.5.00", R.drawable.logo_cuadrado));
        product.put("Papel Toalla ELITE Mega Rollo", new Producto("Papel Toalla ELITE Mega Rollo", "S/.6.20", R.drawable.logo_cuadrado));
        product.put("Coca Cola 1,5 L", new Producto("Coca Cola 1.5 L", "S/.5.00", R.drawable.logo_cuadrado));
        product.put("Rellenitas (Fresa)", new Producto("Rellenitas (Fresa)", "S/.0.60", R.drawable.logo_cuadrado));
        product.put("Rellenitas (Coco)", new Producto("Rellenitas (Coco)", "S/.0.60", R.drawable.logo_cuadrado));
        product.put("Inca Kola 1 L", new Producto("Inca Kola 1 L", "S/.3.20", R.drawable.logo_cuadrado));
        product.put("Mermelada", new Producto("Mermelada", "S/.1.50", R.drawable.logo_cuadrado));
        product.put("Coca Cola 1 L", new Producto("Coca Cola 1 L", "S/.3.20", R.drawable.logo_cuadrado));
        product.put("Harina", new Producto("Harina", "S/.0.99", R.drawable.logo_cuadrado));
        usersRef.setValue(product);
    }
}
