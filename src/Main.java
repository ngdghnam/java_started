// Lấy tất cả trong packageEx với *
import packageEx.*;
import packageEx2.*;

public class Main {
    public static void main(String[] args) {
        // Đây là comment trong IDE hay JAVA
        System.out.println("Hello World");
        System.out.println("This is a Beginner project for Developer starting to learn Java");

        PackageExample1 packageExample1 = new PackageExample1();
        packageExample1.display();

        PackageExample12 packageExample12 = new PackageExample12();
        packageExample12.display("I love Java");
    }
}