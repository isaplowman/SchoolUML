public class Student extends Person{

    private Section[] sections = new Section[10];
    private int grade;
    private int sectionCount;

    public Student(String name){
        super(name);
        this.grade =  grade;
    }


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s){
        sections[sectionCount]= s;
        sectionCount++;
    }

    public String toString(){
        String w = "";
        for(int i = 0; i< sectionCount; i++){
            w += sections[i].getName() + ", " + sections[i].getTeacher();
        }

        return name + " is in " + grade + " grade, and is enrolled in the following sections: " + w;
    }
}
