public class JavaLoops {
    void vongLapFor() {
        for(int i=0; i < 5; i++) {
            System.out.println(i);
        }
    }

    void vongLapForEach() {
        int[] arr = {1, 3, 5};
        for(int item : arr) {
            System.out.println(item);
        }
    }

    void vongLapWhile() {
        int i = 10;
        // kiếm tra điều kiện
        while (i >= 0) {
            if (i ==8) {
                continue;
            }
            // Xuất ra màn hình giá trị i
            System.out.println(i);
            // Cập nhật biến đếm
            i--;
        }
    }

    void vongLapWhileTrue() {
        while(true) {
            System.out.println("This is forever loop");
            break;
        }
    }

    void vongLapDoWhile() {
        int i = 1;
        do {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void main(String[] args) {
        JavaLoops javaLoops = new JavaLoops();
        System.out.println("Vong lap for");
        javaLoops.vongLapFor();
        System.out.println("Vong lap for-each");
        javaLoops.vongLapForEach();
        System.out.println("Vong lap while");
        javaLoops.vongLapWhile();
    }
}