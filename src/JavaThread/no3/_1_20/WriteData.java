package JavaThread.no3._1_20;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {
    public void writeMethod(PipedOutputStream outputStream) throws IOException {
        System.out.println("write:");
        for (int i = 0; i < 100; i++) {
            String outData = "" + i;
            outputStream.write(outData.getBytes());
            System.out.print(outData + "  ");
        }
        System.out.println();
        outputStream.close();
    }
}
