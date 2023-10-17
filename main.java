public class Main {
    public static void main(String[] args) {
        CompaniaTelefonia claro = new CompaniaTelefonia("Claro", 500, 10, 30.0);
        CompaniaTelefonia tigoUne = new CompaniaTelefonia("TigoUne", 300, 20, 25.0);
        CompaniaTelefonia otraCompania = new CompaniaTelefonia("Otra Compañía", 400, 15, 27.5);

        System.out.println("Información de las compañías de telefonía:");
        imprimirInformacionCompania(claro);
        imprimirInformacionCompania(tigoUne);
        imprimirInformacionCompania(otraCompania);
    }

    public static void imprimirInformacionCompania(CompaniaTelefonia compania) {
        System.out.println("Nombre: " + compania.getNombre());
        System.out.println("Minutos Incluidos: " + compania.getMinutosIncluidos() + " minutos");
        System.out.println("Internet Incluido: " + compania.getInternetIncluido() + " GB");
        System.out.println("Costo Mensual: $" + compania.getCostoMensual());
        System.out.println();
    }
}