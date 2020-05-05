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
        //Cambio en el codigo para crear rama
        System.out.println("Bonoloto:");
        Bonoloto b=new Bonoloto();
        b.crearBonoloto();
        b.crearLoteria();
        b.comprobarBonoloto();
    }
}
