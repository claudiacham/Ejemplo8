/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Persona;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
       String Nombre="";
       int Año_Nacimiento=0;
       int Cedula=0;
       int Resultado=0;
       int Año_Actual=2023;
       
       //Creación de objeto
       
       Persona objPersona= new Persona();
       Scanner scan =new Scanner(System.in);
       
        System.out.println("Digite el nombre");
        Nombre=scan.nextLine();
        objPersona.setNombre(Nombre);
        
        System.out.println("Digite el Año de Nacimiento");
        Año_Nacimiento=scan.nextInt();
        objPersona.setAño_Nacimiento(Año_Nacimiento);
        
        System.out.println("digite El numero de documento ");
        Cedula=scan.nextInt();
        objPersona.setCedula(Cedula);
        
        
        //Formula
        Resultado=Año_Actual-objPersona.getAño_Nacimiento();
        
        
        
        
        System.out.println("El nombre es: "+"\t"+objPersona.getNombre());
        
        System.out.println("El numero de documento es: "+"\t"+objPersona.getCedula());
        
        System.out.println("su edad es: "+Resultado);
        
        
        
                
        
        
        
        
        
        
        
        
        
               
       
       
    }
    
}
