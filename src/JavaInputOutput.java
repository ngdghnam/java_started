import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

import java.io.Console;

public class JavaInputOutput {
    public static void UsingBufferedReader() throws IOException {
        // Kiểu 1: Dùng BufferReader
        //Enter data using BufferReader
        // Sử dụng BufferReader để đọc input từ console.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your name: ");
        String name = reader.readLine();
        System.out.println("Your name is: " + name);

        // Đọc số từ console với Buffer Reader
        BufferedReader reader_2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your age: ");
        int age = Integer.parseInt(reader_2.readLine());
        System.out.println("your age: " + age);
        System.out.print("Input your height: ");
        double height = Double.parseDouble(reader_2.readLine());
        System.out.println("your height: " + height);
    }

    public static void UsingScanner()  {
        // Kiểu 2: Dùng Scanner (Thực tiễn hơn)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name_2 = scanner.nextLine();
        System.out.println("your name: " + name_2);

        // Đọc số từ console với Scanner
        System.out.print("Input your age: ");
        int age_3 = scanner.nextInt();
        System.out.println("your name: " + age_3);
        System.out.print("Input your height: ");
        double height_2 = scanner.nextDouble();
        System.out.println("your height: " + height_2);
    }

    public static void UsingConsole()  {
        /*
        * Sử dụng Console class cũng là một trong những cách thường dùng,
        * đặc biệt nó có thể dùng để đọc password thứ mà không hiện thị lên màn hình console
        * mà chỉ đọc ngầm bên dưới.
        * */

        // Sử dụng console class
        Console con = System.console();
        // Checking If there is no console available, then exit.
        if (con == null) {
            System.out.print("No console available");
            return;
        }
        System.out.println("Enter the password: ");
        char[] ch = con.readPassword();
        String pass = String.valueOf(ch);
        System.out.println("Password is: " + pass);
    }

    public static void main(String[] args) throws IOException {
        // Sử dụng BufferedReader phải throw exception  
        UsingBufferedReader();
        UsingScanner();
        UsingConsole();
    }
}
