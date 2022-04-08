import java.util.Scanner;
interface GrandParent
{
    void count_grandchildren();
}
interface Parent1 extends GrandParent
{
    //public void count_grandchildren();
    void count_son();
}
interface Parent2 extends GrandParent
{
    void count_daughter();
}
interface child extends Parent1,Parent2
{
    void count_siblings();
}
class Family implements child
{
    Scanner sc = new Scanner(System.in);
    public void count_grandchildren()
    {
        System.out.print("Enter number of grandchild you have?  ");
        int gc = sc.nextInt();
        System.out.println("You have "+gc+" grandchildren\n");
    }
    public void count_son()
    {
        System.out.print("Enter number of son you have?  ");
        int s = sc.nextInt();
        System.out.println("You have "+s+" son\n");
    }
    public void count_daughter()
    {
        System.out.print("Enter number of daughter you have?  ");
        int d = sc.nextInt();
        System.out.println("You have "+d+" daughter\n");
    }
    public void count_siblings()
    {
        System.out.print("Enter number of siblings you have?  ");
        int sb = sc.nextInt();
        System.out.println("You have "+sb+" siblings\n");
    }
}
class Home
{
    public static void main(String args[])
    {
        Family f = new Family();
    
        f.count_grandchildren();
        f.count_son();
        f.count_daughter();
        f.count_siblings();
    }
}
     