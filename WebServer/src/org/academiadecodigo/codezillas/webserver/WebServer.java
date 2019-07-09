package org.academiadecodigo.codezillas.webserver;

public class WebServer {

    public static void main(String[] args) {

        Server server = new Server(9000);
        server.listen();
        server.getHeader();

    }
}
