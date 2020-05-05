package bonoloto;

/**
 *
 * @author Miqueas Delgado
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonoloto:");
        Bonoloto b=new Bonoloto();
        b.crearBonoloto();
        b.crearLoteria();
        b.comprobarBonoloto();
    }
}
