/**
 @author Thiago Quitana
 **/

/*
 - Universidad Nacional de Hurligham
 - Trabajo final Introducción a Java
 - Ejercicio 1 
*/

package com.unahur.electrodomesticos;
import java.util.Scanner;

public class Electrodomesticos {
    private String tipo;
    private String marca;
    private double potencia;

    // Constructor
    public Electrodomesticos(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    // Métodos get y set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    // Método toString
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }

    // Método getConsumo
    public double getConsumo(int horas) {
        return horas * potencia;
    }

    // Método getCosteConsumo
    public double getCosteConsumo(int horas, double costeHora) {
        return horas * potencia * costeHora;
    }
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Consumo");
        System.out.println("-----------------------");

        System.out.println("> Ingrese el tipo de electrodoméstico: (Por ejemplo: Heladera, Microondas, Aire Acondicionado, etc...)");
        String tipoElectrodomestico = scanner.nextLine();

        System.out.println("> Ingrese la marca del electrodoméstico: (Por ejemplo: Sony, LG, Samsung, etc...)");
        String marcaElectrodomestico = scanner.nextLine();

        System.out.println("> Ingrese la potencia del electrodoméstico: (Por ejemplo: 3.0 kW, Solo colocar el número)");
        double potenciaElectrodomestico = scanner.nextDouble();

        Electrodomesticos electrodomestico = new Electrodomesticos(tipoElectrodomestico, marcaElectrodomestico, potenciaElectrodomestico);

        System.out.println("--Datos del Electrodoméstico:--");
        System.out.println(electrodomestico);
        System.out.println("Consumo: " + electrodomestico.getConsumo(3) + " kW");
        double costoConsumoElectrodomestico = electrodomestico.getCosteConsumo(3, 21.35);
        System.out.println("Coste de consumo: $" + costoConsumoElectrodomestico + " pesos argentinos");
        
        System.out.println("\nIngrese la marca de la lavadora: (Por ejemplo: Drean, Codini, Whirlpool, etc...)");
        String marcaLavadora = scanner.next();

        System.out.println("> Ingrese el precio de la lavadora: (Por ejemplo: 5000");
        double precioLavadora = scanner.nextDouble();

        System.out.println("> Ingrese la potencia de la lavadora: (Por ejemplo: 2.5 KW, Solo colocar el número)");
        double potenciaLavadora = scanner.nextDouble();

        System.out.println("> La lavadora funciona con agua caliente? (true/false):");
        boolean aguaCalienteLavadora = scanner.nextBoolean();

        Lavadora lavadora = new Lavadora(marcaLavadora, precioLavadora, potenciaLavadora, aguaCalienteLavadora);

        System.out.println("\n--Datos de la Lavadora:--");
        System.out.println(lavadora);
        System.out.println("Consumo: " + lavadora.getConsumo(2) + " kW");
        double costoConsumoLavadora = lavadora.getCosteConsumo(2, 21.35);
        System.out.println("Coste de consumo: $" + costoConsumoLavadora + " pesos argentinos");
        scanner.close();
    }
}
