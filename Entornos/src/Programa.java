import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juasan
 */
public class Programa {
    
    public static void main(String[] args){
        System.out.println("VAMOS A JUGAR");
        Scanner scan= new Scanner(System.in);
        boolean jugar = true;
        int adivinar=0;
        
        while(jugar)
        {
            adivinar=1+(int)(10*Math.random());
            System.out.print("Dime un numero del 1 al 10:");
            //System.out.print(adivinar);
            int num=scan.nextInt();
            if(num==adivinar)
                System.out.println("¡Acertaste!:D");
            else
                System.out.println("¡No! era el "+ adivinar);
            if(num<=0)
            {
                System.out.println("Adios...");
                jugar=false;
            }
        }   
        
    }
    
}