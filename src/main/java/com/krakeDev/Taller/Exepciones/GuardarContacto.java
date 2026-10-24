package com.krakeDev.Taller.Exepciones;

import java.io.FileWriter;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {
    private static final Logger log = LoggerFactory.getLogger(GuardarContacto.class);

    public static void guardar() {
        // Declarado fuera del try para poder cerrarlo en el finally
        FileWriter escritor = null;

        try {
            // El 'true' activa el modo append para no borrar lo existente
            escritor = new FileWriter("contactos.txt", true);
            
            escritor.write("Nombre: Maria\n");
            escritor.write("Apellido: Gomez\n");
            escritor.write("Telefono: 0981234567\n");
            escritor.write("--------------------\n");
            
            log.info("Contacto guardado exitosamente en contactos.txt");
            
        } catch (IOException e) {
            log.error("Error al intentar escribir en el archivo: " + e.getMessage());
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException e) {
                log.error("Error al cerrar el archivo FileWriter: " + e.getMessage());
            }
        }
    }
}