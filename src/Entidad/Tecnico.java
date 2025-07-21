package Entidad;
import java.util.Date;

import Interfaz.Reportable;

public class Tecnico extends Empleado implements Reportable {

    private String areaEspecialidad;
    public Tecnico(Integer idTrabajador, String nombre, Double salario, Date horario, String areaEspecialidad) {
        super(idTrabajador, nombre, salario, horario);
        this.areaEspecialidad = areaEspecialidad;
    }

    public String getEspecialidad() {
        return areaEspecialidad;
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " está realizando tareas técnicas en su especialidad: " + areaEspecialidad);
    }

    @Override
    public void generarReporte() {
        System.out.println(getNombre() + " está generando un reporte técnico de su trabajo.");
    }
    
}
