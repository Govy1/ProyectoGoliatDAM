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

public class AdaptadorGolosinas extends RecyclerView.Adapter<AdaptadorGolosinas.ViewHolerAdaptadorGolosinas> {
    ArrayList<Producto> listaGolosinas;

    public AdaptadorGolosinas(ArrayList<Producto> listaGolosinas) {
        this.listaGolosinas = listaGolosinas;
    }

    @NonNull
    @Override
    public AdaptadorGolosinas.ViewHolerAdaptadorGolosinas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carview_productos_lista,null, false);
        return new AdaptadorGolosinas.ViewHolerAdaptadorGolosinas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolerAdaptadorGolosinas holder, int position) {
        holder.txtnombrep.setText(listaGolosinas.get(position).getNombre());
        holder.txtpreciop.setText(listaGolosinas.get(position).getPrecio());
        holder.imgproducto.setImageResource(listaGolosinas.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaGolosinas.size();
    }

    public class ViewHolerAdaptadorGolosinas extends RecyclerView.ViewHolder {
        TextView txtnombrep, txtpreciop;
        ImageView imgproducto;
        public ViewHolerAdaptadorGolosinas(@NonNull View itemView) {
            super(itemView);
            txtnombrep = itemView.findViewById(R.id.txtnombreplista);
            txtpreciop = itemView.findViewById(R.id.txtprecioplista);
            imgproducto = itemView.findViewById(R.id.imgproductolista);
        }
    }
}
