package streams;

import java.io.File;

public class FolderDirectoryCreatingExample {
    public static void main(String[] args){
        String dirPath = "src/main/ressources/file";
        String nestedDirPath = "src/main/ressources/file/subdir1/subdir2";

        File dir = new File(dirPath);
        if(!dir.exists()){
            if(dir.mkdir()){
                System.out.println("Directory created : " + dir.getName());
            }else{
                System.out.println("Failed to create directory.");
            }
        }else{
            System.out.println("Directory already exists.");
        }

        //For creating nested directories
        File nestedDir = new File(nestedDirPath);
        if(!nestedDir.exists()){
            if(nestedDir.mkdirs()){
                System.out.println("Directories created : " + nestedDir.getName());
            }else{
                System.out.println("Failed to create directories.");
            }
        }else{
            System.out.println("Directories already exists.");
        }

        }

}
