package org.benigaslo.model;

import org.benigaslo.controller.AgendaDTO;

import java.util.ArrayList;
import java.util.List;

public class Model {

    List<Agenda> agendas = new ArrayList<>();


    public void guardarAgenda(AgendaDTO datos){

        agendas.add(new Agenda(datos.nombre, datos.descripcion));
    }


    public List<Agenda> obtenerListaAgendas() {
        return agendas;
    }
}
