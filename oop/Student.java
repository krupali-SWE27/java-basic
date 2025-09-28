public class Student {
    String name;
    int rollno;
    double marks;

    Student(String name , int rollno , double marks)
    {
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }

    void display()
    {
        System.out.println("Name: "+ name +" \nrollno:" + rollno +" \nmarks:" + marks);
    }

    public static void main(String[] args) {
         Student s1 = new Student("krupali" , 2 , 40);
         s1.display();
    }
    
}

    
