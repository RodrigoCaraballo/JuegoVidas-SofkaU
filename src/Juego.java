public class Juego {

    private int vidas;
    private final int vidasInciales;
    private static int record = 0;

    public Juego(int vidas, int vidasInciales) {
        this.vidas = vidas;
        this.vidasInciales = vidasInciales;
    }

    public void muestraVidasRestantes() {
        System.out.println(vidas + " vidas restantes");
    }

    public void restaVidas(int menosVida) {
        this.vidas -= menosVida;
    }

    public boolean quitaVida() {
        this.vidas--;
        if (this.vidas <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void reiniciarPartida() {
        this.vidas = this.vidasInciales;
    }

    public void actualizarRecord() {
        if (record == this.vidas) {
            System.out.println("Has alcanzadado el record");
        } else if (record < this.vidas) {
            System.out.println("Has superado el record, el record ahora es: " +this.vidas);
            record = this.vidas;
        }
    }
}
