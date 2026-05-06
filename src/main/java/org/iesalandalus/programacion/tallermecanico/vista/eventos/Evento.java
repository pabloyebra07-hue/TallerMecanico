package org.iesalandalus.programacion.tallermecanico.vista.eventos;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public enum Evento {
    INSERTAR_CLIENTE (11, "Insertar cliente"),
    BUSCAR_CLIENTE (12, "Buscar cliente"),
    BORRAR_CLIENTE (13, "Borrar cliente"),
    LISTAR_CLIENTE (14, "Listar cliente"),
    MODIFICAR_CLIENTE (15,"Modificar cliente"),
    INSERTAR_VEHICULO (21,"Insertar vehiculo"),
    BUSCAR_VEHICULO (22, "Buscar vehiculo"),
    BORRAR_VEHICULO (23,"Borrar vehiculo"),
    LISTAR_VEHICULO (24,"Listar vehiculo"),
    INSERTAR_REVISION (31,"Insertar revisión"),
    INSERTAR_MECANICO(32,"Insertar mecánico"),
    BUSCAR_TRABAJO(33,"Buscar trabajo"),
    BORRAR_TRABAJO(34,"Borrar trabajo"),
    LISTAR_TRABAJOS(35, "Listar trabajos"),
    LISTAR_TRABAJOS_CLIENTE(35, "Listar trabajos cliente"),
    LISTAR_TRABAJOS_VEHICULO (36,"Listar trabajos vehiculo"),
    ANADIR_HORAS_TRABAJO(37, "Añadir horas al trabajo"),
    ANADIR_PRECIO_MATERIAL_TRABAJO (38,"Añadir precio material de trabajo"),
    CERRAR_TRABAJO (39,"Cerrar trabajo"),
    SALIR (1,"Salir");

    private int codigo;
    private String mensaje;
    static Map<Integer, Evento> opciones = new HashMap<>();
    static {
        for (Evento evento : values()) {
            opciones.put(evento.codigo, evento);
        }
    }

    private Evento(int codigo, String mensaje){
        this.codigo = codigo;
        this.mensaje = mensaje;
    }

    public static boolean esValida(int codigo){
        return opciones.containsKey(codigo);
    }

    public static Evento get(int codigo){
        if (!esValida(codigo)){
            throw new IllegalArgumentException("La opción no es valida");
        }

        return opciones.get(codigo);
    }

    @Override
    public String toString() {
        return String.format("%d.- %s", codigo, mensaje);
    }
}
