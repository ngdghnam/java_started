import java.util.Scanner;

public class JavaThirdOperator {
    String xetLoaiHocSinh(float diem) {
        String xetLoai = (diem >= 8.5f) ? "Hoc sinh gioi" : (diem < 8.5f && diem >= 6.5f) ? "Hoc sinh kha": "Hoc sinh trung binh";

        return xetLoai;
    }
    public static void main(String[] args) {
        JavaThirdOperator javaThirdOperator = new JavaThirdOperator();
        Scanner scanner = new Scanner(System.in);

        float diem = scanner.nextFloat();

        String result = javaThirdOperator.xetLoaiHocSinh(diem);
        System.out.println(result);
    }
}
