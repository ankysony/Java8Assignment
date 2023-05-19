import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String ename;
    Integer salary;
    Integer age;

    public Employee(String ename, Integer salary, Integer age) {
        this.ename = ename;
        this.salary = salary;
        this.age = age;
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

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
public class Question5 {
    public static void main(String[] args) {

        List<Employee> ll = new ArrayList<>();
        Employee e1 = new Employee("Ankit", 22000, 27);
        Employee e2 = new Employee("Shreya", 40000, 25);
        Employee e3 = new Employee("Shubham", 80000, 31);
        Employee e4 = new Employee("Neeraj", 17000, 22);
        Employee e5 = new Employee("kamlesh", 90000, 35);

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
