package pregunta2;

import java.io.Console;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("A)");
        System.out.println("B)");

        Tienda tiendaCelcom = new Tienda("Celcom");

        System.out.println("D)");
        PromocionableFactory factory = new PromocionableFactory();
        try {
            Promocionable celular = factory.crear("Celular", "CEL01", "Samsung", "1500", "16.5", "1980x1200");
            tiendaCelcom.agregarCelular((Celular) celular);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Promocionable celular = factory.crear("Celular", "CEL02", "Apple", "4000", "14", "3250x2800");
            tiendaCelcom.agregarCelular((Celular) celular);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Promocionable celular = factory.crear("Celular", "CEL03", "Nokia", "800", "5", "300x400");
            tiendaCelcom.agregarCelular((Celular) celular);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Promocionable servicio = factory.crear("Servicio", "SER01", "Cambio de Pantalla", "200");
            tiendaCelcom.agregarServicio((Servicio) servicio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Promocionable servicio = factory.crear("Servicio", "SER02", "Actualizacion de Firmware", "250");
            tiendaCelcom.agregarServicio((Servicio) servicio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Promocionable servicio = factory.crear("Servicio", "SER03", "Migracion de equipo", "50");
            tiendaCelcom.agregarServicio((Servicio) servicio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("C)");
        try {
            Promocionable servicio = factory.crear("Servicio", "SER03", "Migracion de equipo", "60550");
            tiendaCelcom.agregarServicio((Servicio) servicio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("E)");
        Consola consola = Consola.getInstance();
        consola.imprimir(tiendaCelcom);


    }
}
