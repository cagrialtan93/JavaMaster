package ModifierPractice;

abstract class ClassOfHell {
    protected String hello;

    public ClassOfHell(String hello) {
        this.hello = hello;
    }

    void printOfHell(){
        System.out.println(this.hello + " of !");
    }
}
