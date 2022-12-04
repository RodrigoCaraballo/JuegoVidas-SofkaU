public class Aplicacion {
    public static void main(String[] args) {
        //Creando instancias de Juego
        Juego j1 = new Juego(5, 5);
        Juego j2 = new Juego(5, 5);

        j1.muestraVidasRestantes();
        j1.quitaVida();
        j1.muestraVidasRestantes();
        System.out.println("-------------------");

        j1.reiniciarPartida();
        j1.muestraVidasRestantes();
        System.out.println("-------------------");

        j1.actualizarRecord();
        j2.actualizarRecord();
        System.out.println("-------------------");

    }
}
