package proyecto.goliat.conexion;

public class ConexionNube /*implements Response.Listener<JSONObject>,Response.ErrorListener*/ {
    /*Context context;
    RequestQueue MyrequestQueue;

    public ConexionNube(Context context, RequestQueue myrequestQueue) {
        this.context = context;
        MyrequestQueue = myrequestQueue;
    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }

    @Override
    public void onResponse(JSONObject response) {

    }
    public void leerDatosCategoria(){
        String miurl = "http://localhost/Trabajos/Proyecto_Goliat_Android/listproductocategoria.php?dato=3";
        StringRequest = new StringRequest(Request.Method.GET, miurl, new Response.Listener<String>() {
            @Override
            public void onResponse(String cadena) {
                String response = cadena.toString();
                try{
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("bebidas");
                    Producto producto;
                    int n = jsonArray.length();
                    JSONObject p;
                    for (int i=0; i<n; i++){
                        p = (JSONObject) jsonArray.getJSONObject(i);
                        int idproducto = Integer.valueOf(p.getString("idproducto"));
                        String name = p.getString("nombre");
                        String precio = p.getString("precio");
                        producto = new Producto(idproducto, name, precio, R.drawable.logo_cuadrado );
                        ListBebidas.
                    }
                }catch (JSONException e){
                    e.printStackTrace();
                }
            }
        });
    }*/
}
