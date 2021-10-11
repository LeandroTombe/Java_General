
public class Orden {
    private int id_orden;
    private String nombre;
    private String categoria;
    private String nombre_producto;
    private int cantidad_orden;

    public Orden(int id_orden, String nombre, String categoria, String nombre_producto, int cantidad_orden) {
        this.id_orden = id_orden;
        this.nombre = nombre;
        this.categoria = categoria;
        this.nombre_producto = nombre_producto;
        this.cantidad_orden = cantidad_orden;
    }

    @Override
    public String toString() {
        return "Orden{" + "id_orden=" + id_orden + ", nombre=" + nombre + ", categoria=" + categoria + ", nombre_producto=" + nombre_producto + ", cantidad_orden=" + cantidad_orden + '}';
    }

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCantidad_orden() {
        return cantidad_orden;
    }

    public void setCantidad_orden(int cantidad_orden) {
        this.cantidad_orden = cantidad_orden;
    }
}
