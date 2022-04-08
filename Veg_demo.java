abstract class Vegetable
{
    public String color;
}

class Potato extends Vegetable
{
     public String toString()
     {
          color = "Skinned Color";
          return "potato    "+color;
     }
}

class Brinjal extends Vegetable
{
     public String toString()
     {
          color = "Purple Color";
          return "Brinjal   "+color;
     }
}

class Tomato extends Vegetable
{ 
     public String toString()
     {
          color="Red Color";
          return "Tomato    "+color;
     }
}

class Veg_demo
{
     public static void main(String [] args)
     {
          Potato p = new Potato();
          Brinjal b = new Brinjal();
          Tomato t = new Tomato();
          System.out.println(p+"\n");
          System.out.println(b+"\n");
          System.out.println(t);
     }
}