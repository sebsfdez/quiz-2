/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamado constructor
        productos productos = new productos("");
        ventasSem ventasSem = new ventasSem(0);

        //LlamadoMetodos
        productos.almacen();
        ventasSem.arrayCalc();

        //llamado
        JOptionPane.showMessageDialog(null, ventasSem.arrayCalc());

    }

}
