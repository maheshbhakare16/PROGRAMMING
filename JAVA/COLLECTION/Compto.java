import java.util.TreeSet;

class Employee implements Comparable<Employee>
{
    int id;
    String name;
    
    Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    public int compareTo(Employee e)
    {
        return (new Integer(this.id).compareTo(e.id));
    }
    public String toString()
    {
        return "id: "+this.id+" Name : "+this.name;
    }
}


class Test
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(101, "A");
        Employee e2 = new Employee(104, "B");
        Employee e3 = new Employee(107, "C");
        Employee e4 = new Employee(102, "D");
        Employee e5 = new Employee(111, "E");
        Employee e6 = new Employee(103, "F");
        Employee e7 = new Employee(100, "G");
        
        TreeSet ts = new TreeSet();
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);
        ts.add(e6);
        ts.add(e7);
        System.out.println(ts);

    }
}
