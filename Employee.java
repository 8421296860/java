import java.util.jar.Attributes.Name;

public class Employee{
    private int eid;
    protected double salary;
    private String ename;
    public Employee(int eid,String ename, double salary){
        super();
        this.eid=eid;
        this.ename=ename;
        this.salary=salary;
    }
    public void display(){
        System.out.println("___________________________________________________________________________________________________________________________");
        System.out.println("\t Employee Id "+eid);
        System.out.println("\t Name        "+ename);
        System.out.println("\t Salary      "+salary);
    }
    abstract public void calSal(){

    }
    
}