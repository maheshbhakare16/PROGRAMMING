interface Sim
{
    void callCharges();
    void smsCharges();
}

class Jio implements Sim
{
    public void callCharges()
    {
        System.out.println("Jio Call Charges : 0.36 Rs./ Min");
    }
    public void smsCharges()
    {
        System.out.println("Jio sms Charges : 1.00Rs /sms");
    }
}
class Vi implements Sim
{
    public void callCharges()
    {
        System.out.println("Vi Call Charges : 0.49 Rs./ Min");
    }
    public void smsCharges()
    {
        System.out.println("Vi sms Charges : 0.50Rs /sms");
    }
}
class Airtel implements Sim
{
    public void callCharges()
    {
        System.out.println("Airtel Call Charges : 1.00 Rs./ Min");
    }
    public void smsCharges()
    {
        System.out.println("Airtel sms Charges : 1.20Rs /sms");
    }
}

class Mobile
{
    void insertSim(Sim s)
    {
        s.callCharges();
        s.smsCharges();
    }
}

class MobileUser
{
    public static void main(String[] args)
    {
        Mobile onePlus = new Mobile();
        onePlus.insertSim(new Jio());
        onePlus.insertSim(new Airtel());
        onePlus.insertSim(new Vi());
    }
}
