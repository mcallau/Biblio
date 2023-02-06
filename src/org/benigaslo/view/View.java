package org.benigaslo.view;

import org.benigaslo.controller.AgendaDTO;
import org.benigaslo.model.Agenda;

import java.util.List;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1) Añadir agenda");
        System.out.println("2) Ver agendas");
    }

    public int pedirOpcion() {
        System.out.println("OPCION: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
    }

    public void mostrarAgendas(List<Agenda> agendas) {
        System.out.println("LISTA DE Bibliotecas");

        agendas.forEach(agenda -> System.out.println(agenda.nombre + " " + agenda.descripcion));
    }

    public AgendaDTO pedirDatosAgendaNueva() {
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Descripcion: ");
        String descripcion = scanner.nextLine();

        return new AgendaDTO(nombre, descripcion);
    }
}
