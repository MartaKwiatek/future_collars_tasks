package org.Marta;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 2021);

        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        System.out.println(Instant.now() + " Message to the server: " + list);

        outputStream.writeObject(list);

        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

        String messageFromServer = (String) inputStream.readObject();
        System.out.println(Instant.now() + " Message from the server: " +  messageFromServer);
    }
}
