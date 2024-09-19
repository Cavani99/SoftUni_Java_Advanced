import java.io.*;

public class Write_Every_Third_Line {
    public static void main(String[] args) {
        String path = "D:\\SoftUni\\input.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(path));
             PrintWriter out = new PrintWriter(new FileWriter("D:\\SoftUni\\third_lines.txt"))){

            int line = 1;
            String current = in.readLine();
            while (current != null){
                if( line % 3 == 0)
                    out.println(current);

                line++;
                current = in.readLine();
            }

            System.out.println("File created!");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
