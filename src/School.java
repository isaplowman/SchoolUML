public class School {


    private String name;
    private Section[] sections = new Section[200];
    private int sectionCount = 0;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName (String n){
        this.name = name;
    }

    public void addSection(Section S){
        sections[sectionCount] = S;
        sectionCount++;
    }

    public Section[] getSections() {
        return sections;
    }

    public String toString(){
        return "The school named " + name + " has " + sectionCount + " sections";
    }
}
