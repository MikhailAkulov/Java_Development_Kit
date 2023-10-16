package Example_2.DevTeam;

public class FullstackDeveloper implements Fullstack{
    @Override
    public void openIDE() {
        System.out.println("IDE is ready");
    }

    @Override
    public void writeServerCode() {
        System.out.println("Writing backend part of code");
    }

    @Override
    public void tryLaunchServer() {
        System.out.println("Trying to launch server");
    }

    @Override
    public void openAnyOtherIDE() {
        System.out.println("Any other IDE is ready");
    }

    @Override
    public void programmingScreenForms() {
        System.out.println("Some magic on HTML, SCC & JS");
    }
    @Override
    public void developGUI() {
        System.out.println("develop GUI");
    }

    @Override
    public void createWebSite() {
        System.out.println("Ready if he's lucky");
    }
}
