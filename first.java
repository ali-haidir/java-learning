
class Address_book{
    String naam;

    private Employee[] entry = array;
    public int length= entry.length;

    public Address_book(){

    }

    public void displaySalaryReport(int baseSalary,int days){
        int salaryy;
            for(int i=0; i< length  ; i++){
                salaryy = Employee[i].compute_Salary();
                naam= Employee[i].get_name();
                System.out.println(naam + "  "+ salaryy);
            }

    }
}

abstract class Employee extends Address_book{
    private String name;
    private int age;
    private char gender;

    public String get_name(){
        return name;
    }
    
    public int get_age(){
        return age;
    }
    public abstract int compute_Salary(int base_Salary, int days);

}

class board_members extends Employee{

    public int compute_Salary(int base_salary, int days){
        int salary, agee;
        agee = get_age();
        salary = base_salary+days*35+agee*100;


        return salary;
    }
}

class worker extends Employee{

  public  int compute_Salary(int base_Salary , int days){
        int salary, agee;
        agee= get_age();
        salary =  base_Salary + days*45 + agee*50;

        return salary;
    }
}


public class first {
    public static void main(String[] args) {
        System.out.println("ksjlwkejdlkweld");

        
        Employee array []= new Employee[2];
        array[b1] = new Employee();
        array[b2]= new Employee();
    }
}





