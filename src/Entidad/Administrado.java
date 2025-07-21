package Entidad;
import java.util.Date;

import Interfaz.Reportable;


public class Administrado extends Empleado implements Reportable{

    private String nivelDeAcceso;

    public Administrado(Integer idTrabajador, String nombre, Double salario, Date horario, String nivelDeAcceso) {
        super(idTrabajador, nombre, salario, horario);
        this.nivelDeAcceso = nivelDeAcceso;
    }

    public void setNivelDeAcceso(String nivelDeAcceso) {
        this.nivelDeAcceso = nivelDeAcceso;
    }

    public String getNivelDeAcceso() {
        return nivelDeAcceso;
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + "Esta gestionando recursos");
    }

    public void generarReporte() {
        System.out.println(getNombre() + " Esta generando un reporte");
    }
    
}
