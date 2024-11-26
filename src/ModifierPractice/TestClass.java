package ModifierPractice;

import java.util.logging.Level;

public class TestClass extends ClassOfHell implements TestInterface{
    public TestClass(String hello) {
        super(hello);
    }



    @Override
    public void printHello() {

    }

    @Override
    public void sayGoodbye() {

    }

    @Override
    public void printEnums() {
        for (TestEnum x :
                TestEnum.values()) {
            System.out.println(x);
        }
    }
}
