interface transport
{
    void deliver();
}
abstract class Animal
{
    String str;
    abstract void deliver();
}
class Tiger extends Animal
{
    public void deliver()
    {
        
    }
}
class Camel extends Animal implements transport
{
    public void deliver()
    {
        System.out.println("Welcome "+str);
    }
    Camel(String str1)
    {
        str=str1;
    }     
}
class Deer extends Animal
{
    public void deliver()
    {
        
    }
}
class Donkey extends Animal implements transport
{
    Donkey(String str2)
    {
        str=str2;
    }
    public void deliver()
    {
        System.out.println("Einfochips Pvt.Ltd "+str);
    }
}
class Zoo
{
    public static void main(String args[])
    {
        transport[] t = new transport[4];
        t[1]=new Camel("Madhuri ");
        t[2]=new Donkey("Madhuri Mahajan ");
        t[1].deliver();
        t[2].deliver();
    }
}
