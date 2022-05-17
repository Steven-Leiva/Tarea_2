/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author s_lei
 */
public class TrianguloModel {
    
    private float a;
    private float b;
    private float c;

    /**
     * @return the a
     */
    public float getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public float getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(float c) {
        this.c = c;
    }
    
    public void tipo(float a, float b, float c){
        
        String equilatero;
        String isoceles;
        String escaleno;
        String no;
        if((a+b)>c && (a+c)>b && (b+c)>a){
            if( a== b && b==c){
            	JOptionPane.showMessageDialog(null, "El triangulo es equilatero");
            }else if((a == b || a==c || b==c )){
            	JOptionPane.showMessageDialog(null, "El triangulo es isosceles");

            }else{
            	JOptionPane.showMessageDialog(null, "El triangulo es escaleno");
            }
        }else
        	JOptionPane.showMessageDialog(null, "No es triangulo");
        
        
        
    }
    
    
}
