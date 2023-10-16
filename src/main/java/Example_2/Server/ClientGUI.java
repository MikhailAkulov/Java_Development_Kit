//package Server;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class ClientGUI extends JFrame {
//    private static final int POS_X = 1100;
//    private static final int POS_Y = 300;
//    private static final int WIDTH = 400;
//    private static final int HEIGHT = 300;
//
//    private final JTextArea log = new JTextArea();
//
//    private final JPanel panelTop = new JPanel(new GridLayout(2,3));
//    private final JTextField tfIPAddress = new JTextField("127.0.0.1");
//    private final JTextField tfPort = new JTextField("8189");
//    private final JTextField tfLogin = new JTextField("Nik_name");
//    private final JPasswordField tfPassword = new JPasswordField("qwerty");
//    private final JButton btnLogIn = new JButton("LogIn");
//    private final JButton btnLogOut = new JButton("LogOut");
//
//    private final JPanel panelBottom = new JPanel(new BorderLayout());
//    private final JTextField tfMessage = new JTextField();
//    private final JButton btnSend = new JButton("Send");
//
//    ServerWindow server;
//
//    ClientGUI() {
//        server = new ServerWindow();
//
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setLocation(POS_X, POS_Y);
//        setSize(WIDTH, HEIGHT);
//        setTitle("Chat Client");
//
//        btnLogIn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                log.append("Соединение с сервером установлено\n");
//                String history = server.connectUser(tfLogin.getText());
//                log.append(history);
//            }
//        });
//
//        btnLogOut.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                log.append("Соединение с сервером становлено\n");
//                String history = server.disconnectUser(tfLogin.getText());
//                log.append(history);
//            }
//        });
//
//        panelTop.add(tfIPAddress);
//        panelTop.add(tfPort);
//        panelTop.add(tfLogin);
//        panelTop.add(tfPassword);
//        panelTop.add(btnLogIn);
//        panelTop.add(btnLogOut);
//        add(panelTop, BorderLayout.NORTH);
//
//        btnSend.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String msg = String.format("%s >>> %s\n", tfLogin.getText(), tfMessage.getText());
//                log.append(msg);
//                server.incomingMessage(msg);
//                tfMessage.setText("");
//            }
//        });
//
//        panelBottom.add(tfMessage, BorderLayout.CENTER);
//        panelBottom.add(btnSend, BorderLayout.EAST);
//        add(panelBottom, BorderLayout.SOUTH);
//
//        log.setEditable(false);
//        JScrollPane scrollLog = new JScrollPane(log);
//        add(scrollLog);
//
//        String users[] = {"Dima", "Vasya", "Petya", "Sasha", "Masha"};
//        JList<String> usersList = new JList<String>();
//        usersList.setListData(users);
//        usersList.setVisibleRowCount(1);
//        JScrollPane scrollUsers = new JScrollPane(usersList);
//        add(scrollUsers, BorderLayout.WEST);
//
//        usersList.setSelectedIndex(0);
//
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
////        new ServerWindow();
//        new ClientGUI();
//    }
//}
