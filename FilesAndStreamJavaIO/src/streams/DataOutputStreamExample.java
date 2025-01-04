package streams;

import java.io.*;

public class DataOutputStreamExample {
    public static void main(String[] args){
        String data = "Test data using BufferedOutputStream";
        try(FileOutputStream fos = new FileOutputStream(
                "src/main/ressources/output_dos.bin");
            DataOutputStream dos = new DataOutputStream(fos);
        ){
            byte[] bytesArray = data.getBytes();
            dos.writeDouble(5.8);
            dos.writeChar('Y');
            dos.writeInt(99);
            dos.writeUTF("This allow writing an entire string");


            //bos.write(bytesArray);
            //Ensures that all data currently in
            // the buffer is sent to the target
            // destination immediately
            dos.flush();

            System.out.println("Data written to file successfully!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


