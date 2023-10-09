package PersonajesCurso;

public abstract class Personaje {
    private int salud;

    public Personaje(int salud) {
        this.salud = salud;
    }
    public int obtenerSalud() {
        return salud;
    }
     public void asignarSalud(int salud) {
        this.salud = salud;
    }

    public abstract void entrenar();
}