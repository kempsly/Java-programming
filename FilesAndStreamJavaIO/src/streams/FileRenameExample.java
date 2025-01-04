package streams;

import java.io.File;
import java.io.IOException;


public class FileRenameExample {
    public static void main(String[] args){
        String filePath = "src/main/ressources/newFile.txt";
        String renameFilePath = "src/main/ressources/newFileChanged.txt";

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
        File renamedFile = new File(renameFilePath);
        if(file.renameTo(renamedFile)){
            System.out.println("File rename : " + renamedFile.getName());
        }else{
            System.out.println("File renaming failed.");
        }

        // Delete a file
        if(renamedFile.delete()){
            System.out.println("File deleted : " + renamedFile.getName());
        }else{
            System.out.println("File deleting failed.");
        }

    }
}

