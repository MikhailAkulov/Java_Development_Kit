package Server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame {
    private static final int POS_X = 700;
    private static final int POS_Y = 300;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private final JButton btnStart = new JButton("Start");
    private final JButton btnStop = new JButton("Stop");
    private final JTextArea log = new JTextArea();

    private final ChatServer chatServer;
    private final SocketThreadListener socketThreadListener;

    public ServerWindow(ChatServer chatServer, SocketThreadListener socketThreadListener) {
        this.chatServer = chatServer;
        this.socketThreadListener = socketThreadListener;

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("btn Start is active");
                socketThreadListener.pressButton("Start");
                chatServer.start();
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("btn Stop is active");
                socketThreadListener.pressButton("Stop");
                chatServer.stop();
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
        setAlwaysOnTop(true);

        JPanel buttonPanel = new JPanel(new GridLayout(1,2));
        buttonPanel.add(btnStart);
        buttonPanel.add(btnStop);

        JPanel logPanel = new JPanel(new GridLayout(1,1));
        logPanel.add(log);

        add(buttonPanel,BorderLayout.NORTH);
        add(logPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
