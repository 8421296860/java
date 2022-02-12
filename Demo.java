public class Demo {
        public static void main(String[] args) {
            Employee e1=new Employee(101,"sagar",34000);
            Manager m1=new Manager(102, "omkar", 67000, 3000, 2000);
            SalesPerson sp1=new SalesPerson(103, "kamlesh", 15000, 2000, 500);
            e1.display();
            m1.display();
            sp1.display();
            Employee[]e=new Employee[5];
            e[0]=new Manager(104, "kajal", 56000, 1000, 5000);
            e[1]=new Employee(105, "prabhas", 34000);
            e[2]=new SalesPerson(106, "mayur", 20000, 200, 50);
            e[3]=new Manager(107, "Bhushan", 100000, 5000, 3000);
            e[4]=new Employee(108, "amruta", 35000);
            e[0].display();
            e[1].display();
            e[2].display();
            e[3].display();
            e[4].display();

        }
}
