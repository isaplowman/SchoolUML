public class Teacher extends Person{


    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount;



    public Teacher(String name) {
        super(name);
        this.subject = subject;
    }
    public String getTeacherName(){
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString(){
        String o ="";
        for(int i =0; i<sectionCount; i++){
            o+= sections[i] + ", " + subject;
        }
        return name + " teaches the following sections: " + o;
    }
}
