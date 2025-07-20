package Entidad;

import java.util.Date;

public abstract class Empleado {
    
    private Integer idTrabajador;
    private String nombre;
    private Double salario;
    private Date horario;

    public Empleado(Integer idTrabajador, String nombre, Double salario, Date horario) {
        this.idTrabajador = idTrabajador;
        this.nombre = nombre;
        this.salario = salario;
        this.horario = horario;
    }

    public Integer getIdTrabajador() {
        return idTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public Date getHorario() {
        return horario;
    }

    public String toString() {
        return "Empleado{" +
                "idTrabajador=" + idTrabajador +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", horario=" + horario +
                '}';
    }

    abstract void trabajar();

}
