package com.tcs.icici.loan.homeloan;
import com.tcs.icici.loan.carloan.Car;

public class Home
{
    public static void main(String[] args)
    {
        System.out.println("Homeloan Class....");
        Car.main(null);
        Car c = new Car();
        c.carloan();
    }
}
