public class SalesPerson extends Employee{
        private double sales,comm;
        public SalesPerson(int eid,String ename,double salary,double sales,double comm){
            super(eid, ename, salary);
            this.sales=sales;
            this.comm=comm;

        }
        public void display(){
            super.display();
            System.out.println("\t sales    "+sales);
            System.out.println("\t Commision "+comm);
        }
        public void calSal(){
            System.out.println(salary+(sales*comm));
        }
}
