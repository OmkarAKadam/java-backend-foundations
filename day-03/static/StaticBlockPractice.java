class Demo {
    static {
        System.out.println("Static block executed.");
    }

    public Demo() {
        System.out.println("Constructor executed.");
    }
}

public class StaticBlockPractice {
    public static void main(String[] args) {
        System.out.println("Main method started.");
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();   
    }
}