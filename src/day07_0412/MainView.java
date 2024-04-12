package day07_0412;

import javax.swing.*;

public class MainView extends JFrame {
    JTextField tf_num1 = new JTextField();
    JTextField tf_num2 = new JTextField();

    MainView() {
        setSize(300, 200);  // 창 크기
        setLayout(null);        // 레이아웃 매니저 초기화

        tf_num1.setBounds(50,50,50,40);
        tf_num2.setBounds(100, 50, 50, 40);

        add(tf_num1);
        add(tf_num2);

        // 창 끄면 프로그램 종료
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


    }
}
