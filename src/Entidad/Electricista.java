package Entidad;
import java.util.Date;

import Interfaz.Reportable;

public class Electricista extends Empleado implements Reportable {

    private String certificadoElectrico;
    public Electricista(Integer idTrabajador, String nombre, Double salario, Date horario, String certificadoElectrico) {
        super(idTrabajador, nombre, salario, horario);
        this.certificadoElectrico = certificadoElectrico;
    }

    public String getCertificadoElectrico() {
        return certificadoElectrico;
    }

    @Override
    public void generarReporte() {
        System.out.println(getNombre() + " está realizando trabajos eléctricos");
    }

    @Override
    void trabajar() {
        System.out.println("El electricista " + getNombre() + " atiende al llamado");
    }
    
}
