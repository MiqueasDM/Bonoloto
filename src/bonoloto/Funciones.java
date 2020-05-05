/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonoloto;

import java.util.Scanner;

/**
 *
 * @author Miqueas Delgado
 */
public class Funciones {
    public Funciones(){
    }
    public int pedirint(String mensaje){
        int x;
        Scanner teclado=new Scanner(System.in);
        System.out.print(mensaje);
        x=teclado.nextInt();
        return x;
    }
    public String pedirstring(String texto){
        String x;
        Scanner teclado=new Scanner(System.in);
        System.out.print(texto);
        x=teclado.nextLine();
        return x;   
    }
    public float pedirfloat(String mensaje){
        float x;
        Scanner teclado=new Scanner(System.in);
        System.out.print(mensaje);
        x=teclado.nextInt();
        return x;
    }
    
}
