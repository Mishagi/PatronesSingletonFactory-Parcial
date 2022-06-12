package pedro.gestioninstrumentos;

/**
 *
 * @author pedro
 */
public class Calcomania {

    private static Calcomania single;
    static public int valor;

    private Calcomania() {
    }

    public static Calcomania getCalcomania() {
        if (single == null) {
            single = new Calcomania();
            valor = 90000;
        } else {
            valor = 0;
        }
        return single;
    }
}
