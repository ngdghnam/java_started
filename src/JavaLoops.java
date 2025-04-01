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

    public static void main(String[] args) {
        JavaLoops javaLoops = new JavaLoops();
        System.out.println("Vong lap for");
        javaLoops.vongLapFor();
        System.out.println("Vong lap for-each");
        javaLoops.vongLapForEach();
    }
}
