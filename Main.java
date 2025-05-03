import java.util.*;
class Main{
    public static <string> void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String str = sc.nextLine();

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.print("Enter your salary : ");
        float sal = sc.nextFloat();

        System.out.println("your name is : " + str);
        System.out.println("your age is : " + age);
        System.out.println("Your salary is : " + sal);
    }
}