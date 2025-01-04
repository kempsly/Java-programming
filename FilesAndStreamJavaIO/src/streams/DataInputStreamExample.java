package streams;

import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args){
        InputStream fileStream = DataInputStreamExample.class
                .getClassLoader().getResourceAsStream("output_dos.bin");
        if(fileStream==null){
            System.out.println("File does not exist");
        }
        try(
            DataInputStream dis = new DataInputStream(fileStream)
        ){
            double doubleValue = dis.readDouble();
            char charValue = dis.readChar();
            int intValue = dis.readInt();
            String stringValue = dis.readUTF();

            System.out.println("Double : " + doubleValue);
            System.out.println("Char : " + charValue);
            System.out.println("Int : " + intValue);
            System.out.println("String : " + stringValue);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


