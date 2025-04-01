package packageEx2;

import packageEx2.subPackage.subPackageExample1;

public class PackageExample12 {
    public void display(String message) {
        subPackageExample1 obj = new subPackageExample1();
        obj.display();
        System.out.println(message);
    }
}
