public class MethodDemo {
        
    // Static method
    public static void greet() {
        System.out.println("Hello!");
    }
    
    // Instance method
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    public static void main(String[] args) {
        // Example of calling a static method
        greet();
        
        // Example of calling an instance method
        MethodDemo demo = new MethodDemo();
        demo.sayHello("World");
    }
}