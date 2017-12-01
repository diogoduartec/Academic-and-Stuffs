package enumtype.classes;

public enum TypeClient {
    NATURAL_PERSON(1, "Natural Person"), JURIDICAL_PERSON(2, "Juridical Person");
    int num;
    String name;

    TypeClient(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
}
