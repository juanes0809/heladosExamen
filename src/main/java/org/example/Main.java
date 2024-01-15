package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leerDato= new Scanner(System.in);

        int costoHeladoSimple=9000;
        int costoHeladoDoble=12000;
        int costoHeladoEspecial=18000;

        System.out.println("Bienvenido a Frozen");
        System.out.println("Ingrese nombre:");
        String nombreJefe=leerDato.nextLine();
        System.out.println("Sñr "+nombreJefe+" ingrese su id:");
        String documentoJefe=leerDato.nextLine();

        System.out.println("Cantidad de helados simples vendidos");
        byte cantidadHeladoSimple=leerDato.nextByte();
        System.out.println("Cantidad helados dobles vendidos");
        byte cantidadHeladosDobles=leerDato.nextByte();
        System.out.println("Cantidad helados especiales");
        byte cantidadHeladosEspeciales=leerDato.nextByte();

        int totalVentasSimple=costoHeladoSimple*cantidadHeladoSimple;
        int totalVentasDoble=costoHeladoDoble*cantidadHeladosDobles;
        int totalVentaEspecial=costoHeladoEspecial*cantidadHeladosEspeciales;
        int totalVentasDia=totalVentasSimple+totalVentasDoble+totalVentaEspecial;

        System.out.println("La cantidad de helado simple vendida es: "+totalVentasSimple);
        System.out.println("La cantidad de helado doble es: "+totalVentasDoble);
        System.out.println("La cantidad de helado especial es: "+totalVentaEspecial);
        System.out.println("El total de ventas es de: "+totalVentasDia);

        //Juan Esteban Zapata López

    }
}