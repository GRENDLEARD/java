package paquetito;

/**
 *
 * @author SALAS
 */

  
public class Persona {
    
    String nombre;
    int edad;
    String DNI;
    String Sexo;
    int Peso;
    String Altura;
    
    
    public Persona() {
       this. nombre = "David";
       this. edad = 18;
       this. DNI = "1058912097";
       this. Sexo = "Hombre";
       this. Peso = 60;
       this. Altura = "1.87";
    
    }
    
    
      public Persona(String nombre, int edad,String Sexo) {
       this. nombre = nombre ;
       this. edad = edad;
       this. DNI = "1058912097";
       this. Sexo = Sexo;
       this. Peso = 60;
       this. Altura = "1.87";
       
   
   
    }
    
    
    
    
    
    
    
    
    
     public Persona(String nombre,int edad, String DNI, String Sexo, int Peso, String Altura) {
       this. nombre = nombre;
       this. edad = edad;
       this. DNI = DNI;
       this. Sexo = Sexo;
       this. Peso = Peso;
       this. Altura = Altura;
       
   
   
    }
    
    
    
    
    
    
    public void MostrarDatos (){
        
        System.out.println ("El nombre es: "+ nombre); 
        System.out.println ("La edad es: "+ edad); 
        System.out.println ("El DNI es: "+ DNI ); 
        System.out.println ("El sexo es: "+ Sexo );
        System.out.println ("El peso es de: "+ Peso);
        System.out.println ("La altura es de: "+ Altura);
        
    }
   
    
    
    
    
    
    
}
