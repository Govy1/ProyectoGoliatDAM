package proyecto.goliat.entidades;

public class Producto {
    private int idproducto;
    private String nombre;
    private String precio;
    private String categoria;
    private int foto;

    public Producto(){
    }

    public Producto(String nombre, String precio, int foto) {
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
    }
    public Producto(int idproducto, String nombre, String precio, int foto) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }
}
