package paquetito;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("David", 18, "12345678", "Hombre", 70, 190);
        Persona persona2 = new Persona("Maria", 25, "105891209", "Mujer", 60, 160);
     
        
        
        System.out.println("Persona 1:");
        System.out.println(persona1.toString());
        int imc1 = persona1.calcularIMC();
        System.out.println("IMC: " + imc1);
        String estadoIMC1;
        estadoIMC1 = switch (imc1) {
            case -1 -> "Peso por debajo del ideal";
            case 0 -> "Peso ideal";
            default -> "Sobrepeso";
        };
        System.out.println("Estado IMC: " + estadoIMC1);
        System.out.println("Mayor de edad: " + persona1.esMayorDeEdad());

        System.out.println("\nPersona 2:");
        System.out.println(persona2.toString());
        int imc2 = persona2.calcularIMC();
        System.out.println("IMC: " + imc2);
        String estadoIMC2;
        estadoIMC2 = switch (imc2) {
            case -1 -> "Peso por debajo del ideal";
            case 0 -> "Peso ideal";
            default -> "Sobrepeso";
        };
        System.out.println("Estado IMC: " + estadoIMC2);
        System.out.println("Mayor de edad: " + persona2.esMayorDeEdad());
    }
}
