package pregunta2;

public class PromocionableFactory {

    public Promocionable crear(String tipo, String... args) throws Exception {
        if (tipo.equals("Celular")) {
            return new Celular(args[0], args[1], Double.parseDouble(args[2]), Double.parseDouble(args[3]), args[4]);
        } else if (tipo.equals("Servicio")) {
            return new Servicio(args[0], args[1], Double.parseDouble(args[2]));
        }
        return null;
    }
}
