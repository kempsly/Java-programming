package streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args){
        String data = "Test data using fileoutputStream";
        try(FileOutputStream fos = new FileOutputStream(
                "src/main/ressources/output.txt")){
            byte[] bytesArray = data.getBytes();
            fos.write(bytesArray);
            //Ensures that all data currently in
            // the buffer is sent to the target
            // destination immediately
            fos.flush();

            System.out.println("Data written to file successfully!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
