
public class lab4_task2 {
    public static void main(String[] args) {
        
    }   
}

class Address_book{
    public displaySalaryReport(int baseSalary,int days){
        int salaryy = a1.compute_Salary();
    }
}

abstract class Employee extends Address_book{
    private String name;
    private String age;
    private char gender;
    
    public int get_age(){
        return age;
    }
    public abstract int compute_Salary(int base_Salary, int days);

}

class board_members extends Employee{

    int compute_Salary(int base_salary, int days){
        int salary, agee;
        agee = get_age();
        salary = base_salary+days*35+age*100;


        return salary;
    }
}

class worker extends Employee{

    int compute_Salary(int base_Salary , int days){
        int salary, agee;
        agee= get_age();
        salary =  base_Salary + days*45 + age*50

        return salary;
    }
}





