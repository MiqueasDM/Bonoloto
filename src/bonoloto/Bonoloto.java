package bonoloto;

/**
 *
 * @author Miqueas Delgado
 */
public class Bonoloto {
    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private int primitiva[] = new int[6];
    private int loteria[] = new int[6];
    private Funciones f= new Funciones();
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Contructores">
    public Bonoloto(){
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Métodos">
    public void crearBonoloto(){
        boolean comprobar=false;
        for(int i=0;i<6;i++){
            int numeros=(int)(Math.random()*49+1);
            for(int e=0;e<6;e++){
                comprobar=false;
                int numero=primitiva[e];
                if(numero==numeros){
                    i--;
                    comprobar=true; 
                    break;
                }
            }
            if(comprobar==false){
                primitiva[i]=numeros;
            }
        }
    }
    public void crearLoteria(){
        boolean comprobar=false;
        for(int i=0;i<6;i++){
            int numeros=f.pedirint("Introduce el numero "+i+" de la bonoloto: ");
            for(int e=0;e<6;e++){
                comprobar=false;
                int numero=loteria[e];
                if(numero==numeros || numeros<0 || numeros>49){
                    i--;
                    comprobar=true; 
                    break;
                }
            }
            if(comprobar==false){
                loteria[i]=numeros;  
            }
        }
    }
    public void comprobarBonoloto(){
        int aciertos=0;
        System.out.print("Bonoloto ganador: ");
        for(int i=0;i<6;i++){
            System.out.print(primitiva[i]+" ");
        }
        System.out.print("\n"+"Su bonoloto es: ");
        for(int e=0;e<6;e++){
            System.out.print(loteria[e]+" ");
        }
        for(int a=0;a<6;a++){ 
            if(primitiva[a]==loteria[a]){
                aciertos++;
            }
        }
        System.out.println("\n"+"Tu numero de aciertos es: "+aciertos);
    }
    // </editor-fold>
}
