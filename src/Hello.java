public class Hello {
    private String hello;
    private String name;

    public Hello() {
        this("default","default");
    }

    public Hello(String hello) {
        this("hello", "default");
    }

    public Hello(String hello, String name) {
        this.hello = hello;
        this.name = name;
    }

    @Override
    public String toString() {
        return "hello";
    }
}
