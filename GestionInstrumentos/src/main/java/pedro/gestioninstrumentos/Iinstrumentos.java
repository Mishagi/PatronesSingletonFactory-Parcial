package pedro.gestioninstrumentos;

/**
 *
 * @author pedro
 */
public abstract class Iinstrumentos {

    private int precio;

    public abstract String afinar();

    public abstract String interpretar();

    public abstract String fabricarInstrumentoMusical();

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
