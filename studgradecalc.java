package StudentGradeCalculater;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studgradecalc extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    studgradecalc frame = new studgradecalc();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public studgradecalc() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 829, 482);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Student Grade Calculator");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblNewLabel.setBounds(227, 10, 363, 51);
        contentPane.add(lblNewLabel);
        
        JPanel panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBounds(28, 67, 419, 347);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Student Name");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(10, 22, 214, 19);
        panel.add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setBounds(158, 26, 164, 19);
        panel.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("ENGLISH");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_2.setBounds(10, 70, 141, 19);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("MATHS");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_3.setBounds(10, 113, 96, 20);
        panel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("SCIENCE");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_4.setBounds(10, 158, 106, 20);
        panel.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("SOCIAL");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_5.setBounds(10, 206, 141, 19);
        panel.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("LANGUAGE");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_6.setBounds(10, 250, 172, 20);
        panel.add(lblNewLabel_6);
        
        textField_1 = new JTextField();
        textField_1.setBounds(158, 74, 96, 19);
        panel.add(textField_1);
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setBounds(158, 118, 96, 19);
        panel.add(textField_2);
        textField_2.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setBounds(158, 163, 96, 19);
        panel.add(textField_3);
        textField_3.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setBounds(158, 210, 96, 19);
        panel.add(textField_4);
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setBounds(158, 255, 96, 19);
        panel.add(textField_5);
        textField_5.setColumns(10);
        
        JLabel lblNewLabel_7 = new JLabel("MARKS (out of 100)");
        lblNewLabel_7.setBounds(146, 51, 164, 13);
        panel.add(lblNewLabel_7);
        
       
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_1.setBounds(507, 81, 269, 320);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel_8 = new JLabel("RESULTS");
        lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_8.setBounds(93, 15, 82, 31);
        panel_1.add(lblNewLabel_8);
        
        JLabel stud_avg = new JLabel("");
        stud_avg.setFont(new Font("Tahoma", Font.PLAIN, 15));
        stud_avg.setBounds(14, 128, 245, 19);
        panel_1.add(stud_avg);
        
        JLabel stud_name_1 = new JLabel("");
        stud_name_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        stud_name_1.setBounds(14, 74, 245, 19);
        panel_1.add(stud_name_1);
        
        JLabel stud_grade = new JLabel("");
        stud_grade.setFont(new Font("Tahoma", Font.PLAIN, 15));
        stud_grade.setBounds(14, 172, 245, 19);
        panel_1.add(stud_grade);
        
        JLabel results = new JLabel("");
        results.setFont(new Font("Tahoma", Font.PLAIN, 16));
        results.setBounds(70, 247, 123, 31);
        panel_1.add(results);
        
        JButton btnNewButton = new JButton("CALCULATE");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		int english = Integer.parseInt(textField_1.getText());
                int maths = Integer.parseInt(textField_2.getText());
                int science = Integer.parseInt(textField_3.getText());
                int social = Integer.parseInt(textField_4.getText());
                int language = Integer.parseInt(textField_5.getText());

                double avg = (english + maths + science + social + language) / 5.0;

                stud_avg.setText("Average: " + avg);
                stud_name_1.setText("Name of the Student: " + textField.getText());

                String grade;
                String resultText;
                if (avg < 50) {
                    grade = "F";
                    resultText = "Failed";
                } else if (avg < 70) {
                    grade = "C";
                    resultText = "Average";
                } else if (avg < 90) {
                    grade = "B";
                    resultText = "Good";
                } else {
                    grade = "A";
                    resultText = "Excellent";
                }

                stud_grade.setText("Grade: " + grade);
                results.setText(resultText);
        		
        	}
        });
        btnNewButton.setBounds(115, 299, 179, 38);
        panel.add(btnNewButton);
    }
}
