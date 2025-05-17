package example.Rutas;

import java.util.Random;


// se define ruta de los autobuses
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

    //Le ponemos unas coordenadas cercanas a cada parada de autobus
    public static void obtenerCoordenadas(String parada) {
        double latMin = 0, latMax = 0, lonMin = 0, lonMax = 0;

        switch (parada) {
            case "Prado de San Sebastián (Carlos V)":
                latMin = 37.3800; latMax = 37.3810;
                lonMin = -5.9900; lonMax = -5.9890;
                break;
            case "San Bernardo (Estación Cercanías)":
                latMin = 37.3760; latMax = 37.3770;
                lonMin = -5.9840; lonMax = -5.9830;
                break;
            case "Ramón y Cajal (San Francisco Javier)":
                latMin = 37.3740; latMax = 37.3750;
                lonMin = -5.9790; lonMax = -5.9780;
                break;
            case "Ramón y Cajal (Urbión)":
                latMin = 37.3720; latMax = 37.3730;
                lonMin = -5.9760; lonMax = -5.9750;
                break;
            case "Ramón y Cajal (Antiguo Matadero)":
                latMin = 37.3700; latMax = 37.3710;
                lonMin = -5.9730; lonMax = -5.9720;
                break;
            case "Canal (Párroco Antonio Gómez Villalobos)":
                latMin = 37.3680; latMax = 37.3690;
                lonMin = -5.9700; lonMax = -5.9690;
                break;
            case "Canal (Afán de Ribera)":
                latMin = 37.3729; latMax = 37.3739;
                lonMin = -5.9587; lonMax = -5.9577;
                break;
            case "Afán de Ribera (Maestro Falla)":
                latMin = 37.3640; latMax = 37.3650;
                lonMin = -5.9640; lonMax = -5.9630;
                break;
            case "Afán de Ribera (Galicia)":
                latMin = 37.3620; latMax = 37.3630;
                lonMin = -5.9610; lonMax = -5.9600;
                break;
            case "Afán de Ribera (Juan Talavera Heredia)":
                latMin = 37.3600; latMax = 37.3610;
                lonMin = -5.9580; lonMax = -5.9570;
                break;
            case "8 de Marzo (Melchor de Alcázar)":
                latMin = 37.3580; latMax = 37.3590;
                lonMin = -5.9550; lonMax = -5.9540;
                break;
            case "Águila Perdicera (Centro de Salud)":
                latMin = 37.3560; latMax = 37.3570;
                lonMin = -5.9520; lonMax = -5.9510;
                break;
            case "Carmen Vendrell":
                latMin = 37.3540; latMax = 37.3550;
                lonMin = -5.9490; lonMax = -5.9480;
                break;
            default:
                System.out.println("Parada no reconocida.");
                return;
        }

        Random rand = new Random();
        double latitud = latMin + (latMax - latMin) * rand.nextDouble();
        double longitud = lonMin + (lonMax - lonMin) * rand.nextDouble();

        System.out.println("Altitud : "+ latitud + " Longitud : " + longitud);    }


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

