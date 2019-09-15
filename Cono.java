/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import java.text.DecimalFormat;


/**
 *
 * @author Shuai Shen
 */

public class Cono {
    private float altura;
    private float radio;
    
    public Cono(float altura, float radio){
        this.altura=altura;
        this.radio=radio;
    }
    
	// metodos getters y setters
    public void setAltura(float altura){
	this.altura=altura;
    }
    public void setRadio(float radio){
	this.radio=radio;
    }
    public float getAltura(){
	return altura;
    }
    public float getRadio(){
	return radio;
    }
    
	// volumen
    public double volumen(){
	return (3.1416*radio*radio*altura)/3;
    }

	// area
    public double area(){
	return (3.1416*radio)*(Math.sqrt(radio*radio+altura*altura)+radio);
    }
       // impresion de los datos
    public void imprimir(){
        DecimalFormat format = new DecimalFormat("#.###");
        System.out.println("Las dimensiones de su cono son:");
        System.out.println("Altura: " + format.format(altura)+" Radio: " + format.format(radio) + " (Unidades lineales)");
        System.out.println("El área de cono es: " + format.format(area()) + " unidades cuadradas");
        System.out.println("El volumen de cono es : " + format.format(volumen()) + " unidades cúbicas");
        System.out.println();
    }
}
