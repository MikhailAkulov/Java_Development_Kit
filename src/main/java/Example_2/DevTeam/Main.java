package Example_2.DevTeam;

import java.util.Arrays;
import java.util.List;

/**
 * Дописать задание таким образом, чтобы в идентификатор типа Developer записывался объект Frontender,
 * и далее вызывался метод developGUI(), не изменяя существующие интерфейсы, только код основного класса.
 */

public class Main {
    public static void main(String[] args) {
        FullstackDeveloper fsdev1 = new FullstackDeveloper();
        Backender backdev1 = new BackDeveloper();
        Frontender frontdev1 = new FrontDeveloper();

        fsdev1.openIDE();
        fsdev1.writeServerCode();
        fsdev1.tryLaunchServer();
        fsdev1.openAnyOtherIDE();
        fsdev1.programmingScreenForms();
        fsdev1.createWebSite();

        List<Backender> devList = Arrays.asList(fsdev1, backdev1);

        Developer dev1 = new FrontDeveloper();
        if (dev1 instanceof Frontender) {
            ((Frontender) dev1).developGUI();
        }
    }
}

