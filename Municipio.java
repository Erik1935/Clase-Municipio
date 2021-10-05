package municipio;
import java.util.Scanner;
/**
 *
 * @author erikj
 */
public class Municipio {
private int id = 1;
private String nombre = "Campeche. Calkini";
private float latitud = 19.8445901f;
private float longitud = -90.5350973f;
private int listado = 70000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public int getListado() {
        return listado;
    }

    public void setListado(int listado) {
        this.listado = listado;
    }
    public void participacionReal(int votantes){
	System.out.println((600/70000)*100);
}

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Municipio municipio = new Municipio();
    }
    
}
