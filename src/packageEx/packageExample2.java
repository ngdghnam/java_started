package packageEx;

//Khai báo package
import packageEx.PackageExample1;

public class packageExample2 {
    public void consoleOut() {
        PackageExample1 packageExample1 = new PackageExample1();
        packageExample1.display();
    }
}
