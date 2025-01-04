package streams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputExample {
    public static void main(String[] args){
        String data = "Test data using BufferedOutputStream";
        try(FileOutputStream fos = new FileOutputStream(
                "src/main/ressources/output_bos.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
        ){
            byte[] bytesArray = data.getBytes();
            bos.write(bytesArray);
            //Ensures that all data currently in
            // the buffer is sent to the target
            // destination immediately
            bos.flush();

            System.out.println("Data written to file successfully!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

