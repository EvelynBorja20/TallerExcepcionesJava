package com.krakeDev.Taller.Exepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerContacto {
    private static final Logger log = LoggerFactory.getLogger(LeerContacto.class);

    public static void leer() {
        BufferedReader lector = null;

        try {
            lector = new BufferedReader(new FileReader("contactos.txt"));
            
            String linea = lector.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = lector.readLine();
            }
            
            log.info("Archivo leído correctamente.");
            
        } catch (FileNotFoundException e) {
            log.error("Error: El archivo no existe o no fue encontrado. " + e.getMessage());
        } catch (IOException e) {
            log.error("Error de E/S al leer el archivo. " + e.getMessage());
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException e) {
                log.error("Error al cerrar el BufferedReader: " + e.getMessage());
            }
        }
    }
}
