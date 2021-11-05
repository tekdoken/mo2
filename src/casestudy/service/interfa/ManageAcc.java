package casestudy.service.interfa;

public interface ManageAcc<W> {
    void addAcc(W w);

    void editAcc(String nameSong, W w);

    void deletelAcc(String nameSong);

    int findAbsoluteAcc(String nameSong);

    void findRelativeAcc(String nameSong);

    void print();
}
