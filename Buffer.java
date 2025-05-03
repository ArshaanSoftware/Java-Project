import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Buffer {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Login Form");
        try {
            System.out.print("Enter your name : ");
            String str = reader.readLine();
            System.out.print("Enter your salary : ");
            float num = Float.parseFloat(reader.readLine());
//            int num = Integer.parseInt(reader.readLine());
            System.out.println("Your name is : " + str);
            System.out.println("Your salary is : " + num);
        } catch (IOException e){
                System.out.println("Error" + e.getMessage());
        }
    }
}
