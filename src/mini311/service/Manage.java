package mini311.service;

public interface Manage<W> {
    void add(W w);

    void edit(int id, W w);

    void delete(int id);

    int findId(int id);

    void findName(String name);

    void print();

    void printId(int id);

    boolean checkId(int id);
}
