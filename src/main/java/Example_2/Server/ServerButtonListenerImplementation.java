package Server;

public class ServerButtonListenerImplementation implements SocketThreadListener{
    @Override
    public void pressButton(String btnName) {
        System.out.println("Server Log: cmd received " + btnName);
    }
}
