import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String ename;
    Integer salary;
    Integer age;
    String department;

    public Employee(String ename, Integer salary, Integer age, String department) {
        this.ename = ename;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public Employee() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
public class Question5 {
    public static void main(String[] args) {

        List<Employee> ll = new ArrayList<>();
        Employee e1 = new Employee("Ankit", 22000, 27, "IT");
        Employee e2 = new Employee("Shreya", 40000, 25,"HR");
        Employee e3 = new Employee("Shubham", 80000, 31,"IT");
        Employee e4 = new Employee("Neeraj", 17000, 22, "HR");
        Employee e5 = new Employee("kamlesh", 90000, 35,"BCM");

        ll.add(e1);
        ll.add(e2);
        ll.add(e3);
        ll.add(e4);
        ll.add(e5);

       Double avgage = ll.stream()
                .filter(e->e.getSalary()>50000).collect(Collectors.averagingDouble(Employee::getAge));

        System.out.println(avgage);

    }
}
