class Employee {
    String name;
    String job;
    double salary;

    Employee(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    double calculateSalary(int workingDays) {
        return (salary / 30) * workingDays;
    }

    void updateSalary(int workingDays) {
        salary = calculateSalary(workingDays);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Job: " + job);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Rahul", "Developer", 30000);

        e.display();

        int workingDays = 25;

        System.out.println("Salary for " + workingDays
                + " days = " + e.calculateSalary(workingDays));

        e.updateSalary(workingDays);

        System.out.println("\nUpdated Employee Details:");
        e.display();
    }
}