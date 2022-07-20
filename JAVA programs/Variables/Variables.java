

// NON STATIC VARIABLES
class Person
{
    String Name;
    int Age;
    String Gender;
    
}

class Details
{
    public static void main (String[] args)
    {
        Person p1, p2, p3;

        p1 = new Person ();

        p1.Name = "Hitesh";
        p1.Age = 24;
        p1.Gender = "Male";

        System.out.println(p1.Name);
        System.out.println(p1.Age);
        System.out.println(p1.Gender);

        p2 = new Person();

        p2.Name = "Anupam";
        p2.Age = 24;
        p2.Gender = "Male";
        System.out.println(p2.Name);
        System.out.println(p2.Age);
        System.out.println(p2.Gender);

        p3 = new Person();

        p3.Name = "Pritish";
        p3.Age = 24;
        p3.Gender = "Male";
        System.out.println(p3.Name);
        System.out.println(p3.Age);
        System.out.println(p3.Gender);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);





    }
}
