interface Shape
{
    void area();
}

class Circle implements Shape
{
    int rad;
    float pi = 3.14f;
    Circle(int rad)
    {
        this.rad = rad;
    }
    public void area()
    {
        System.out.println("Area of Circle: "+pi*rad*rad);
    }
}

class Square implements Shape
{
    int side;
    Square(int side)
    {
        this.side = side;
    }
    public void area()
    {
        System.out.println("Area of Square: "+side*side);
    }
}

class Ractangle implements Shape
{
    int l,b;
    Ractangle(int l, int b)
    {
        this.l = l;
        this.b = b;
    }
    public void area()
    {
        System.out.println("Area of Ractangle: "+l*b);
    }
}


class CalculateArea
{
    public static void main(String[] args)
    {
        Shape circle = new Circle(3);
        circle.area();
        Shape square = new Square(4);
        square.area();
        Shape ractangle = new Ractangle(5,6);
        ractangle.area();
    }
}
