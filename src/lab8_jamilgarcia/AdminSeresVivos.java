/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_jamilgarcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author JamilGarcía
 */
public class AdminSeresVivos {
    private ArrayList listaSV = new ArrayList();
    private File archivo = null;
    
    public AdminSeresVivos(String path) {
        archivo = new File(path);
    }

    public ArrayList getListaSV() {
        return listaSV;
    }

    public void setListaSV(ArrayList listaSV) {
        this.listaSV = listaSV;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }


    @Override
    public String toString() {
        return "lista=" + listaSV;
    }

    //extra mutador
    public void setSeresV(SeresVivos p) {
        this.listaSV.add(p);
    }

    public void cargarArchivo() {
         try {            
            listaSV = new ArrayList();
            SeresVivos temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (SeresVivos) objeto.readObject()) != null) {
                        listaSV.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Iterator it = listaSV.iterator(); it.hasNext();) {
                SeresVivos t = (SeresVivos) it.next();
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}


