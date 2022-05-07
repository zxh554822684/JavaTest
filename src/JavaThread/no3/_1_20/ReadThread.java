package JavaThread.no3._1_20;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadThread extends Thread{
    private ReadData readData;
    private PipedInputStream inputStream;

    public ReadThread(ReadData readData, PipedInputStream inputStream) {
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {
            readData.readMethod(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
