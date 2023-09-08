import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        String filename, textFile;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter directory of file: ");
        filename = sc.nextLine();
        System.out.print("Please enter string to search: ");
        textFile = sc.nextLine(); 
        User u = new User();
        u.inputFile(filename, textFile);
    }
}
