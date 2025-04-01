import java.util.Scanner;
import java.lang.Math;

public class JavaIfElse {
    String giaiPTB2(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Phương trình trở thành phương trình bậc 1");
            if (b == 0 && c == 0) {
                return "Phuong trinh co vo so nghiem";
            }
            else if (b == 0 && c != 0) {
                return "Phuong trinh vo nghiem";
            }
            int x = -c/b;
            return "Phuong trinh co nghiem" + x;
        }
        else {
            if (a > 0) {
                double delta = b*b - (4*a*c);
                if (delta < 0) {
                    return "Phuong trinh vo nghiem";
                }
                else if (delta == 0) {
                    double x = (-b / (2*a));
                    return "Phuong trinh co nghiem kep: " + x;
                }
                else {
                    double x1 = (-b + Math.sqrt(delta)) / (2*a);
                    double x2 = (-b - Math.sqrt(delta)) / (2*a);
                    return "Phương trình có 2 nghiệm phân biệt: " + x1 + " " + x2;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        JavaIfElse javaIfElse = new JavaIfElse();
        //javaIfElse.giaiPTB2(a, b, c);
        String message = javaIfElse.giaiPTB2(a, b, c);
        System.out.println(message);
    }
}
