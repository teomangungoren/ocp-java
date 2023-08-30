package coreJava.RecentlyAddedFeatures;

record Employee(String name,int id){}

public class RecordDemo {
     public static void main(String[] args) {
        Employee[] employeeList=new Employee[4];
        
        employeeList[0]=new Employee("theo", 12);
        employeeList[1]=new Employee("alexa", 13);
        employeeList[2]=new Employee("demie", 14);
        employeeList[3]=new Employee("margot", 15);

        for(Employee e:employeeList)
            System.out.println("The employee ID for"+e.name()+" is "+e.id());


     }
    
}
