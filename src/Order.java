import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Order {
    private StringProperty name;
    private StringProperty emptyField;

    Order(String name, String emptyField) {
        this.name = new SimpleStringProperty(this, "name", name);
        this.emptyField = new SimpleStringProperty(this, "emptyField", emptyField);
    };

    public String toString() {
        return this.name.get();
    }

    public String getName() {
        return this.name.get();
    };

    public String getEmptyField() {
        return this.emptyField.get();
    };

    public final StringProperty nameProperty() {
        return this.name;
    };

    public final StringProperty emptyFieldProperty() {
        return this.emptyField;
    };
}
