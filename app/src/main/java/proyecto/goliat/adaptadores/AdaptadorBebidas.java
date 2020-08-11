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

public class AdaptadorBebidas extends RecyclerView.Adapter<AdaptadorBebidas.ViewHolderBebidas> {
    ArrayList<Producto> listaBebidas;
    public AdaptadorBebidas(ArrayList<Producto> listaBebidas) {
        this.listaBebidas = listaBebidas;
    }
    @NonNull
    @Override
    public AdaptadorBebidas.ViewHolderBebidas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carview_productos_lista,null, false);
        return new AdaptadorBebidas.ViewHolderBebidas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderBebidas holder, int position) {
        holder.txtnombrep.setText(listaBebidas.get(position).getNombre());
        holder.txtpreciop.setText(listaBebidas.get(position).getPrecio());
        holder.imgproducto.setImageResource(listaBebidas.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
            return listaBebidas.size();
    }

    public class ViewHolderBebidas extends RecyclerView.ViewHolder  {
        TextView txtnombrep, txtpreciop;
        ImageView imgproducto;

        public ViewHolderBebidas(@NonNull View itemView) {
            super(itemView);
            txtnombrep = itemView.findViewById(R.id.txtnombreplista);
            txtpreciop = itemView.findViewById(R.id.txtprecioplista);
            imgproducto = itemView.findViewById(R.id.imgproductolista);
        }
    }
}
