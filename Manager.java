public class Manager extends Employee {
    private double TA,DA;
    public Manager(int eid,String ename,double salary,double TA,double DA){
        super(eid, ename, salary);
        this.TA=TA;
        this.DA=DA;
    }
    public void display(){
        super.display();
        System.out.println("___________________________________________________________________________________________________________________________");
        System.out.println("\t TA      "+TA);
        System.out.println("\t DA      "+DA);

    }
    public void calSal(){
        System.out.println(salary+TA+DA);
    }
}
