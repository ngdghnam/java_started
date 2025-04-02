public class JavaString {
    static void stringMethods() {
        String s = "Java String";
        //length -- Trả về độ dài của chuỗi
        System.out.println(s.length());

        //charAt -- Trả về kí tự char tại index thứ 10
        System.out.println(s.charAt(10)); //g
    }

    public static void main(String[] args) {
        // STRING LA IMMUTABLE --> KO THE THAY DOI
        // Cach 1: Tạo string bằng một chuỗi ký tự
        //hởi tạo 2 chuỗi str1 và str2 có chuỗi ký tự hoàn toàn giống,
        // sử dụng phép gán để khởi tạo một chuỗi, điều này không giống như việc khởi tạo một object
        String str1 = "Java String";
        String str2 = "Java String";
        System.out.println(str1 + " " + str2 );
        // Sau khi khởi tạo str1 thì chuỗi “shareprogrammimg” sẽ được lưu vào vùng nhớ heap tại string pool.
        // Đến khi khởi tạo khởi str2, việc đầu tiên là tìm kiếm trong string pool,
        // nếu đã có chuỗi tương tự thì sẽ không cần khởi tạo thêm mà gán thẳng cho str2,
        // nếu không thì mới bắt đầu khởi tạo.

        // Cách 2: Tạo stirng bằng 1 object
        //Đây là cách chính thống đây các bạn, sử dụng từ khoá new.
        // Lưu ý nếu như chúng ta khởi tạo chuỗi bằng từ khoá new
        // thì trình biên dịch sẽ không tiến hành kiểm tra trong string pool có tồn tại
        // object nào có giá trị như vậy chưa mà nó sẽ tiến hành khởi tạo cả 2 object
        // cho dù nó có cùng giá trị nhé.
        String str3 = new String("shareprogrammimg");
        String str4 = new String("shareprogrammimg");
        System.out.println(str3 + " " + str4);

        stringMethods();
    }
}
