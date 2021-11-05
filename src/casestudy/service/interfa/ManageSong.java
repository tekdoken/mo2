package casestudy.service.interfa;

public interface ManageSong<W> {
    void add(W w);

    void edit(String nameSong, W w);

    void deletel(String nameSong);

    int findAbsolute(String nameSong);

    void findRelative(String nameSong);

    void print();
}
