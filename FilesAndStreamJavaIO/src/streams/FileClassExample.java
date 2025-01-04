package streams;

import java.io.File;
import java.io.IOException;

public class FileClassExample {
    public static void main(String[] args){
        String filePath = "src/main/ressources/newFile.txt";

        File file = new File(filePath);
        if(file.exists()){
            System.out.println("File exists");
        }else{
            System.out.println("File doest not exists, creating it....");
            try{
                if(file.createNewFile()){
                    System.out.println("File created " + file.getName());
                } else {
                    System.out.println("Failed to create the file.");
                }
            } catch (IOException e) {
                System.out.println("An error occured while creating the file.");
                e.printStackTrace();
            }
        }
        System.out.println("File name : " + file.getName());
        System.out.println("File Path : " + file.getPath());
    }
}
