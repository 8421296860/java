public class Customer{

private int cid;
private String cname;
private String email;
private static int discount=10;
public Customer() //no argument constructor
{

}


public static void setDiscount(int dis){

discount=dis;


}
public Customer(int cid,String cname,String email)   //parameterized constructor
{

this.cid=cid;
this.cname=cname;
this.email=email;



}

public void display(){

System.out.println("Discount "+discount);
System.out.println("Customer ["+cid+"\t"+cname+"\t"+email+"]");



}
}
