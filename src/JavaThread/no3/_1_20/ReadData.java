package JavaThread.no3._1_20;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {
    public void readMethod(PipedInputStream inputStream) throws IOException {
        System.out.println("read:");
        byte[] bytes = new byte[8];
        int read = inputStream.read(bytes);
        while (read != -1) {
            String s = new String(bytes, 0, read);
            System.out.print("read:" + s + "  ");
            read = inputStream.read(bytes);
        }
        System.out.println();
        inputStream.close();
    }
}
