import java.io.*;


public class Get_Folder_Size {
    public static void main(String[] args) {
        File file = new File("D:\\SoftUni\\Files-and-Streams-Exercises-Resources\\Exercises Resources");

        if(file.exists()){
            if(file.isDirectory()){
                File [] files = file.listFiles();
                long size = 0;
                for (File f : files) {
                    if(!f.isDirectory()){
                        size += f.length();
                    }
                }

                System.out.println("Folder size: " + size);
            }
        }
    }
}
