package pedro.gestioninstrumentos;

/**
 *
 * @author pedro
 */
public class Afinador {

    private static Afinador single;
    static public int valor;

    private Afinador() {}

    public static Afinador getAfinador() {
        if (single == null) {
            single = new Afinador();
            valor = 40000;
        } else {
            valor = 0;
        }
        return single;
    }
}
