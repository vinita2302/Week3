package Main.singly_linked_list.student_record_management;

public class Student {

    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    Student(int rollNumber,String name,int age,char grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }
}