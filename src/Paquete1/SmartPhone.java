/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import java.util.Scanner;

/**
 *
 * @author walter
 */
public class SmartPhone {
    Integer numerotelefonico;
    String correo, nombrededispositivo;
    byte visible,regresar;
    boolean encendido=true;
    Scanner sc = new Scanner (System.in);  
    
    {
    System.out.println("Registre su correo electronico");
    correo = sc.nextLine();
    System.out.println("Registre el nombre del dispositivo");
    nombrededispositivo = sc.nextLine();
    System.out.println("Ingrese el numero telefonico");
    numerotelefonico = sc.nextInt();
    System.out.println("Desea dejar visible el dispositivo?\n"+
            "1. si\n"+
            "2. No");
            visible = sc.nextByte();
        
            if (visible==1){
        System.out.println("El dispositivo se encuentra visible");
                 }
            else{       
       System.out.println("El dispositivo no se encuentra visible");}
        
       System.out.println("Los datos registrados son los siguientes \n"+
               "Correo electronico: "+ correo+ "\n"+
               "Nombre del dispositivo: "+ nombrededispositivo + "\n"+
               "El numero telefonico registrado es el: "+ numerotelefonico + "\n"+
               
                       "El dispositivo se ha encendido");
       
       System.out.println("Presione 1 para regresar al menu anterior de lo contrario 0 para regresar al menu principal");
       regresar = sc.nextByte();
       
       if (regresar ==1){
               CrearDispositivos creardispositivos = new CrearDispositivos ();
       }
       if (regresar==0){
                Menu menu=new Menu();
       }
                      
    }
}