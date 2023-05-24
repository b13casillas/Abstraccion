/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraccion;

/**
 *
 * @author mariana
 */
public class Leon{
    
    private String nombre, especie, color;
    private int edad;

    public Leon(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        color="Café";
        especie="Felino";
    }

    public Leon() {
        color="Café";
        especie="Felino";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String comer(){
        return "Estoy Comiendo";
    }
    
    public String dormir(){
        return "Estoy Durmiendo";
    }
    
    public String correr(){
        return "Estoy Corriendo";
    }

    @Override
    public String toString() {
        return "Nombre:"+nombre+"\n Edad:"+edad+"\n Especie:"+especie+"\n Color:"+color;
            
    }
    
    
    
    
}
