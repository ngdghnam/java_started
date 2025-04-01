class ToanTuSoHoc {
    public static void MathSoHoc() {
        // Toán tử số học
        int a = 10; int b = 5;
        int c;
        c = a + b;
        System.out.println("Ket qua phep (+): " + c);
        c = a - b;
        System.out.println("Ket qua phep (-): " + c);
        c = a * b;
        System.out.println("Ket qua phep (*): " + c);
        c = a / b;
        System.out.println("Ket qua phep (/): " + c);
        c = a % b;
        System.out.println("Ket qua phep (%): " + c);
        a++;
        System.out.println("Ket qua phep (++): " + a);
        b--;
        System.out.println("Ket qua phep (--): " + b);
    }
}

class ToanTuQuanHe {
    public static void MathQuanHe() {
        // Toán tử quan hệ
        int a = 10; int b = 5;
        boolean d;
        d = a == b;
        System.out.println("Ket qua phep (==): " + d);
        d = a != b;
        System.out.println("Ket qua phep (-): " + d);
        d = a > b;
        System.out.println("Ket qua phep (*): " + d);
        d = a < b;
        System.out.println("Ket qua phep (/): " + d);
        d = a >= b;
        System.out.println("Ket qua phep (%): " + d);
        d = a <= b;
        System.out.println("Ket qua phep (++): " + d);
    }
}

class ToanTuBitWise{
    public static void MathBitwise() {
        int a = 60, b = 13;
        int c;
        System.out.println("bit a: " + Integer.toBinaryString(a));
        System.out.println("bit b: " + Integer.toBinaryString(b));
        c = a & b;
        System.out.println("Ket qua phep (&): " + Integer.toBinaryString(c));
        c = a | b;
        System.out.println("Ket qua phep (|): " + Integer.toBinaryString(c));
        c = a ^ b;
        System.out.println("Ket qua phep (^): " + Integer.toBinaryString(c));
        c = ~a;
        System.out.println("Ket qua phep (~): " + Integer.toBinaryString(c));
        c = a << 2;
        System.out.println("Ket qua phep (<<): " + Integer.toBinaryString(c));
        c = a >>2;
        System.out.println("Ket qua phep (>>): " + Integer.toBinaryString(c));
        c = a >>>2;
        System.out.println("Ket qua phep (>>>): " + Integer.toBinaryString(c));
    }
}

class ToanTuLogic{
    public static void MathLogic() {
        boolean a = true, b = false;
        boolean c;
        c = a && b;
        System.out.println("Ket qua phep (&&): " + c);
        c = a || b;
        System.out.println("Ket qua phep (||): " + c);
        c = !(a && b);
        System.out.println("Ket qua phep (!): " + c);
    }
}

public class JavaMathOperators {
    public static void main(String[] args) {
        // ToanTuQuanHe.MathQuanHe();
        // ToanTuSoHoc.MathSoHoc();
        ToanTuBitWise.MathBitwise();
        ToanTuLogic.MathLogic();
    }
}
