package Server;

public class Main {
    public static void main(String[] args) {
        ServerListener listener = new ServerListenerImplemented();
        ServerSocketThreadListener serverSocketThreadListener = new ServerSocketThreadListenerImplemented();
        SocketThreadListener socketThreadListener = new SocketThreadListenerImplemented();
        SocketThreadListener serverBtnListener = new ServerButtonListenerImplementation();
        ChatServer server = new ChatServer(false,listener, serverSocketThreadListener, serverBtnListener);
        new ServerWindow(server, socketThreadListener);
    }
}
