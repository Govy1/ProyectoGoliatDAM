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

public class AdaptadorAbarrotes extends RecyclerView.Adapter<AdaptadorAbarrotes.ViewHolderAbarrotes> {
    ArrayList<Producto> listaAbarrotes;

    public AdaptadorAbarrotes(ArrayList<Producto> listaAbarrotes) {
        this.listaAbarrotes = listaAbarrotes;
    }

    @NonNull
    @Override
    public AdaptadorAbarrotes.ViewHolderAbarrotes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carview_productos_lista,null, false);
        return new AdaptadorAbarrotes.ViewHolderAbarrotes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorAbarrotes.ViewHolderAbarrotes holder, int position) {
        holder.txtnombrep.setText(listaAbarrotes.get(position).getNombre());
        holder.txtpreciop.setText(listaAbarrotes.get(position).getPrecio());
        holder.imgproducto.setImageResource(listaAbarrotes.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listaAbarrotes.size();
    }

    public class ViewHolderAbarrotes extends RecyclerView.ViewHolder {

        TextView txtnombrep, txtpreciop;
        ImageView imgproducto;

        public ViewHolderAbarrotes(@NonNull View itemView) {
            super(itemView);
            txtnombrep = itemView.findViewById(R.id.txtnombreplista);
            txtpreciop = itemView.findViewById(R.id.txtprecioplista);
            imgproducto = itemView.findViewById(R.id.imgproductolista);
        }
    }
}
