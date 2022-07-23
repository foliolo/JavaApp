package com.bootcamp.ejercicio.tema5;

interface CocheCRUD {
    void save();

    void findAll();

    void delete();
}

/**
 * Crear una interfaz CocheCRUD.
 * Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
 * Como métodos de CocheCRUD podemos poner:
 * save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
 * Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
 * Ejemplo:
 * CocheCRUD cocheCrud = new CocheCRUDImpl()
 */
public class Main {

    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}

class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void findAll() {
        System.out.println("findAll");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}