import java.io.*;

class Student {
    int regno;
    String name;
    int m1, m2, m3, total;

    Student(int r, String n, int n1, int n2, int n3) {
        regno = r;
        name = n;
        m1 = n1;
        m2 = n2;
        m3 = n3;
    }

    void result() {
        total = m1 + m2 + m3;
    }

    void print() {
        System.out.println("Register number: " + regno);
        System.out.println("Name: " + name);
        System.out.println("Total marks: " + total);
    }

    public static void main(String[] args) {
        Student s[] = new Student[3];
        s[0] = new Student(1001, "Kumar", 45, 90, 67);
        s[1] = new Student(1002, "Ramu", 75, 90, 87);
        s[2] = new Student(1003, "Babu", 80, 86, 77);

        s[0].result();
        s[0].print();
        s[1].result();
        s[1].print();
        s[2].result();
        s[2].print();
    }
}
