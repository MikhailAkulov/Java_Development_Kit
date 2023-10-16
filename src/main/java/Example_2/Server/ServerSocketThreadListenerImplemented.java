package Server;

public class ServerSocketThreadListenerImplemented implements ServerSocketThreadListener{
    @Override
    public void onStart() {
        System.out.println("Log: server started");
    }

    @Override
    public void onStop() {
        System.out.println("Log: server stopped");
    }
}
