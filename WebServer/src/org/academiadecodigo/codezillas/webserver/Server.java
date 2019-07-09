package org.academiadecodigo.codezillas.webserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private int port;
    private Socket userSocket;
    private ServerSocket serverSocket;

    public Server(int port){
        this.port = port;
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listen(){
        try {
            userSocket = serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getHeader(){

        try {
            String line = "";
            String header = "";

            BufferedReader reader = new BufferedReader(new InputStreamReader(userSocket.getInputStream()));

            System.out.println(reader.readLine());

            //System.out.println(new String(userSocket.getInputStream().read()));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
