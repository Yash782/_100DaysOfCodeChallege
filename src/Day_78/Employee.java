package Day_78;

public class Employee {
    public int salary;
    public String grade;
    void setSalary(int salary){
        this.salary = salary;
    }
    int getSalaryI(){
        return salary;
    }
    void setGrade(String grade){
        this.grade = grade;
    }

    String getGrade(){
        return this.grade;
    }

    void label(){
        System.out.println(getGrade());
        System.out.println(getSalaryI());
    }

}

class Engineer extends Employee{
    private int salary;
    private String grade;

    int getSalaryI(){
        return salary;
    }
    String getGrade(){
        return this.grade;
    }

}

class Manager extends Employee{
    private int salary;
    private String grade;

    int getSalaryI(){
        return salary;
    }
    String getGrade(){
        return this.grade;
    }

}
