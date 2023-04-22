package paquete;

public class paciente {
    private int cedula;
    private String nombre;

    public paciente() {
        this.cedula = 0;
        this.nombre = "";
    }

    public paciente(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void llenarPaciente(int ced, String nomP) {
        this.cedula = ced;
        this.nombre = nomP;
    }

}
