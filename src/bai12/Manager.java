package bai12;

public interface Manager<W> {
    void add(W w);

    void edit(int id, W w);

    void delete(int id);

    int find(int id);

    void print();

    void sortg();
    void sorta();

}
