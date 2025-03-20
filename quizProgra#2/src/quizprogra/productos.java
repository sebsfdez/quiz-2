/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class productos {

//Atributos
    private int cantidad = 0;
    private String producto;
//constructor

    public productos(String producto) {
        this.producto = producto;
    }
//getter and setter

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    //metodo
    public String almacen() {
        while (true) {
            //datos
            int productos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos:"));

            if (productos > 0) {
                cantidad += productos;
            }

        }

    }

}
