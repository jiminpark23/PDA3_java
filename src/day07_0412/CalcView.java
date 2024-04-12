package day07_0412;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcView extends JFrame implements ActionListener {
    JTextField tf_num1 = new JTextField();
    JTextField tf_num2 = new JTextField();

    JButton btn_plus = new JButton("더하기");
    JButton btn_minus = new JButton("빼기");

    JLabel la_result = new JLabel("결과 출력");

    CalcController calcController;

    CalcView(CalcController calcController) {
        this.calcController = calcController;

        btn_plus.addActionListener(this);

        setSize(300, 200); // 창 크기
        setLayout(null); // 레이아웃 매니저 초기화

        tf_num1.setBounds(25, 50, 50, 40);
        tf_num2.setBounds(78, 50, 50, 40);
        btn_plus.setBounds(130, 50, 65, 40);
        btn_minus.setBounds(200, 50, 65, 40);
        la_result.setBounds(25, 100, 200, 40);


        add(tf_num1);
        add(tf_num2);
        add(btn_plus);
        add(btn_minus);
        add(la_result);

        // 창을 끄면, 프로그램 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_plus) {
            int num1 = Integer.parseInt(tf_num1.getText());
            int num2 = Integer.parseInt(tf_num2.getText());

            la_result.setText(Integer.toString(calcController.plus(num1, num2)));
        } else if (e.getSource() == btn_minus) {
            int num1 = Integer.parseInt(tf_num1.getText());
            int num2 = Integer.parseInt(tf_num2.getText());

            la_result.setText(Integer.toString(calcController.minus(num1, num2)));
        }
    }
}