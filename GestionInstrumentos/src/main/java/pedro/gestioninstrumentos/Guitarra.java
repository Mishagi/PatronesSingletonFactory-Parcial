package pedro.gestioninstrumentos;

/**
 *
 * @author pedro
 */

public class Guitarra extends Iinstrumentos {

    private String color = "NEGRA";

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
        setPrecio(150000);
        return "GUITARRA - " + color;
    }

}
