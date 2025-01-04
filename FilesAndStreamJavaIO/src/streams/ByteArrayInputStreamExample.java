package streams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
    public static void main(String[] args){
        // Array based on the ASCII table
        byte[] data = {72, 101, 101, 108, 111};

        ByteArrayInputStream inputStream = null;
        try{
            inputStream = new ByteArrayInputStream(data);
            int byteData;
            while((byteData = inputStream.read()) != 1){
                System.out.print((char)byteData);
            }
        } catch (Exception e) {

            System.out.println("Error during input stream");
        }finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    //throw new RuntimeException(e);
                }
            }
        }


    }
}
