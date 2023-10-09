package PersonajesCurso;

public class Espadachin extends Personaje {
    private int ataque;

    public Espadachin(int salud, int ataque) {
        super(salud);
        this.ataque = ataque;
    }

    public int obtenerAtaque() {
        return ataque;
    }

    public void asignarAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public void entrenar() {
        this.ataque += 10;
    }
}
