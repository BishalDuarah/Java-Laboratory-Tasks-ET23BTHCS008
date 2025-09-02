class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String subject;
    double salary;

    void input(String n, int a, String s, double sal) {
        name = n;
        age = a;
        subject = s;
        salary = sal;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

class TestTeacher {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.input("Arun", 40, "Maths", 50000);
        t.display();
    }
}

