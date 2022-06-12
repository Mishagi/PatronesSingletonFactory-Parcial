package pedro.gestioninstrumentos;

/**
 *
 * @author pedro
 */

public class Piano extends Iinstrumentos {

    private String color = "NEGRO";

    @Override
    public String afinar() {
        return "";
    }

    @Override
    public String interpretar() {
        return "";
    }

    @Override
    public String fabricarInstrumentoMusical() {
        setPrecio(750000);
        return "PIANO - " + color;
    }

}
