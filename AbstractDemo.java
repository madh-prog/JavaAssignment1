interface Drawing
{
    void draw();
}
interface Programming
{
    void coding();
}
abstract class Engineering
{
    abstract void display();
}
class Computer extends Engineering implements Programming
{
    public void display()
    {
        System.out.println("This is the display method of Engineering Abstract class from Computer class\n");
    }
    public void coding()
    {
        System.out.println("This is the coding method of Programming Interface\n");
    }
}
class Mechanical extends Engineering implements Drawing
{
    public void display()
    {
        System.out.println("This is the display method of Engineering Abstract class from Mechanical class\n");
    }
    public void draw()
    {
        System.out.println("This is the draw method of Drawing Interface\n");
    }
    
}
class AbstractDemo
{
    public static void main(String[] args) 
    {
        Computer comp = new Computer();
        Mechanical mech = new Mechanical();
        comp.display();
        comp.coding();
        mech.display();
        mech.draw();
        System.out.println("\n\nCode Done!!!"); 
    }
}