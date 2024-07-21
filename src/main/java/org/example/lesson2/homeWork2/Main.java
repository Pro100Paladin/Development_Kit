package org.example.lesson2.homeWork2;


import org.example.lesson2.homeWork2.DB.SaveStorage;
import org.example.lesson2.homeWork2.client.ClientController;
import org.example.lesson2.homeWork2.client.ClientGUI;
import org.example.lesson2.homeWork2.server.ServerController;
import org.example.lesson2.homeWork2.server.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerController serverController = new ServerController(new ServerWindow(), new SaveStorage());

        new ClientController(new ClientGUI(), serverController);
        new ClientController(new ClientGUI(), serverController);
    }
}
