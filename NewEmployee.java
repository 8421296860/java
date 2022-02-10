public class NewEmployee {
    private int studentClass,rollNumber;
    static String schoolName;
    //public NewEmployee(int i, int j, String string) {
    //}
    public NewEmployee(int studentClass,int rollNumber,String schoolName){
        this.studentClass=studentClass;
        this.rollNumber=rollNumber;
        this.schoolName=schoolName;
    }
    public NewEmployee(int studentClass,int rollNumber){
        this.studentClass=studentClass;
        this.rollNumber=rollNumber;
       }

    public NewEmployee(String schoolName){
        this.schoolName=schoolName;
    }
    public void display(){
        System.out.println("Employee["+studentClass+"\t"+rollNumber+"\t"+schoolName+"]");

    }
    public void changeSchool(String schoolName){
        this.schoolName=schoolName;
    }

    
}
