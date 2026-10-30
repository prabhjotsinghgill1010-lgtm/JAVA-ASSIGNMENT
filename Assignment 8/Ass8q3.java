class Employee{
    String name;
    double salary;
    int hire_year;
    public Employee (String name , double salary , int hire_year ){
        this.name = name;
        this.salary = salary;
        this.hire_year = hire_year;

    }
    public void year_of_service(){
        System.out.println(name+" "+salary+" "+hire_year);
        System.out.println("Year of service for "+name+" : "+(2026-hire_year));
    }
public static void main(String[] args) {
    Employee emp = new Employee("Amit",50000.00,2021);
    emp.year_of_service();

}

}