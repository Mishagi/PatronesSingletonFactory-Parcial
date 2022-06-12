package pedro.gestioninstrumentos;

/**
 *
 * @author pedro
 */

public class Fabrica {

    public Iinstrumentos getInstrumento(String tipo) {
        if (tipo.toUpperCase().equals("GUITARRA")) {
            return new Guitarra();
        } else {
            if (tipo.toUpperCase().equals("BAJO")) {
                return new Bajo();
            } else {
                if (tipo.toUpperCase().equals("PIANO")) {
                    return new Piano();
                }
            }
        }
        return null;
    }
}
