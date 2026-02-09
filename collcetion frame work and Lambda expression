package lab3;

import java.util.*;

class lab3 {

    int rno;
    String name;
    int age;
    float fees;


    public lab3(int rno, String name, int age, float fees) {
        this.rno = rno;
        this.name = name;
        this.age = age;
        this.fees = fees;
    }


    @Override
    public String toString() {
        return rno + " " + name + " " + age + " " + fees;
    }


    public static void main(String[] args) {

        List<lab3> s = new ArrayList<>();


        s.add(new lab3(1, "abc", 20, 20000.00f));
        s.add(new lab3(2, "cvbd", 15, 2500000f));
        s.add(new lab3(3, "efg", 30, 3500000f));


        System.out.println("Sorting on the basis of name...");
        Collections.sort(s, (s1, s2) -> s1.name.compareTo(s2.name));

        for (lab3 i : s) {
            System.out.println(i);
        }


        System.out.println("\nSorting by age...");
        Collections.sort(s, (s1, s2) -> s1.age - s2.age);

        s.forEach(l -> System.out.println(l));


        System.out.println("\nSorting by fees...");
        Collections.sort(s, (s1, s2) -> (int) s1.fees - (int) s2.fees);

        s.forEach(m -> System.out.println(m));
    }
}

