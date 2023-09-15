/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.logging.Logger;

/**
 *
 * @author Carolina
 */
public class Persona {
    
    //Atributos
    public String Nombre;
    public int Año_Nacimiento;
    public float Cedula;
    
    
   //Constructor no parametrizado
    public Persona(){}
    

    //Constructos Parametrizado

    public Persona(String Nombre, int Año_Nacimiento, float Cedula) {
        this.Nombre = Nombre;
        this.Año_Nacimiento = Año_Nacimiento;
        this.Cedula = Cedula;
    }
    //setter 

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setAño_Nacimiento(int Año_Nacimiento) {
        this.Año_Nacimiento = Año_Nacimiento;
    }

    
    public void setCedula(float Cedula) {
        this.Cedula = Cedula;
    }

    //getter

    public String getNombre() {
        return Nombre;
    }

    public int getAño_Nacimiento() {
        return Año_Nacimiento;
    }

    public float getCedula() {
        return Cedula;
    }
   
    
    
    
    
}
