package paquetito;

import java.util.Random;

public final class Persona {
    public String nombre;
    public int edad;
    public String DNI;
    public String sexo;
    public int pesoEnKilogramos;
    public int alturaEnCentimetros;

    public Persona() {
        this.nombre = "David";
        this.edad = 0;
        this.sexo = "Hombre";
        this.pesoEnKilogramos = 0;
        this.alturaEnCentimetros = 0;
        generarDNI();
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.pesoEnKilogramos = 0;
        this.alturaEnCentimetros = 0;
        generarDNI();
    }

    public Persona(String nombre, int edad, String DNI, String sexo, int pesoEnKilogramos, int alturaEnCentimetros) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.pesoEnKilogramos = pesoEnKilogramos;
        this.alturaEnCentimetros = alturaEnCentimetros;
    }

    public int calcularIMC() {
        double alturaEnMetros = alturaEnCentimetros / 100.0;
        double imc = pesoEnKilogramos / (alturaEnMetros * alturaEnMetros);
        final int DEBAJO_PESO_IDEAL = -1;
        final int PESO_IDEAL = 0;
        final int SOBREPESO = 1;

        if (imc < 20) {
            return DEBAJO_PESO_IDEAL;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
               }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void generarDNI() {
        Random rand = new Random();
        int numero = rand.nextInt(90000000) + 10000000;
        DNI = Integer.toString(numero);
    }

    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + DNI + "\nSexo: " + sexo +
                "\nPeso: " + pesoEnKilogramos + " kg\nAltura: " + alturaEnCentimetros + " cm";
    }

}
