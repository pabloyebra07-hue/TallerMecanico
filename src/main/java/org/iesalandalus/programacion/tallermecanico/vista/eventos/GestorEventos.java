package org.iesalandalus.programacion.tallermecanico.vista.eventos;

import java.util.*;

public class GestorEventos {
    private Map<Evento, List<ReceptorEventos>> receptores = new EnumMap<>(Evento.class);

    public GestorEventos(Evento... eventos){
        for (Evento evento : Evento.values()){
            receptores.put(evento, new ArrayList<>());
        }
    }

    public void suscribir(ReceptorEventos receptor, Evento... eventos){
        for (Evento evento: Evento.values()){
            Objects.requireNonNull(evento,"");
            Objects.requireNonNull(receptor,"");
            receptores.get(evento).add(receptor);
        }
    }

    public void descubrir(ReceptorEventos receptor, Evento eventos){
        for (Evento evento: Evento.values()){
            Objects.requireNonNull(evento,"");
            Objects.requireNonNull(receptor,"");
            receptores.get(evento).remove(receptor);
        }
    }

    public void notificar(Evento evento){
        for (ReceptorEventos receptor: receptores.get(evento)){
            receptor.actualizar(evento);
        }
    }
}
