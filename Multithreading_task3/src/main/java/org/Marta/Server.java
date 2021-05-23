package org.Marta;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.Instant;
import java.util.List;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(2021);
        System.out.println(Instant.now() + " Server is up");
        System.out.println(Instant.now() + " Server is waiting for a request");

        Socket accept = serverSocket.accept();
        System.out.println(Instant.now() + " Server is processing a request...");

        ObjectInputStream stream = new ObjectInputStream(accept.getInputStream());
        @SuppressWarnings("unchecked")
        List<Integer> list = (List<Integer>) stream.readObject();
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(Instant.now() + " Server got list: " + list);

        ObjectOutputStream outputStream = new ObjectOutputStream(accept.getOutputStream());
        String messageToClient = "Sum: " + sum;
        outputStream.writeObject(messageToClient);
    }
}
