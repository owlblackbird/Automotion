package PersonajesCurso;

public class Torre extends Personaje {
    private int nivel;

    public Torre(int salud, int nivel) {
        super(salud);
        this.nivel = nivel;
    }

    public int obtenerNivel() {
        return nivel;
    }

    public void asignarNivel(int nivel) {
        this.nivel = nivel;
    }
    @Override
    public void entrenar() {
        // Incrementar el nivel en 1
        this.nivel++;
    }
}
