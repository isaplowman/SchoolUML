public class Runner {

    public static void main(String[] args){
        School school = new School("Berkeley high");
        Section section1 = new Section("math");
        Section section2 = new Section("biology");
        Section section3 = new Section("computer science");
        Teacher teach1 = new Teacher("Albinson");
        Teacher teach2 = new Teacher("Teacher 1");
        Teacher teach3 = new Teacher("Teacher2");
        Student stud1 = new Student("Me");
        Student stud2 = new Student("student2");
        Student stud3 = new Student("student3");
        Student stud4 = new Student("student4");
        Student stud5 = new Student("student5");
        Student stud6 = new Student("student6");


        school.addSection(section1);
        school.addSection(section2);
        school.addSection(section3);
        section1.setTeacher(teach1);
        section2.setTeacher(teach2);
        section3.setTeacher(teach3);
        teach1.addSection(section1);
        teach2.addSection(section2);
        teach3.addSection(section3);
        section1.addStudent(stud1);
        section1.addStudent(stud2);
        section2.addStudent(stud3);
        section2.addStudent(stud4);
        section3.addStudent(stud5);
        section3.addStudent(stud6);
        stud1.addSection(section1);
        stud2.addSection(section1);
        stud3.addSection(section2);
        stud4.addSection(section2);
        stud5.addSection(section3);
        stud6.addSection(section3);

        System.out.println(school.toString());
        System.out.println(section1.toString());
        System.out.println(section2.toString());
        System.out.println(section3.toString());
        System.out.println(teach1.toString());
        System.out.println(teach2.toString());
        System.out.println(teach3.toString());
        System.out.println(stud1.toString());
        System.out.println(stud2.toString());
        System.out.println(stud3.toString());
        System.out.println(stud4.toString());
        System.out.println(stud5.toString());
        System.out.println(stud6.toString());

    }
}
