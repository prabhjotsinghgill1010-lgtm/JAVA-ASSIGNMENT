class Person{
    String name;
    int age;
public Person(String name , int age) {
    this.name = name;
    this.age = age;
    }
    public void display(){
        System.out.println("Name  = "+name+" "+"Age = "+age);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Amit",22);
        p1.display();
        Person p2 = new Person("Ashish",23);
        p2.display();
    }
    
}