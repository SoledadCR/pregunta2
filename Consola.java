package pregunta2;

import java.util.List;

public class Consola {

    private static Consola instancia = new Consola();

    private Consola() { }

    public static Consola getInstance() {
        return instancia;
    }

    public void imprimir(Tienda tienda) {
        System.out.println("Informacion de la Tienda:");
        System.out.println("========================");
        System.out.println("Nombre: " + tienda.getNombre());
        System.out.println("Celulares disponibles:");
        List<Celular> celularesRegistrados = tienda.getCelulares();
        for (Celular celular: celularesRegistrados) {
            System.out.println(celular);
        }

        System.out.println("Servicios disponibles:");
        List<Servicio> serviciosRegistrados = tienda.getServicios();
        for (Servicio servicio: serviciosRegistrados) {
            System.out.println(servicio);
        }

        System.out.println("Valor Total: S/ " + tienda.obtenerValorTotal());
    }
}
