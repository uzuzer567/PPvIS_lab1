public class Person {
    private String name;
    private int numberPhone;

    Person(String name, int numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    };

    public boolean equals(Object object) {
        if (object == null) return false;
        if (object instanceof Person) {
            Person person = (Person) object;
            if (!person.getName().equals(name) && person.getNumber() != numberPhone) {
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
        return numberPhone;
    };
}
