class Student{
    private String name;
    private int age;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if(marks >= 0 && marks <= 100){
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Marks should be between 0 and 100.");
            return;
        }        
    }
}

class BankAccount{
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0){
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Balance cannot be negative.");
            return;
        }
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}

public class EncapsulationPractice {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setAge(20);
        student.setMarks(85);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Marks: " + student.getMarks());

        BankAccount account = new BankAccount();
        account.setAccountNumber("123456789");
        account.setBalance(1000.0);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.withdraw(200.0);
        account.withdraw(900.0);
    }
}