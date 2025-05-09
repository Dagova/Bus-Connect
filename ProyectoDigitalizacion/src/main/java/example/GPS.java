package example;


import example.Rutas.Ruta1;

public class GPS {
    private  Bus[] bus;
    private Ruta1 ruta;

    public GPS(){
        this.ruta = new Ruta1();
        this.bus = new Bus[] {
                new Bus(1, 0,0),  // Empieza en la parada 0
                new Bus(2, 4,0),  // Empieza en la parada 4
                new Bus(3, 8,0)   // Empieza en la parada 8
        };
    }

   public  void actualizacionBus1(){
        bus[0].actualizacionPosicion();
    }
    public  void actualizacionBus2(){
        bus[1].actualizacionPosicion();

    }
    public  void actualizacionBus3(){
        bus[2].actualizacionPosicion();

    }
}
