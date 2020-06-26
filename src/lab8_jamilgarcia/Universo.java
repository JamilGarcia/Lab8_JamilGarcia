package lab8_jamilgarcia;

import java.io.Serializable;
import java.util.ArrayList;

public class Universo implements Serializable{
    
    private static final long SerialVersionUID = 2L;
    private String nombre; 
    ArrayList <SeresVivos> seres = new ArrayList(); 

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<SeresVivos> getSeres() {
        return seres;
    }

    public void setSeres(ArrayList<SeresVivos> seres) {
        this.seres = seres;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
     public void setSer(SeresVivos p) {
        this.seres.add(p);
    }
    
    
}
