package JavaThread.no3._1_20;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class WriteThread extends Thread{
    private WriteData writeData;
    private PipedOutputStream outputStream;

    public WriteThread(WriteData writeData, PipedOutputStream outputStream) {
        this.writeData = writeData;
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            writeData.writeMethod(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
