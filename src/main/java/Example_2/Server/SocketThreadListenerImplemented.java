package Server;

public class SocketThreadListenerImplemented implements SocketThreadListener {
    @Override
    public void pressButton(String btnName) {
        System.out.println("Client Log: pressed button " + btnName);
    }
}
