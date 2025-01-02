package package2;
import package1.Parent;

public class DifferentPackageChild extends Parent{
    public void accessProtectedMethod(){
        protectedMethod();
    }
    public static void main(String[] args){
        DifferentPackageChild child = new DifferentPackageChild();
        child.accessProtectedMethod();
    }
}
