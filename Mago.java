package PersonajesCurso;

public class Mago extends Personaje {
    private String magia;

    public Mago(int salud, String magia) {
        super(salud);
        this.magia = magia;
    }

    public String obtenerMagia() {
        return magia;
    }

    public void asignarMagia(String magia) {
        this.magia = magia;
    }
    
    @Override
    public void entrenar() {
        System.out.println("A los magos no nos gusta entrenar");
    }
}