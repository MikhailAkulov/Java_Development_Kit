package Example_2.DevTeam;

public class BackDeveloper implements Backender{
    @Override
    public void openIDE() {
        System.out.println("Why not!?");
    }

    @Override
    public void writeServerCode() {
        System.out.println("Write server code");
    }

    @Override
    public void tryLaunchServer() {
        System.out.println("Dropped the server");
    }
}
