public class Section {




    private Teacher teacher;
    private String name;
    private Student[] student = new Student[50];
    private int currentSize;



    public Section(String name) {
        this.name = name;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    public Student[] getStudents(){
        return student;
    }

    public void addStudent(Student s){
        student[currentSize] = s;
        currentSize++;
    }

    public String getName(){
        return name;
    }


    public void setName(String name){
        this.name= name;
    }


    public String toString(){
        String o = "";
        for(int i = 0; i < currentSize; i++){
            o += student[i].name + ", ";
        }
        return name + " is taught by " + teacher.name + " and has " + currentSize + " students: " + o;
    }

}
