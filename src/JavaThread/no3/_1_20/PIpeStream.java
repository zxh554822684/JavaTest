package JavaThread.no3._1_20;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PIpeStream {
    public static void main(String[] args) throws InterruptedException {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream();


        try {
            pipedOutputStream.connect(pipedInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ReadThread readThread = new ReadThread(readData, pipedInputStream);
        WriteThread writeThread = new WriteThread(writeData, pipedOutputStream);
        readThread.start();
        Thread.sleep(2000);
        writeThread.start();
    }
}
