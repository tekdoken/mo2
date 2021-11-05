package caseMo2.service;

public interface General<W> {
    void add(W w);

    void edit(String name, String newName);

    void delete(String name);

    int findAbsolute(String name);

    void findRelative(String name);

    void print();

    void printName(String name);
}
