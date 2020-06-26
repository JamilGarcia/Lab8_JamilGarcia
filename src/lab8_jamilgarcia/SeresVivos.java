package lab8_jamilgarcia;

public class SeresVivos {
    private String nombre; 
    private int poder; 
    private int anios; 
    private String planeta; 
    private String raza; 
    private int universoSV;//Para saber que numero de universo pertenecen. -1 indica que no pertenece a ningun universo

    public SeresVivos() {
    }

    public SeresVivos(String nombre, int poder, int anios, String planeta, String raza, int universoSV) {
        this.nombre = nombre;
        this.poder = poder;
        this.anios = anios;
        this.planeta = planeta;
        this.raza = raza;
        this.universoSV = universoSV;
    }

    public int getUniversoSV() {
        return universoSV;
    }

    public void setUniversoSV(int universoSV) {
        this.universoSV = universoSV;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
