public class ThisKeywordDemo {
    private String name;
    private int age;

    public ThisKeywordDemo() {
        this.name = "Unknown";  
        this.age = 0;          
    }
    
    public ThisKeywordDemo(String name, int age) {
        this.name = name;  
        this.age = age;    
    }

    public void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj1 = new ThisKeywordDemo();
        obj1.display();

        ThisKeywordDemo obj2 = new ThisKeywordDemo("John", 25);
        obj2.display();
    }
}