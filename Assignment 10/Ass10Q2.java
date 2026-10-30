
interface Father {
    default void show() {
        System.out.println("Father's method");
    }
}

interface Mother {
    default void display() {
        System.out.println("Mother's method");
    }
}

class Child implements Father, Mother {
    void childMethod() {
        System.out.println("Child's method");
    }
}

public class As10Q2 {
    public static void main(String[] args) {
        Child c = new Child();

        c.show();
        c.display();
        c.childMethod();
    }
}
