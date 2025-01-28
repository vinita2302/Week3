package Main.singly_linked_list.student_record_management;

public class Main {
    public static void main(String[] args) {


        StudentLinkedList list = new StudentLinkedList();
list.addAtBeginning(1,"karan",18,'A');
list.addAtBeginning(2,"vinita",21,'A');

list.addAtPosition(3,"diksha",21,'A',2);

list.display();
        list.updateGrade(2, 'A');
        System.out.println("After Updating Grade:");
        list.display();
        Student student = list.searchByRollNumber(3);
        if (student != null) {
            System.out.println("Found Student: Roll Number: " + student.rollNumber + ", Name: " + student.name);
        } else {
            System.out.println("Student not found!");
        }

        // Deleting a student
        list.deleteByRollNumber(1);
        System.out.println("After Deleting Roll Number 1:");
        list.display();
    }
}
