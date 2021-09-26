import java.util.Comparator;
import java.util.TreeSet;


class Employee implements Comparator<Employee>
{
    int id;
    String name;
    Employee()
    {
        
    }
    Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public int compare(Employee e1, Employee e2)
    {
        return new Integer(e1.id).compareTo(e2.id);
    }
    public String toString()
    {
        return "ID : "+this.id+" Name : "+this.name;
    }
}

class Test
{
    public static void main(String[] args)
    {
        Employee e = new Employee();
        TreeSet ts = new TreeSet(e);
        ts.add(new Employee(101,"A"));
        ts.add(new Employee(108,"c"));
        ts.add(new Employee(105,"B"));
        ts.add(new Employee(102,"F"));
        ts.add(new Employee(109,"D"));
        ts.add(new Employee(104,"Q"));
        ts.add(new Employee(100,"N"));
        System.out.println(ts);
        
    }
}
