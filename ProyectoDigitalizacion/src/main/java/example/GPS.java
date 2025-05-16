package example;


import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GPS {
    private  Bus[] bus;

    public GPS(){
      cargarDatos();
    }

    public void cargarDatos() {
        File archivo = new File("buses.json");
        if (archivo.exists()) {
            try (FileReader reader = new FileReader(archivo)) {
                Gson gson = new Gson();
                this.bus = gson.fromJson(reader, Bus[].class);
                System.out.println("Datos cargados desde buses.json");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // Si no existe, inicia con datos por defecto
            this.bus = new Bus[] {
                    new Bus(1, 0, 0),
                    new Bus(2, 4, 0),
                    new Bus(3, 8, 0)
            };
            System.out.println("Archivo no encontrado. Usando datos por defecto.");
        }
    }
    public void guardarDatos() {
        try (FileWriter writer = new FileWriter("buses.json")) {
            Gson gson = new Gson();
            gson.toJson(this.bus, writer);
            System.out.println("Datos guardados en buses.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
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
