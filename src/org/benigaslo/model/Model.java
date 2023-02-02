package org.benigaslo.model;

import org.benigaslo.controller.BiblioDTO;

import java.util.ArrayList;
import java.util.List;

public class Model {

    List<Agenda> agenda = new ArrayList<>();


    public void guardarBiblioteca(BiblioDTO datos){
        agenda.add(new Agenda());
    }


    public List<Agenda> obtenerListaBibliotecas() {
        return agenda;
    }
}
