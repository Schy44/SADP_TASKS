// Object Creation(Interface passed as parameter in Constructor

interface MyInterface {
    void myMethod();
}

class MyClass {
    private MyInterface interface;

    public MyClass(MyInterface interface) {
        this.interface = interface;
    }

    public void executeMethod() {
        interface.myMethod();
    }
}

class MyImplementation implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Method in MyImplementation class");
    }
}

public class Main {
    public static void main(String[] args) {

        MyImplementation implementation = new MyImplementation();

        MyClass myClass = new MyClass(implementation);

        myClass.executeMethod();
    }
}
