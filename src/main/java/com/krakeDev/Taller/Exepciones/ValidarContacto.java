package com.krakeDev.Taller.Exepciones;

public class ValidarContacto {

    public static void validarTelefono(String telefono) throws IllegalArgumentException {
        if (telefono == null || telefono.length() != 10) {
            throw new IllegalArgumentException("Teléfono inválido: " + telefono + ". Debe tener exactamente 10 dígitos.");
        }
    }
}