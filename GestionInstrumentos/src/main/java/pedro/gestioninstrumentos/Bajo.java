package pedro.gestioninstrumentos;

/**
 *
 * @author pedro
 */

public class Bajo extends Iinstrumentos {
    
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
         setPrecio(500000);
        return "BAJO - " + color;
    }  

}
