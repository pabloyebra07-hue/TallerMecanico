package org.iesalandalus.programacion.tallermecanico.modelo.negocio.memoria;

import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Trabajo;

public enum TipoDeTrabajo {
    MECANICO("Mecánico"),
    REVISION("Revisión");

    private String nombre;

    private TipoDeTrabajo (String nombre){}

    public static TipoDeTrabajo get(Trabajo trabajo){
        return get(trabajo);
    }
}
