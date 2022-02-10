public class EmployeeData {
        public static void main(String[] args) {
            NewEmployee ne1= new NewEmployee(10,40,"JNV");
            ne1.display();
            NewEmployee ne2=new NewEmployee("KV");
            NewEmployee ne3=new NewEmployee(12,34);
            ne1.display();
            ne2.display();
            ne3.display();
            ne3.changeSchool("JNV");
            ne3.display();
            ne2.display();
            ne1.display();

        }
}
