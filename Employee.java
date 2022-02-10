import java.sql.Date;

public class Employee {
    private int eid;
    private String ename;
    private Date bday;
    public Employee(){

    }
    public Employee(int eid,String ename,int d,int m,int y){
        this.eid=eid;
        this.ename=ename;
        bday=new Date(d,m,y);

    }

    public void display(){
        System.out.println("Employee["+eid+"\t"+ename+"\t"+bday+"]");
    }
}
