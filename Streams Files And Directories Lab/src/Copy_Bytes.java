import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_Bytes {
    public static void main(String[] args) {
        String path = "D:\\SoftUni\\input.txt";

        try (FileInputStream stream = new FileInputStream(path)){
            FileOutputStream out = new FileOutputStream("D:\\SoftUni\\ascii.txt");
            int oneByte = stream.read();
            while (oneByte >= 0){
               String digits = String.valueOf(oneByte);

               char value = (char)oneByte;
               if(value == ' '|| value == '\n')
                   out.write(value);
               else{
                   for (int i = 0; i < digits.length(); i++) {
                       out.write(digits.charAt(i));
                   }
               }

                oneByte = stream.read();
            }
            System.out.println("File created!");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
