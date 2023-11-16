import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StreamMain {
    public static void main(String[] args) {
        BufferedReader reader = null;
        PrintWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\truda\\Desktop\\java\\thierry.txt"));
            writer = new PrintWriter(new FileWriter("C:\\Users\\truda\\Desktop\\java\\thierry2.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print the stack trace for better debugging
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace(); // Print the stack trace for better debugging
            }
        }
    }
}

