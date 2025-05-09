package example.Rutas;

import java.util.Random;

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

    public static void obtenerCoordenadas(String parada) {
        double latMin = 0, latMax = 0, altMin = 0, altMax = 0;

        switch (parada) {
            case "Prado de San Sebastián (Carlos V)":
                latMin = 39.900; latMax = 40.900; altMin = 200; altMax = 800;
                break;
            case "San Bernardo (Estación Cercanías)":
                latMin = 39.800; latMax = 40.800; altMin = 100; altMax = 900;
                break;
            case "Ramón y Cajal (San Francisco Javier)":
                latMin = 39.700; latMax = 40.700; altMin = 300; altMax = 850;
                break;
            case "Ramón y Cajal (Urbión)":
                latMin = 39.750; latMax = 40.750; altMin = 150; altMax = 950;
                break;
            case "Ramón y Cajal (Antiguo Matadero)":
                latMin = 39.600; latMax = 40.600; altMin = 400; altMax = 1000;
                break;
            case "Canal (Párroco Antonio Gómez Villalobos)":
                latMin = 39.500; latMax = 40.500; altMin = 300; altMax = 700;
                break;
            case "Canal (Afán de Ribera)":
                latMin = 39.300; latMax = 40.300; altMin = 250; altMax = 750;
                break;
            case "Afán de Ribera (Maestro Falla)":
                latMin = 39.100; latMax = 40.100; altMin = 200; altMax = 800;
                break;
            case "Afán de Ribera (Galicia)":
                latMin = 39.000; latMax = 40.000; altMin = 150; altMax = 850;
                break;
            case "Afán de Ribera (Juan Talavera Heredia)":
                latMin = 38.900; latMax = 39.900; altMin = 100; altMax = 900;
                break;
            case "8 de Marzo (Melchor de Alcázar)":
                latMin = 38.800; latMax = 39.800; altMin = 100; altMax = 950;
                break;
            case "Águila Perdicera (Centro de Salud)":
                latMin = 38.700; latMax = 39.700; altMin = 120; altMax = 1000;
                break;
            case "Carmen Vendrell":
                latMin = 38.600; latMax = 39.600; altMin = 130; altMax = 920;
                break;
            default:
                System.out.println("Parada no reconocida.");
                return;
        }

        Random rand = new Random();
        double latitud = latMin + (latMax - latMin) * rand.nextDouble();
        double altitud = altMin + (altMax - altMin) * rand.nextDouble();

        System.out.println("Altitud : "+ altitud + " Latitud : " + latitud);
    }


    // Devuelve el nombre de la estación o "Fuera de ruta" si el índice no es válido
    public static String estacion(int posicion) {
        if (posicion >= 0 && posicion < ruta.length) {
            return ruta[posicion];
        } else {
            return "Prado de San Sebastián (Carlos V)";
        }
    }
    public static String siguienteEstacion(int posicion){
        if (posicion >= 0 && posicion < ruta.length) {
            return ruta[posicion+1];
        } else {
            return "Prado de San Sebastián (Carlos V)";
        }
    }




}

