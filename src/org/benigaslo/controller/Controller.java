package org.benigaslo.controller;

import org.benigaslo.model.Agenda;
import org.benigaslo.model.Model;
import org.benigaslo.view.View;

import java.util.List;

public class Controller {

    View view = new View();
    Model model = new Model();


    public void acorrer(){
        while(true) {
            view.mostrarMenu();

            int o = view.pedirOpcion();

            if (o == 1) {
                AgendaDTO datos = view.pedirDatosAgendaNueva();

                model.guardarAgenda(datos);
            } else if (o == 2) {
                List<Agenda> agendas = model.obtenerListaAgendas();
                view.mostrarAgendas(agendas);
            }
        }
    }
}
