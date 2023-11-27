package com.unahur.electrodomesticos;

public class Lavadora extends Electrodomesticos {
    private double precio;
    private boolean aguaCaliente;

    // Primer constructor
    public Lavadora(String marca, double potencia) {
        super("Lavadora", marca, potencia);
        this.aguaCaliente = false; // Inicializar a agua fría
    }

    // Segundo constructor
    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    // Métodos get y set para precio y aguaCaliente
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    // Método toString
    @Override
    public String toString() {
        return "Lavadora{" +
                "tipo='" + getTipo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", potencia=" + getPotencia() +
                ", precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }

    // Sobrescribir getConsumo para considerar agua caliente
    @Override
    public double getConsumo(int horas) {
        if (aguaCaliente) {
            return horas * (getPotencia() + getPotencia() * 0.20);
        } else {
            return super.getConsumo(horas);
        }
    }
}
