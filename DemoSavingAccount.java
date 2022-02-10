public class DemoSavingAccount {
    public static void main(String[] args) {
        SavingAccount s1=new SavingAccount(201, "Bhushan Deshmukh", 22367);
        SavingAccount s2=new SavingAccount(202, "Anurag Basu", 25000);
        s1.display();
        s2.display();
        s1.setRate(10);
        s1.display();
        s2.display();
    }
}
