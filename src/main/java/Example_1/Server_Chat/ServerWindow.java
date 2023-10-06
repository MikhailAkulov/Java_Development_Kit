package Example_1.Server_Chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ServerWindow extends JFrame {
    private static final int POS_X = 700;
    private static final int POS_Y = 300;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private final JButton btnStart = new JButton("Start");
    private final JButton btnStop = new JButton("Stop");
    private final JTextArea log = new JTextArea();
    private boolean isServerWorking;

    public ServerWindow() {
        isServerWorking = false;

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isServerWorking) {
//                    System.out.println("Server is running\n");  // для вывода в консоль
                    log.append("Server is running\n");  // для вывода в окно
                } else {
                    isServerWorking = true;
//                    System.out.println("Server started " + isServerWorking + "\n"); // для вывода в консоль
                    log.append("Server started\n"); // для вывода в окно
                    try(FileReader reader = new FileReader("logs.txt")) {
                        char[] buf = new char[256];
                        int c;
                        while ((c = reader.read(buf)) > 0) {
                            if (c < 256) {
                                buf = Arrays.copyOf(buf, c);
                            }
                            log.append(String.valueOf(buf));
                        }
                    }
                    catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isServerWorking) {
//                    System.out.println("Server is not running\n");  // для вывода в консоль
                    log.append("Server is not running\n");  // для вывода в окно
                } else {
                    isServerWorking = false;
//                    System.out.println("Server stopped " + isServerWorking + "\n"); // для вывода в консоль
                    log.append("Server stopped\n"); // для вывода в окно
                    try(FileWriter writer = new FileWriter("logs.txt", false)) {
                        writer.write(String.valueOf(log.getText()));
//                        writer.flush();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    log.setText("");
                }
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

    void incomingMessage(String msg) {
        log.append(msg);
    }

    String connectUser(String username) {
        log.append(username + " присоединился\n");
        return log.getText();
    }

    String disconnectUser(String username) {
        log.append(username + " покинул чат\n");
        return log.getText();
    }
}
