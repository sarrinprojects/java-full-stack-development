import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class persit {
    public static void main(String[] args) throws IOException {

        student s1 = new student(3, "sarrin", 5000.0f);

        FileOutputStream fout = new FileOutputStream("presi.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fout);

        oos.writeObject(s1);

        oos.close();
        fout.close();

        System.out.println("Object written successfully!");
    }
}

//serialization///
import java.io.Serializable;

public class student implements Serializable {

    int id;
    String name;
    float fee;

    public student(int id, String name, float fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
    }
}

//deserialization////
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class depersit {
    public static void main(String[] args) 
            throws IOException, ClassNotFoundException {

        FileInputStream fin = new FileInputStream("presi.txt");
        ObjectInputStream ois = new ObjectInputStream(fin);

        student s1 = (student) ois.readObject();

        ois.close();
        fin.close();

        System.out.println("Success");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Fee: " + s1.fee);
    }
}
