import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question6 {
    public static void main(String args[]) {
        Employee e1 = new Employee("Ankit", 22000, 27, "IT");
        Employee e2 = new Employee("Shreya", 40000, 25,"HR");
        Employee e3 = new Employee("Shubham", 80000, 31,"IT");
        Employee e4 = new Employee("Neeraj", 17000, 22, "HR");
        Employee e5 = new Employee("kamlesh", 90000, 35,"BCM");

        List<Employee> ll = new ArrayList<>();

        ll.add(e1);
        ll.add(e2);
        ll.add(e3);
        ll.add(e4);
        ll.add(e5);

        Map<String,List<Employee>> emp = new HashMap<>();

        emp = ll.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        for(String ss : emp.keySet())
        {
            List<Employee> temp = emp.get(ss);
            Integer totalsalary=0;
            for(Employee ee : temp)
            {
                totalsalary+= ee.getSalary();
            }
            System.out.println("Total salary for department " + ss + " is " + totalsalary);
        }
    }
}
