/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  @author Jorge Luis Manzanares
 */

public class Esfera{
	private final float pi = 3.14159f;
	private float radius;
	private float area = -1;
	private float volume = -1;

	public Esfera(float radius){
		this.radius = radius;	
	}

	public float computeArea(){
		if(radius<=0)
			System.out.println("Introdujó un valor imposible para el radio");
		else
			area = 4*pi*radius*radius;
		return area;
	}
	
	public float computeVolume(){
		if(radius <= 0)
			System.out.println("Introdujó un valor imposible para el volumen");
		else
			volume = (4.0f/3.0f) * pi * (radius*radius*radius);
		return volume;
	}

	public void printSphere(){
                DecimalFormat format = new DecimalFormat("#.###");
		System.out.println("Las dimensiones de su esfera son:");
		System.out.println("Radio: " + format.format(radius) + " unidades lineales");
		System.out.println("Área: " + format.format(area) + " unidades cuadradas");
		System.out.println("Volumen: " + format.format(volume) + " unidades cúbicas");
                System.out.println();
	}

	public float getRadius(){
		return radius;
	}

	public float getArea(){
		if(area == -1)
			System.out.println("Es posible que no haya calculado el área aún");
		return area;
	}
	public float getVolume(){	
		if(volume == -1)
			System.out.println("Es posible que no haya calculado el volumen aún");
		return volume;
	}

	public void setRadius(float radius){
		this.radius = radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Desea actualizar el volumen y el área? S N");
		if(sc.next().charAt(0)=='S'){
			System.out.println("El área ahora vale: "+computeArea()+" unidades cuadradas");
			System.out.println("El volumen ahora vale: "+computeVolume()+" unidades cúbicas");	
		}
	}

	public void setArea(float area){
		this.area = area;
	}

	public void setVolume(float volume){
		this.volume = volume;
	}
}
