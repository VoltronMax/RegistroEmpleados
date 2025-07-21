package Servicioimpl;

import java.util.ArrayList;
import java.util.List;

import Entidad.Empleado;

public class ServicioEmpleado {

    private List<Empleado> listaEmpleados;

    public ServicioEmpleado() {
        listaEmpleados = new ArrayList<>();
    }

    public List<Empleado> agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        return listaEmpleados;
    }

    public List<Empleado> leerEmpleados() {
        return listaEmpleados;
    }

    // Si el id existe dentro de la lista devuelve el índice de la posición dentro de listaEmpleados
    public Integer buscarEmpleado(Integer id){
        for(int i=0; i<listaEmpleados.size();i++){
            if(listaEmpleados.get(i).getIdTrabajador().equals(id)) return i;
        }
        return -1;
    }

    // Return actualizarEmpleadosID() provoca que el método se ejecute en bucle siempre que no exista el empleado.
    public Empleado actualizarEmpleadosID(Empleado empleado, Integer id){
        int indice = buscarEmpleado(id);
        if(indice!=-1){
            listaEmpleados.set(indice,empleado);
            return empleado;
        }
        return null;
    }

    // Return EliminarEmpleadosID() provoca que el método se ejecute en bucle siempre que no exista el empleado.
        public void eliminarEmpleadoID(Integer id){
        int indice = buscarEmpleado(id);
        if(indice !=-1) listaEmpleados.remove(indice);
    }
}
