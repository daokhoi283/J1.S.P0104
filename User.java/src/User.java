import java.io.BufferedReader;
import java.io.FileReader;

public class User {
    public static void inputFile(String fileName, String textFile) throws Exception{
        FileReader f = new FileReader(fileName);
        BufferedReader br = new BufferedReader(f);
        String a = "";
        while(true){ 
            a = br.readLine(); 
            if(a == null) break;
            if(a.contains(textFile))
            System.out.println(a);
        }
        f.close();
        br.close();
    }
}
