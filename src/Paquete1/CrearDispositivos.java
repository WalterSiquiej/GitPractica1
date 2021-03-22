
package Paquete1;

import java.util.Scanner;

/**
 *
 * @author walter
 */
public class CrearDispositivos {

        Scanner dispositivo=new Scanner (System.in);      
        int op;
           
       {
         System.out.println( "---Crear Dispositivos"+"---\n"+
                    "1. Computadora Portatil\n"+
                    "2. Tablet\n"+
                    "3. SmartWatch\n"+
                    "4. SmartPhone\n"+
                    "5. Auriculares\n"+
                    "0. Regresar\n"+
                     "Seleccione la opcion a ejecutar");
           op = dispositivo.nextInt();
                   
           switch (op)
           {
               case 1:
                   Computadora computadora= new Computadora ();
                   break;
               case 2:
                   Tablet tamblet = new Tablet ();
                   break;
               case 3:
                   SmartWatch smartwatch = new SmartWatch ();
                   break;
               case 4:
                   SmartPhone smartphone = new SmartPhone ();
                   break;
               case 5:
                   Auriculares auriculares = new Auriculares ();
                   break;
               case 0:
                   Menu menu=new Menu();
                   break;
           }
        }
}

