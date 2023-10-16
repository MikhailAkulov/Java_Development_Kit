package Server;

public class ChatServer {
    public boolean isServerWorking;
    private ServerListener listener;
    private final ServerSocketThreadListener serverSocketThreadListener;
    private final SocketThreadListener socketThreadListener;

    public ChatServer(boolean isServerWorking, ServerListener listener,
                      ServerSocketThreadListener serverSocketThreadListener, SocketThreadListener socketThreadListener) {
        this.isServerWorking = isServerWorking;
        this.listener = listener;
        this.serverSocketThreadListener = serverSocketThreadListener;
        this.socketThreadListener = socketThreadListener;
    }

    public void start() {
        socketThreadListener.pressButton("Start");
        if (isServerWorking) {
//            System.out.println("Server is running\n");
//            log.append("Server is running\n");
            listener.onMessageReceived("Server is running. interface\n");

        } else {
            isServerWorking = true;
//            System.out.println("Server started " + isServerWorking + "\n");
//            log.append("Server started " + isServerWorking + "\n");
            serverSocketThreadListener.onStart();
            listener.onMessageReceived("Server started " + isServerWorking + ". interface\n");
        }
    }

    public void stop() {
        socketThreadListener.pressButton("Stop");
        if (!isServerWorking) {
//            System.out.println("Server is not running\n");
//            log.append("Server is not running\n");
            listener.onMessageReceived("Server is not running. interface\n");
        } else {
            isServerWorking = false;
//            System.out.println("Server stopped " + isServerWorking + "\n");
//            log.append("Server stopped " + isServerWorking + "\n");
            serverSocketThreadListener.onStop();
            listener.onMessageReceived("Server stopped " + isServerWorking + ". interface\n");
        }
    }
}

interface ServerListener {
    void onMessageReceived(String message);
}

interface ServerSocketThreadListener {
    void onStart();
    void onStop();
}

interface SocketThreadListener {
    void pressButton(String btnName);
}