import java.util.Scanner;

import paquete.hospital;
import paquete.laboratorio;
import paquete.medico;
import paquete.paciente;

public class App {
    private static hospital hop = new hospital();
    private static paciente pac = new paciente();
    private static medico med = new medico();
    private static laboratorio lab = new laboratorio();

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int cod = 0;
        String nom = "";
        String tel = "";
        int codi = 0;
        String fecha = "";
        String tipo = "";
        int ced = 0;
        String nomP = "";
        int reg = 0;
        String espe = "";
        System.out.println("Ingrese los datos del hospital");
        System.out.println("Ingrese codigo: ");
        cod = teclado.nextInt();
        System.out.println("Ingrese el nombre: ");
        nom = teclado.next();
        System.out.println("Ingrese el telefono: ");
        tel = teclado.next();
        hop.llenarHospital(cod, nom, tel);

        System.out.println("Ingrese los datos del Laboratorio");
        System.out.println("Ingrese codigo: ");
        cod = teclado.nextInt();
        System.out.println("Ingrese la fecha: ");
        fecha = teclado.next();
        System.out.println("Ingrese el tipo: ");
        tipo = teclado.next();
        lab.llenarLaboratorio(codi, fecha, tipo);

        System.out.println("Ingrese los datos del Paciente");
        System.out.println("Ingrese la cedula: ");
        ced = teclado.nextInt();
        System.out.println("Ingrese el nombre: ");
        nomP = teclado.next();
        pac.llenarPaciente(ced, nomP);

        System.out.println("Ingrese los datos del Medico");
        System.out.println("Ingrese el registro: ");
        reg = teclado.nextInt();
        System.out.println("Ingrese la especialidad: ");
        espe = teclado.next();
        med.llenarMedico(reg, espe);

        System.out.println("Los datos del hospital son: ");
        System.out.println("CODIGO:  " + hop.getCodigo());
        System.out.println("NOMBRE: " + hop.getNombre());
        System.out.println("TELEFONO: " + hop.getTelefono());

        System.out.println("Los datos del Laboratorio son: ");
        System.out.println("CODIGO:  " + lab.getCodigo());
        System.out.println("FECHA: " + lab.getFecha());
        System.out.println("TIPO: " + lab.getTipo());

        System.out.println("Los datos del Paciente son: ");
        System.out.println("CEDULA:  " + pac.getCedula());
        System.out.println("NOMBRE: " + pac.getNombre());

        System.out.println("Los datos del Medico son: ");
        System.out.println("REGISTRO:  " + med.getRegistro());
        System.out.println("ESPECIALIDAD: " + med.getEspecialidad());

    }
}
