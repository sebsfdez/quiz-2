/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizprogra;

import javax.swing.JOptionPane;
import quizprogra.productos;

/**
 *
 * @author sebas
 */
public class ventasSem {
//Llamado Constructor

    productos productos = new productos("");

    //Atributos
    private int almacen = 0;
    private int ArregloSemana;

    //constructor
    public ventasSem(int ArregloSemana) {
        this.ArregloSemana = ArregloSemana;
    }

    //getterAndSetter
    public int getArregloSemana() {
        return ArregloSemana;
    }

    public void setArregloSemana(int ArregloSemana) {
        this.ArregloSemana = ArregloSemana;
    }

    public int getAlmacen() {
        return almacen;
    }

    public void setAlmacen(int almacen) {
        this.almacen = almacen;
    }

    public int arrayCalc() {
        int ArregloSemana[][] = new int[7][productos.getCantidad()]; //Arreglo con filas declaradas

        //Filas
        ArregloSemana[0][0] = Integer.parseInt("Lunes");
        ArregloSemana[1][0] = Integer.parseInt("Martes");
        ArregloSemana[2][0] = Integer.parseInt("Miercoles");
        ArregloSemana[3][0] = Integer.parseInt("Jueves");
        ArregloSemana[4][0] = Integer.parseInt("Viernes");
        ArregloSemana[5][0] = Integer.parseInt("Sabado");
        ArregloSemana[6][0] = Integer.parseInt("Domingo");

        for (int i = 0; i < ArregloSemana.length; i++) {
            for (int j = 0; j < ArregloSemana.length; j++) {

            }
        }
        return this.ArregloSemana;
    }

}
