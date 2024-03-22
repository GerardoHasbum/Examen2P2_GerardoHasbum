/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_gerardohasbum;

import java.io.Serializable;

/**
 *
 * @author ghasb
 */
public class Carro implements Serializable{
    
    private String Modelo, Marca;
    private int Velocidad;

    public Carro(String Modelo, String Marca, int Velocidad) {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Velocidad = Velocidad;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    @Override
    public String toString() {
        return Marca + ": " + Modelo;
    }

    
    
}
