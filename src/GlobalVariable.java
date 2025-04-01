/*
* Trong Java không có khái niệm về biến global,
* do đó chúng ta không thể tạo các một biến global
* như trong các ngôn ngữ khác chẳng hạn như C hoặc C++.
* Tuy nhiên chúng ta có thể đạt được điều tương tự bằng cách sử dụng
* các khái niệm khác trong Java như biến static trong class hoặc khai báo
* các biến trong interface như một hằng số.
* */

//Chúng ta có thể sử dụng biến static như một biến global
// bởi vì chúng thường được dùng để chia sẽ các dữ liệu chung
// dùng cho tất cả các object chứ không thuộc riêng về một object nào.

class Employee{
    static int count;
}

//Khởi tạo biến global sử dụng Interface
//Một cách khác để tạo biến global trong Java đó là sử dụng interface.
//Lưu ý các biến được khởi tạo trong Interface mặc định là static và final,
// do vậy những biến này có thể được sử dụng ở bất cứ đâu
// tuy nhiên chúng ta sẽ không thể thay đổi giá trị của chúng.
// Đó là lý do vì sao chúng ta có thể gọi chúng là các hằng số.
interface EmployeeService {
    int WORKER_TYPE = 0;
    int MANAGER_TYPE = 1;
}

class EmployeeServiceImpl implements EmployeeService {
    public int type;
    public EmployeeServiceImpl(int type) {
        this.type = type;
    }
}

//Khởi tạo biến global với từ khóa static và final
//Tương tự như trên interface,
// chúng ta có thể sử dụng từ khóa static và final để tạo ra một hằng số có thể được sử dụng ở bất cứ đâu,
// tuy nhiên không thể chỉnh sửa giá trị của chúng.
class Student {
    public static final String LEADER = "Leader";
    public static final String STUDENT = "Student";
}

public class GlobalVariable {
    public static void main(String[] args) {
        Employee.count = 0;
        System.out.println("Count: " + Employee.count);
        Employee.count++;
        System.out.println("Count: " + Employee.count);

        EmployeeServiceImpl manager = new EmployeeServiceImpl(EmployeeService.MANAGER_TYPE);
        System.out.println("Type: " + manager.type);
        EmployeeServiceImpl worker = new EmployeeServiceImpl(EmployeeService.WORKER_TYPE);
        System.out.println("Type: " + worker.type);

        System.out.println("Type: " + Student.LEADER);
        System.out.println("Type: " + Student.STUDENT);
    }
}
