package org.benigaslo;


import org.benigaslo.controller.Controller;

public class Main {
    public static void main(String[] args) {
        new Controller().acorrer();

    }
}



/*

+-------+            return            +-------------+          (params)               +-------+
|       | ------ dades guardades ----> |             | ----- què mostrar / dades ----> |       |
| MODEL |                              | CONTROLADOR |                                 | VISTA |    o
|       | <--- actualització dades --- |             | <------ entrada usuari -------- |       |   /|\
+-------+          (params)            +-------------+            return               +-------+   / \

 */