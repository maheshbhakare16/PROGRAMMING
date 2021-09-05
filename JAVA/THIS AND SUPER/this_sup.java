
class Parent
{
    Parent()
    {
        this('b');
        System.out.println("Parent Parameterless Constructor");
    }
    
    Parent(int x)
    {
        System.out.println("Parent int type Parameterized Constructor");
    }
    
    Parent(char x)
    {
        System.out.println("Parent char type Parameterized Constructor");
    }
}

class Child extends Parent
{
    Child()
    {
        this('a');
        System.out.println("Child Parameterless Constructor");
    }
    Child(char x)
    {
        super(10);
        System.out.println("Child char type Parameterized Constructor");
    }
    
    Child(double x)
    {
        System.out.println("Child double type Parameterized Constructor");
    }
    
}

class Demo
{
    public static void main(String args[])
    {
        Child c  = new Child();
        Child c1 = new Child(23.44);
    }
}
