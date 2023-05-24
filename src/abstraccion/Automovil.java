/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraccion;

/**
 *
 * @author mariana
 */
public class Automovil {
    private String marca, color, tipo, transmision; 
    private int numPuertas,cilindros;
    private float precio;

    public Automovil(String marca, String color, String tipo, String transmision, int numPuertas, int cilindros, float precio) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.transmision = transmision;
        this.numPuertas = numPuertas;
        this.cilindros = cilindros;
        this.precio = precio;
    }

    public Automovil(String marca) {
        this.marca = marca;
    }

    public Automovil() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTransmicion() {
        return transmision;
    }

    public void setTransmicion(String transmicion) {
        this.transmision = transmicion;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public String encender(){
         return "Encendido";
    }
    
     public String avanzar(){
         return "Avanzando";
    }
    
     public String retroceder(){
         return "En reversa";
    }
    
     public String detener(){
         return "Detenido";
    }
     
     public String Apagar(){
         return "Apagado";
    }

    @Override
    public String toString() {
        return "Marca:"+marca+"\n Color:"+color+"\n Tipo:"+tipo+"\n Transmisión:"+transmision
                +"\n Numero de Puertas"+numPuertas+"\n Cilindros"+cilindros
                +"\n Precio:"+precio;
    }
     
     
}
