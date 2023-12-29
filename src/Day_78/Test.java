package Day_78;

public class Test {
    public static void main(String[] args) {
        Employee shree = new Employee();
        shree.grade = "A";
        shree.salary = 10000;
        System.out.println(shree.getGrade());
        shree.label();
    }

}
