public class JavaSwitchCase {
    String xacDinhThang(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Year " + year + " Month " + month + " has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Year " + year + " Month " + month + " has 30 days");
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("Year " + year + " Month " + month + " has 29 days");
                    break;
                } else {
                    System.out.println("Year " + year + " Month " + month + " has 28 days");
                    break;
                }
            default:
                System.out.println("Invalid month");
                break;
        }
        return null;
    }
    public static void main(String[] args) {
        JavaSwitchCase javaSwitchCase = new JavaSwitchCase();
        int year = 2020;
        int month = 2;
        String res = javaSwitchCase.xacDinhThang(month, year);
        System.out.println(res);
    }
}
