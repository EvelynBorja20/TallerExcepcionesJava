package com.krakeDev.Taller.Exepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private static final Logger log = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        // Cambia este valor para tus pruebas ("123" para error, "0981234567" para éxito)
        String telefonoPrueba = "0981234567"; 

        try {
            log.info("Iniciando validación del número de teléfono...");
            
            // 1. Valida (lanza excepción si falla)
            ValidarContacto.validarTelefono(telefonoPrueba);
            
            // 2. Guarda en contactos.txt
            GuardarContacto.guardar();
            
            // 3. Lee el archivo
            LeerContacto.leer();
            
            log.info("¡Proceso completado con éxito!");
            
        } catch (IllegalArgumentException e) {
            log.error("Error de validación capturado en Test: " + e.getMessage());
        }
    }
}
