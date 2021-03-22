package Paquete1;

import java.util.Scanner;

/**
 *
 * @author walter
 */
public class Menu {
    
    public static void main(String[] args) {
            
        Scanner entrada=new Scanner (System.in);      
        int numero;
        boolean salir=false;
        
        while (salir != true)
        {
            System.out.println( "---Ecosistema de Dispositivos"+"---\n"+
                    "1. Crear dispositivo\n"+
                    "2. Administrar dispositivos\n"+
                    "3. Acciones con dispositivos\n"+
                    "4. Acciones externas de dispositivos\n"+
                    "5. Cargas masivas\n"+
                    "6. Logs\n"+
                    "0. Salir\n"+
                     "Seleccione la opcion a ejecutar");
           numero = entrada.nextInt();
                   
           switch (numero)
           {
               case 1:
                   CrearDispositivos creardispositivos = new CrearDispositivos ();
                   
                   break;
               case 2:
                   AdministrarDispositivos administrardispositivos = new AdministrarDispositivos ();
                   break;
               case 3:
                   AccionesConDispositivos accionescondispositivos = new AccionesConDispositivos ();
                   break;
               case 4:
                   AccionesExternasdeDispositivos accionesexternasdedispositivos = new AccionesExternasdeDispositivos ();
                   break;
               case 5:
                   CargasMasivas accionesmasivas = new CargasMasivas ();
                   break;
               case 6:
                   Logs logs = new Logs();
                   break;
               case 0:
                   salir=true;
                   break;
            }
                    
                    
        }
        
     
    }
    
    
}
