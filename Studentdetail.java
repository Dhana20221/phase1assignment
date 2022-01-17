package core.programs;
public class Studentdetail{
    String name;
    int age;
    char section;
    char gender;
    int subject1;
    int subject2;
    int subject3;
    
    Studentdetail(String n, int a, char s, char g, int s1, int s2, int s3){
        name = n;
        age = a;
        section = s;
        gender = g;
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }
    public int marks(){
        return subject1+subject2+subject3;
    }
    public float percentage(){
        return (marks()*100)/300;
    }
    public static void main(String[] args) {
        Studentdetail s1 = new Studentdetail("Dhana",23,'B','M', 90,75,89);
        Studentdetail s2 = new Studentdetail("Venky", 29, 'B','M', 65,56,65);
        Studentdetail s3 = new Studentdetail("Madhu", 21, 'A','M', 85,89,65);
        
        System.out.println("Marks of student s1 "+ s1.marks() + " Percentage of student s1 " + s1.percentage());
        System.out.println("Marks of student s2 "+ s2.marks() + " Percentage of student s2 " + s2.percentage());
        System.out.println("Marks of student s3 "+ s3.marks() + " Percentage of student s3 " + s3.percentage());
    }
}


    
   