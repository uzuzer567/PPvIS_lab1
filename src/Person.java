public class Person {
    private String name;
    private int number;
    Person(String name, int number) {
        this.name = name;
        this.number = number;
    };

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Person) {
            Person person = (Person) obj;
            if (!person.getName().equals(name) && person.getNumber() != number) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    };

    public int getNumber() {
        return number;
    };
}
