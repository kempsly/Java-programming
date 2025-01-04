package streams;

import java.io.*;

public class BufferedInputStreamTextFile {
    public static void main(String[] args){
        InputStream fileStream = DataInputStreamExample.class
                .getClassLoader().getResourceAsStream("outputStream.txt");
        if(fileStream==null){
            System.out.println("File does not exist");
            return;
        }
        try(
                BufferedInputStream bis = new BufferedInputStream(fileStream)
        ){
            int data;
            while((data = bis.read()) != -1){
                System.out.print((char)data);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



