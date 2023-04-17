public abstract class Person {

    // Instance Variables
    private String name;

    // Constructors
    public Person(String name){
        this.name = name;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    // toString()
    @Override
    public String toString() {
        return "Person: {Name: " + this.name + '}';
    }

}
