public class Person{
    private String name;
    private int age;
    private String nationality;
    public void setData(String name,int age,String nationality){
        this.name=name;
        this.age=age;
        this.nationality=nationality;
}
public void display(){
   if(age>18 & nationality=="Indian") {
       System.out.println("Hello "+name+" your age is "+age+" and your nationality is "+nationality+", Congrats! You are eligible for voting...."); }
   else {
       System.out.println("Hello "+name+" your age is "+age+" and your nationality is "+nationality+", Sorry! You are not eligible for voting....");
    }
    
}
}