public class Democustomer{

public static void main(String[] args){

Customer.setDiscount(6);
Customer obj1=new Customer();
obj1.display();
Customer obj2=new Customer(101,"Geeta","geeta123@gmail.com");
obj2.display();
Customer obj3=new Customer(102,"Gopal","gopal123@gmail.com");
obj3.display();
obj1.setDiscount(15);
System.out.println("-------After change discount-------");
obj1.display();
obj2.display();
obj3.display();




}





}
