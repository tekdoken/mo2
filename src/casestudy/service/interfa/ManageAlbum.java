package casestudy.service.interfa;

public interface ManageAlbum<W> {
    void addAlbum(W w);

    void editAlbum(String nameSong, W w);

    void deletelAlbum(String nameSong);

    int findAbsoluteAlbum(String nameSong);

    void findRelativeAlbum(String nameSong);

    void print();
}
