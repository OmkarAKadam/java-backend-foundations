class Student{
    String name;
    int marks[] = new int[3];

    public int getAverage(){
        int sum = 0;
        for(int i=0; i<marks.length; i++){
            sum += marks[i];
        }
        return sum/marks.length;
    }

    public String getGrade(){
        int average = getAverage();
        if(average >= 90){
            return "A";
        } else if(average >= 80){
            return "B";
        } else if(average >= 70){
            return "C";
        } else if(average >= 60){
            return "D";
        } else {
            return "F";
        }
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Average: " + getAverage());
        System.out.println("Grade: " + getGrade());
    }
}

class BankAccount{
    String accountHolder;
    double balance;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void displayBalance(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class Book{
    String title;
    String author;
    double price;

    public double applyDiscount(double discountPercentage){
        return price - (price * discountPercentage / 100);
    }
}