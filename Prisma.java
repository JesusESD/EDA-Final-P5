/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import java.text.DecimalFormat;

/*
 * No se crean funciones SETTER ya que al crearse el prisma se toman las medidas.
 * No se consideran necesarias las funciones SETTER ya que un prisma no puede cambiar su tamaño,
 * si esto ocurriera entonces sería un nuevo objeto.
 */

/*
 *  @author Miguel Bazán
 */

public class Prisma {
    private final float altura, ancho, largo;
    private final float base, pared1, pared2, superficie;
    private final float volumen;
    
//Constructor
    public Prisma (float altura, float ancho, float largo){
        this.altura = altura;
        this.ancho  = ancho;
        this.largo  = largo;
        
        base   = this.ancho*this.largo;
        pared1 = this.altura*this.ancho;
        pared2 = this.altura*this.largo;
        
        superficie = (2 * base) + (2 * pared1) + (2 * pared2);
        volumen    = this.altura*this.ancho*this.largo;
    }
    
//GETTER's Functions
    //Funciones de los datos Básicos
    public float getAltura() {
        return altura;
    }
    public float getLargo() {
        return largo;
    }
    public float getAncho() {
        return ancho;
    }

    //Funciones de datos Compuestos
    public float getBase() {
        return base;
    }
    public float getPared1() {
        return pared1;
    }
    public float getPared2() {
        return pared2;
    }

    //Funciones de los datos Buscados (Volumen y superficie)
    public float getSuperficie() {
        return superficie;
    }
    public float getVolumen() {
        return volumen;
    }
    public void printPrisma(){
        DecimalFormat format = new DecimalFormat("#.###");
        System.out.println("Las dimensiones de su prisma son:");
        System.out.println("Altura: " + format.format(altura) + " Ancho: " + format.format(ancho) + " Largo: " + format.format(largo) + " (Unidades lineales)");
        System.out.println("El área es: " + format.format(superficie) + " Unidades cuadradas");
        System.out.println("El volumen es: " + format.format(volumen) + " Unidades cúbicas");
        System.out.println();
    }
    
}
