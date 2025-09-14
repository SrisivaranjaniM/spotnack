import java.util.Scanner;
public class personal_details{
    public static void main (String []args){
        final String name="SRI SIVARANJANI M";
        System.out.println("Name: "+name);
        Scanner a=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=a.nextInt();
        a.nextLine();
        System.out.print("Enter your college name: ");
        String college=a.nextLine();
        System.out.print("Enter your native: ");
        String native_place=a.nextLine();
        System.out.print("Enter your department: ");
        String dep=a.nextLine();
    }
}
