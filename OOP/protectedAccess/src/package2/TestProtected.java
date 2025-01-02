package package2;
import package1.Parent;

public class TestProtected extends Parent {
    public static void main(String[] args){
        Parent parent = new Parent();

        System.out.println("Can not access the protected method.");
    }
}
