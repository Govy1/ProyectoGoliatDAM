package proyecto.goliat.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import proyecto.goliat.entidades.Producto;
import proyecto.goliat.R;

public class AdaptadorBAlcoholicas extends RecyclerView.Adapter<AdaptadorBAlcoholicas.ViewHolderBAlcoholicas> {
    ArrayList<Producto> listaBAlcoholicas;

    public AdaptadorBAlcoholicas(ArrayList<Producto> listaBAlcoholicas) {
        this.listaBAlcoholicas = listaBAlcoholicas;
    }

    @NonNull
    @Override
    public AdaptadorBAlcoholicas.ViewHolderBAlcoholicas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carview_productos_lista,null, false);
        return new AdaptadorBAlcoholicas.ViewHolderBAlcoholicas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderBAlcoholicas holder, int position) {
        holder.txtnombrep.setText(listaBAlcoholicas.get(position).getNombre());
        holder.txtpreciop.setText(listaBAlcoholicas.get(position).getPrecio());
        holder.imgproducto.setImageResource(listaBAlcoholicas.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaBAlcoholicas.size();
    }

    public class ViewHolderBAlcoholicas extends RecyclerView.ViewHolder {
        TextView txtnombrep, txtpreciop;
        ImageView imgproducto;
        public ViewHolderBAlcoholicas(@NonNull View itemView) {
            super(itemView);
            txtnombrep = itemView.findViewById(R.id.txtnombreplista);
            txtpreciop = itemView.findViewById(R.id.txtprecioplista);
            imgproducto = itemView.findViewById(R.id.imgproductolista);
        }
    }
}
