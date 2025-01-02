public interface InterfaceName {

    //Constant
    int CONSTANT = 11;

    //abstract methods
    void methodName();

    //Default method
    default void defaultMethod(){
        System.out.println("Default implementation");
    }
    //static method
    static void staticMethod(){
        System.out.println("Static method implementation");
    }
}
