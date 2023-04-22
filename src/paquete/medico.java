package paquete;

public class medico {

    private int registro;
    private String especialidad;

    public medico() {
        this.registro = 0;
        this.especialidad = "";
    }

    public medico(int registro, String especialidad) {
        this.registro = registro;
        this.especialidad = especialidad;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void llenarMedico(int reg, String espe) {
        this.registro = reg;
        this.especialidad = espe;
    }

}
