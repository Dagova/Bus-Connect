package example;


import static example.Rutas.Ruta1.*;


public class Bus {
    private int id;
    private int Posicion; // Posición en la ruta (índice)
    private int Velocidad; // 0 a 4

    Bus(int id, int posicion, int velocidad){
        setId(id);
        setPosicion(posicion);
        setVelocidad();
    }


    public void setId(int id) {

        this.id = id;
    }

    public int getPosicion() {

        return Posicion;
    }

    public void setPosicion(int posicion) {

        Posicion = posicion;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad() {

        Velocidad = (int)(Math.random() * 5);
    }

   public void actualizacionPosicion(){
        setVelocidad(); // Velocidad aleatoria de 0 a 4
        switch (getVelocidad()) {
            case 0: // Parado
                System.out.println("El autobus esta parado semaforo/atasco");
                obtenerCoordenadas(estacion(getPosicion()));

                break;

            case 1: // Parado en estación
                setPosicion(getPosicion() + 1);
                System.out.println("El autobus esta parado en la estacion" + estacion(getPosicion()) );
                obtenerCoordenadas(estacion(getPosicion()));
                break;
            case 2: // Lento
                System.out.println("El autobus va despacio a 10Km/h");
                obtenerCoordenadas(estacion(getPosicion()));

                break;
            case 3: // Medio
                System.out.println("El autobus va normal a 40Km/h");
                obtenerCoordenadas(estacion(getPosicion()));

                break;
            case 4: // Rápido
                System.out.println("El autobus va Rapido a 80Km/h");
                obtenerCoordenadas(estacion(getPosicion()));

                break;
        }
        if (getPosicion() <= 11) {
            System.out.println("Siguiente parada " + siguienteEstacion(getPosicion()));
        }else {
            System.out.println("Volviendo al comienzo de ruta");
            setPosicion(-1);
        }
    }
}

