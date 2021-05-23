package org.Marta;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.time.Instant;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 2021);

        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        String textToServer = "Hello I'm a Client!";

        System.out.println(Instant.now() + " Message to the server: " + textToServer);

        outputStream.writeObject(textToServer);

        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        String messageFromServer = (String) inputStream.readObject();
        System.out.println(Instant.now() + " Message from the server in UpperCase : " +  messageFromServer);
    }
}
