package Servicioimpl;

import java.util.ArrayList;
import java.util.List;

import Entidad.Empleado;

public class ServicioEmpleado {

    private List<Empleado> empleado;

    public ServicioEmpleado() {
        empleado = new ArrayList<>();
    }

    public List<Empleado> agregarEmpleado(Empleado emp) {
        empleado.add(emp);
        return empleado;
    }

    public List<Empleado> leerEmpleados(Empleado emplead) {
        return empleado;
    }

    public Empleado actualizarEmpleadosID(Empleado emplead, Integer id){
        for (int i = 0; i<empleado.size(); i++){
            if (empleado.get(i).getIdTrabajador().equals(id)) {
                empleado.set(i, emplead);
                return empleado.get(i);
            }
        }
        return actualizarEmpleadosID(emplead, id);
    }
    

        public Empleado EliminarEmpleadosID(Integer id){
        for (int i = 0; i<empleado.size(); i++){
            if (empleado.get(i).getIdTrabajador().equals(id)) {
                empleado.remove(i);
                return empleado.get(i);
            }
        }
        return EliminarEmpleadosID(id);
    }
}
