package Example_3.Task4;

public class Club<T extends Person> {
    private T[] community;

    public Club(T[] community) {
        this.community = community;
    }

    public void partyForAll() {
        for (T t: community) {
            t.haveRest();
        }
    }
}
