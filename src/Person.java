public class Person {




    public String name;
    private int id;
    private static int nextId;

    public Person(String name){
        this.name= name;
        this.nextId = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
