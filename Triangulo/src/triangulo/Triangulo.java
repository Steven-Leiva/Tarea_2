/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author s_lei
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
        	
        	Ingresar();
                
        }catch(Exception e){
        	JOptionPane.showMessageDialog(null, "Un dato se a ingresado mal");
        	Ingresar();
        }  
        
    }
    
    public static void Ingresar() {
    	
    	TrianguloModel lados = new TrianguloModel();
        String salir;
        
    	do {
    		
    		lados.setA(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado A")));
    		lados.setB(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado B")));
    		lados.setC(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado C")));
    		lados.tipo(lados.getA(), lados.getB(), lados.getC());
    		salir = JOptionPane.showInputDialog("Desea seguir s/n");
    			
    	}while (salir.equals("s"));
    }
    
}
