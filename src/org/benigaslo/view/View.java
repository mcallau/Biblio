package org.benigaslo.view;

import org.benigaslo.controller.BiblioDTO;
import org.benigaslo.model.Agenda;

import java.util.List;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1) Añadir biblioteca");
        System.out.println("2) Ver bibliotecas");
    }

    public int pedirOpcion() {
        System.out.println("Opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
    }

    public void mostrarBibliotecas(List<Agenda> agenda) {
        System.out.println("LISTA DE Bibliotecas");

        agenda.forEach(agenda -> System.out.println(agenda.nombre));
    }

    public BiblioDTO pedirDatosBibliotecaNueva() {
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ciudad: ");
        String ciudad = scanner.nextLine();

        return new BiblioDTO(nombre, ciudad);

    }
}
