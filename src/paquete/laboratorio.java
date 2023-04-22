package paquete;

public class laboratorio {

    private int codigo;
    private String fecha;
    private String tipo;

    public laboratorio() {
        this.codigo = 0;
        this.fecha = "";
        this.tipo = "";
    }

    public laboratorio(int codigo, String fecha, String tipo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void llenarLaboratorio(int codi, String fecha, String tipo) {

        this.codigo = codi;
        this.fecha = fecha;
        this.tipo = tipo;
    }

}
