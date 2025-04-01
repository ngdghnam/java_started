public class JavaVariables {
    // static variable
    // Biến static là một biến mà có thể truy cập và thay đổi chúng thông qua Class Name.
    // Cách thay đổi: <Tên class>.<Tên biến static> Or <Instance>.<Tên biến static>
    //Các biến static chỉ được khởi tạo duy nhất một lần tại thời điểm tải Class.
    // Điều này có ý nghĩa là mặc cho bạn khởi tạo bao nhiêu instance
    // của class thì biến static vẫn là duy nhất.
    static String staticVariable = "I'm static variable";

    //non-static variable
    //Một biến non-static thuộc về một object,
    // các object này lưu trữ trạng thái của nó thông qua các thuộc tính non-static.
    String instanceVariable = "I'm instance variable";


    public static void localVariables() {
        // Local variable là một biến được khai báo bên trong một hàm.
        // Không thể truy cập/ thay đổi giá trị của chúng ở bên ngoài hàm.
        int a = 5;
        System.out.println(a);
    }

    public static void main(String[] args) {
        // QUY TẮC ĐẶT BIẾN
        /*
        * Tên biến không thể chứa dấu khoảng trắng. Ví dụ int num ber = 1.
        * Tên biến có thể bắt đầu bằng các ký tự đặc biệt như $ và _ etc.
        * Tên biến phải có ý nghĩa đúng với mục đích nó được khai báo.
        * */
        //Đặt biến theo kiểu Camel:
        /*
         * Từ có 2 âm trở lên: useHook --> chữ đầu viết thường, chữ thứ hai viết hoa
         */
        // Trong java có 3 kiểu dữ liệu
        /*
        * Local
        * Static
        * Non-static
        * Parammeter
        * */

        // Variables
        int a = 10; // Cách 1
        //Cách 2
        int b;
        b = 10;
        System.out.printf("Variable 1: %d\nVariable 2: %s\n", a, b);

        //Gọi hàm
        localVariables();

        //Thay đổi static strings
        // Khai bao 2 Instance StaticVariable
        JavaVariables obj1 = new JavaVariables();
        JavaVariables obj2 = new JavaVariables();
        //Truy cập thông quan instance
        System.out.println(obj1.staticVariable);
        System.out.println(obj2.staticVariable);

        //truy cap truc ten thong qua ten class
        System.out.println(JavaVariables.staticVariable);

        //Thay doi gia tri bien static thong qua instance
        obj1.staticVariable = "First time Changed";
        System.out.println(obj1.staticVariable);
        System.out.println(obj2.staticVariable);

        // Thay đổi thông qua classs
        JavaVariables.staticVariable = "Second time Changed";
        System.out.println(obj1.staticVariable);
        System.out.println(obj2.staticVariable);

        //non static
        JavaVariables obj3 = new JavaVariables();
        JavaVariables obj4 = new JavaVariables();

        obj3.instanceVariable = "OBJ3";
        obj4.instanceVariable = "OBJ4";
        System.out.println(obj3.instanceVariable);
        System.out.println(obj4.instanceVariable);
    }
}
