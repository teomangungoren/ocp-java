package coreJava.Interfaces.Clone;

public class CloneTest {
    
    public static void main(String[] args) {
        try{
            Employee original=new Employee("teoman", 4000);
            original.setHireDay(2023, 7, 3);
            Employee cloned=original.clone();
            cloned.raiseSalary(12);
            cloned.setHireDay(2024, 10, 10);
            System.out.println("original: "+original);
            System.out.println("cloned: "+cloned);
        }
        catch(CloneNotSupportedException exception){
           exception.printStackTrace();
        }
    }
}
