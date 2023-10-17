public class CompaniaTelefonia {
    private String nombre;
    private int minutosIncluidos;
    private int internetIncluido;
    private double costoMensual;

    public CompaniaTelefonia(String nombre, int minutosIncluidos, int internetIncluido, double costoMensual) {
        this.nombre = nombre;
        this.minutosIncluidos = minutosIncluidos;
        this.internetIncluido = internetIncluido;
        this.costoMensual = costoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularPuntaje(int minutos, int internet, double costoMaximo) {
        double puntaje = 0.0;

        if (minutos <= minutosIncluidos) {
            puntaje += 1.0;
        } else {
            puntaje += (double) minutosIncluidos / minutos;
        }

        if (internet <= internetIncluido) {
            puntaje += 1.0;
        } else {
            puntaje += (double) internetIncluido / internet;
        }

        if (costoMensual <= costoMaximo) {
            puntaje += 1.0;
        } else {
            puntaje += costoMaximo / costoMensual;
        }

        return puntaje;
    }
}