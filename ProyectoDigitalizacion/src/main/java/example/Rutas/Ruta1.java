package example.Rutas;

import java.util.Arrays;

public class Ruta1 {
    private static final String[] ruta = {
            "Prado de San Sebastián (Carlos V)",
            "San Bernardo (Estación Cercanías)",
            "Ramón y Cajal (San Francisco Javier)",
            "Ramón y Cajal (Urbión)",
            "Ramón y Cajal (Antiguo Matadero)",
            "Canal (Párroco Antonio Gómez Villalobos)",
            "Canal (Afán de Ribera)",
            "Afán de Ribera (Maestro Falla)",
            "Afán de Ribera (Galicia)",
            "Afán de Ribera (Juan Talavera Heredia)",
            "8 de Marzo (Melchor de Alcázar)",
            "Águila Perdicera (Centro de Salud)",
            "Carmen Vendrell"
    };

    // Devuelve el nombre de la estación o "Fuera de ruta" si el índice no es válido
    public static String estacion(int posicion) {
        if (posicion >= 0 && posicion < ruta.length) {
            return ruta[posicion];
        } else {
            return "Fuera de ruta";
        }
    }
    public static String siguienteEstacion(int posicion){
        if (posicion >= 0 && posicion < ruta.length) {
            return ruta[posicion+1];
        } else {
            return "Volviendo al inicio";
        }
    }

    public static int totalEstaciones() {
        return ruta.length;
    }

    @Override
    public String toString() {
        return "Ruta1: " + Arrays.toString(ruta);
    }
}

