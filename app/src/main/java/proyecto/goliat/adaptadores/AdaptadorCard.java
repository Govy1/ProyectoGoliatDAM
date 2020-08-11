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

public class AdaptadorCard extends RecyclerView.Adapter<AdaptadorCard.ViewHolderProductos> {

    ArrayList<Producto> listaProductos;

    public AdaptadorCard(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @NonNull
    @Override
    public ViewHolderProductos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_productos, null, false);
        return new ViewHolderProductos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderProductos holder, int position) {
        holder.txtnombrep.setText(listaProductos.get(position).getNombre());
        holder.txtpreciop.setText(listaProductos.get(position).getPrecio());
        holder.imgproducto.setImageResource(listaProductos.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listaProductos.size();
    }

    public class ViewHolderProductos extends RecyclerView.ViewHolder {

        TextView txtnombrep, txtpreciop;
        ImageView imgproducto;

        public ViewHolderProductos(@NonNull View itemView) {
            super(itemView);
            txtnombrep = itemView.findViewById(R.id.txtnombrep);
            txtpreciop = itemView.findViewById(R.id.txtpreciop);
            imgproducto = itemView.findViewById(R.id.imgproducto);
        }
    }
}
