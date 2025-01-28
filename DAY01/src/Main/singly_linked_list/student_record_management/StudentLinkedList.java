package Main.singly_linked_list.student_record_management;


class StudentLinkedList{
    private Student head;
    public void addAtBeginning(int rollNumber,String name,int age,char grade){
        Student newStudent= new Student(rollNumber,name,age,grade);
        newStudent.next=head;
        head=newStudent;
    }

    public void addAtEnd(int rollNumber,String name,int age,char grade){
        Student newStudent=new Student(rollNumber,name,age,grade);
        if(head==null){
            head=newStudent;
            return;
        }
        Student temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newStudent;
    }

    public void addAtPosition( int rollNumber, String name, int age, char grade,int position) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (position == 1) {
            newStudent.next = head;
            head = newStudent;
            return;
        }
        Student temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
        } else {
            newStudent.next = temp.next;
            temp.next = newStudent;
        }
    }

    //delete a student record bye roll number
    public void deleteByRollNumber(int rollNumber){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.rollNumber==rollNumber){
            head=head.next;
            System.out.println("Student with roll number"+rollNumber+"deleted");
            return;
        }
        Student temp=head;
        while(temp.next!=null && temp.next.rollNumber !=rollNumber){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Student with roll number"+rollNumber+"not founded");
            return;
        }
        temp.next=temp.next.next;
        System.out.println("Student with roll number"+rollNumber+"deleted");
    }

    //search by student record by roll number
    public Student searchByRollNumber(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    //display the student record
    public void display(){
        if(head==null){
            System.out.println("No recorde found");
            return;
        }
        Student temp=head;
        while(temp!=null){
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    //update a student's grade based on their roll number
    public void updateGrade(int rollNumber, char newGrade) {
        Student student = searchByRollNumber(rollNumber);
        if (student != null) {
            student.grade = newGrade;
        } else {
            System.out.println("Student with Roll Number " + rollNumber + " not found!");
        }
    }
}

