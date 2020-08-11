package proyecto.goliat.vistas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

import proyecto.goliat.MainActivity;
import proyecto.goliat.R;

public class MainRegistro extends AppCompatActivity {
    EditText txtNombreUsuario, txtApellidoUsuario, txtCorreoUsuario, txtClaveUsuario;
    Button btnRegistrarUsuario;
    private DatabaseReference databaseReference;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_registro);
        getSupportActionBar().hide();
        txtNombreUsuario = (EditText) findViewById(R.id.txtNombreUsuario);
        txtApellidoUsuario = (EditText) findViewById(R.id.txtApellidoUsuario);
        txtCorreoUsuario = (EditText) findViewById(R.id.txtCorreoUsuario);
        txtClaveUsuario = (EditText) findViewById(R.id.txtClaveUsuario);
        btnRegistrarUsuario = (Button) findViewById(R.id.btnRegistrarUsuario);
        mAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference();

        btnRegistrarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtNombreUsuario.getText().toString();
                String apellidos = txtApellidoUsuario.getText().toString();
                String correo = txtCorreoUsuario.getText().toString();
                String clave = txtClaveUsuario.getText().toString();
                validarCampos(correo, clave, nombre, apellidos);
            }
        });
    }

    private void validarCampos(final String correo, final String clave, final String nombre, final String apellidos){
        if (!nombre.isEmpty()){
            if (!apellidos.isEmpty()){
                if (!correo.isEmpty()){
                    if (!clave.isEmpty()){
                        if (clave.length()>=6){
                            registrarUsuario(correo, clave, nombre, apellidos);
                        }else{
                            Toast.makeText(getApplicationContext(),"Ingresar Clave mayor a 6",Toast.LENGTH_LONG).show();
                        }
                    }else{
                        Toast.makeText(getApplicationContext(),"El campo clave esta vacio",Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"El campo correo esta vacio",Toast.LENGTH_LONG).show();
                }
            }else{
                Toast.makeText(getApplicationContext(),"El campo apellido esta vacio",Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(getApplicationContext(),"El campo nombre esta vacio",Toast.LENGTH_LONG).show();
        }
    }

    private void registrarUsuario(final String correo, final String clave, final String nombre, final String apellidos){
        mAuth.createUserWithEmailAndPassword(correo, clave).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    String id = mAuth.getCurrentUser().getUid();
                    Map<String,Object> map = new HashMap<>();
                    map.put("correo",correo);
                    map.put("clave",clave);
                    map.put("nombre",nombre);
                    map.put("apellidos",apellidos);
                    databaseReference.child("Usuario2").child(id).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task2) {
                            if (task2.isSuccessful()){
                                Toast.makeText(getApplicationContext(),"Usuario Creado",Toast.LENGTH_LONG).show();
                                startActivity(new Intent(MainRegistro.this, MainActivity.class));
                            }else{
                                Toast.makeText(getApplicationContext(),"Error en Crear",Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            }
        });
    }
}
