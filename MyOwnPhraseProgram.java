public class MyOwnPhraseProgram{
public static void main(String[] args){
String[] fname={"Bhushan","Aishwarya","Pramila"};
String mname="Satish";
String lname="Deshmukh";
int lenght1=fname.length;
int ran1=(int) (Math.random()*lenght1);
System.out.println(fname[ran1]+" "+mname+" "+lname);
}
}
