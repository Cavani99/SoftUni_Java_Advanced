import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize_Custom_Object {
    public static void main(String[] args) {
         Cube cube = new Cube();
         cube.color = "green";
         cube.width = 15.3d;
         cube.height = 12.4d;
         cube.depth = 3d;

         String path = "D:\\SoftUni\\serialized.txt";

         try (ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream(path))) {

             object.writeObject(cube);
         } catch (IOException e){
             e.printStackTrace();
         }

    }
}
