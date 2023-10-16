package Example_2.DevTeam;

public class FrontDeveloper extends Developer implements Frontender{
    @Override
    public void openAnyOtherIDE() {
        System.out.println("I can do this");
    }

    @Override
    public void programmingScreenForms() {
        System.out.println("Create screen forms");
    }
    @Override
    public void developGUI() {
        System.out.println("develop GUI");
    }

    @Override
    public void createWebSite() {
        System.out.println("Create web site");
    }
}
