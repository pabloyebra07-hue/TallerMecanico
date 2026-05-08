package org.iesalandalus.programacion.tallermecanico.modelo.negocio.ficheros;

import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Trabajo;

public enum TipoTrabajo {
    MECANICO("Mecánico"),
    REVISION("Revisión");

    private String nombre;

    private TipoTrabajo(String nombre){}

    public static TipoTrabajo get(Trabajo trabajo){
        return get(trabajo);
    }
}
