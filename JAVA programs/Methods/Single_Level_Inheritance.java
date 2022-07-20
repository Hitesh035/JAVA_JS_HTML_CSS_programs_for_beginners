

class Parent{
    String name;
    String relation;
    int age;

    Parent(String n,String r, int a) {
        name=n;
        relation =r;
        age= a;

    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.relation);
        System.out.println(this.age);
    }

}


class Child extends Parent{
    Child(String a, int b, String c){
        super(a,c,b);
        name = "xyz";



    }
    
}
    

class Single_Level_Inheritance {
        public static void main (String [] args){
            Child c1 = new Child("ABC", 45, "father");
        Parent p1 = new Parent("ABC", "Father", 45);
        c1.display();

        }
    
}
