/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import java.util.Scanner;

/**
 *
 * @author Jesús Salazar Domínguez
 */
public class Superficies {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        int op;
        float l1, l2, l3;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("¿Qué superficie desea utilizar?");
            System.out.println("0.- Para terminar con el programa");
            System.out.println("1.- Prisma rectangular");
            System.out.println("2.- Esfera");
            System.out.println("3.- Cono");
            op = sc.nextInt();
            switch(op){
                case 0:
                    break;
                case 1:
                    System.out.println("Ingresa la altura:");
                    l1 = readLength();
                    System.out.println("Ingresa el ancho:");
                    l2 = readLength();
                    System.out.println("Ingresa el largo:");
                    l3 = readLength();
                    Prisma prisma = new Prisma(l1, l2, l3);
                    prisma.printPrisma();
                    break;
                case 2:
                    System.out.println("Ingresa el radio:");
                    l1 = readLength();
                    Esfera esfera = new Esfera(l1);
                    esfera.computeArea();
                    esfera.computeVolume();
                    esfera.printSphere();
                    break;
                case 3:
                    System.out.println("Ingresa la altura:");
                    l1 = readLength();
                    System.out.println("Ingresa el radio");
                    l2 = readLength();
                    Cono cono = new Cono(l1, l2);
                    cono.area();
                    cono.volumen();
                    cono.imprimir();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while(op != 0);
    }
    
    public static float readLength(){
        Scanner scan = new Scanner(System.in);
        float length = scan.nextFloat();
        return length;
    }
    
}
