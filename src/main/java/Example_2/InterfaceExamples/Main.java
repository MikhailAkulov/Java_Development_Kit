package Example_2.InterfaceExamples;

public class Main {

    private static class Minotaurus implements Human, Bull {
        @Override
        public void walk() {
            System.out.println("Walks on two legs");
        }
        @Override
        public void talk() {
            System.out.println("Asks you a riddle");
        }
    }

//    public static void main(String[] args) {
//        Bull minos0 = new Minotaurus();
//        Human minos1 = new Minotaurus();
//        Minotaurus minos = new Minotaurus();
//        Man man0 = new Man();
//        Ox ox0 = new Ox();
//        Human man1 = new Man();
//        Bull ox2 = new Ox();
//        Bull[] allBulls = {ox2, minos0, minos};
//        Human[] allHumans = {man1, minos, minos1};
//    }

    public interface MouseListener {
        void mouseUp();
        void mouseDown();
    }

    private static class MouseAdapter implements MouseListener {
        @Override public void mouseUp() {}
        @Override public void mouseDown() {}
    }

//    public static void main(String[] args) {
//        MouseAdapter m = new MouseAdapter();
//        m.mouseDown();
//        m.mouseUp();
//    }

    private static void addMouseListener(MouseListener l) {
        l.mouseDown();
        l.mouseUp();
    }

    public static void main(String[] args) {
        // Способы реализации интерфейса и передачи его в функцию (метод) при помощи анонимных классов
        MouseAdapter m = new MouseAdapter();
        addMouseListener(m);
        addMouseListener(new MouseAdapter());

        MouseListener l = new MouseListener() {
            @Override public void mouseUp() {}
            @Override public void mouseDown() {}
        };

        addMouseListener(l);

        addMouseListener(new MouseListener() {
            @Override public void mouseUp() {}
            @Override public void mouseDown() {}
        });
    }
}
