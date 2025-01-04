package streams;
import java.io.*;

public class DisplayFilesInDirectory {
    public static void main(String[] args){
        String dirPath = "src/main/ressources";
        File dir = new File(dirPath);

        File[] files = dir.listFiles();
        if(files != null && files.length>=0){
            for(File f: files){
                System.out.println(f.getName());
            }
        }
    }
}
