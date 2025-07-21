import Entidad.*;
import Servicioimpl.ServicioEmpleado;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        ServicioEmpleado servicio = new ServicioEmpleado();

        // Crear empleados
        Administrado admin = new Administrado(1, "Laura", 4500.0, new Date(), "Alto");
        Tecnico tecnico = new Tecnico(2, "Carlos", 3500.0, new Date(), "Redes");
        Electricista electricista = new Electricista(3, "Pedro", 3000.0, new Date(), "Certificado Nivel 2");

        // Agregar empleados
        servicio.agregarEmpleado(admin);
        servicio.agregarEmpleado(tecnico);
        servicio.agregarEmpleado(electricista);

        // Leer empleados
        System.out.println("Lista de empleados:");
        for (Empleado e : servicio.leerEmpleados()) {
            System.out.println(e);
        }

        // Probar métodos abstractos e interfaz
        System.out.println("\nDemostración de métodos:");
        admin.trabajar();
        admin.generarReporte();

        tecnico.trabajar();
        tecnico.generarReporte();

        electricista.trabajar();
        electricista.generarReporte();

        // Buscar un empleado por ID
        System.out.println("\nBuscando empleado con ID 2:");
        int indice = servicio.buscarEmpleado(2);
        if (indice != -1) {
            System.out.println("Empleado encontrado: " + servicio.leerEmpleados().get(indice));
        } else {
            System.out.println("Empleado no encontrado.");
        }

        // Actualizar empleado
        Tecnico tecnicoActualizado = new Tecnico(2, "Carlos Mejía", 3800.0, new Date(), "Seguridad");
        Empleado actualizado = servicio.actualizarEmpleadosID(tecnicoActualizado, 2);
        System.out.println("\nEmpleado actualizado: " + actualizado);

        // Eliminar empleado
        servicio.eliminarEmpleadoID(1);
        System.out.println("\nLista de empleados después de eliminar al ID 1:");
        for (Empleado e : servicio.leerEmpleados()) {
            System.out.println(e);
        }
    }
}