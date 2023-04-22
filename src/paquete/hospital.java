package paquete;

public class hospital {

    private int codigo;
    private String nombre;
    private String telefono;

    public hospital() {
        this.codigo = 0;
        this.nombre = "";
        this.telefono = "";
    }

    public hospital(int codigo, String nombre, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void llenarHospital(int cod, String nom, String tel) {

        this.codigo = cod;
        this.nombre = nom;
        this.telefono = tel;
    }
}
