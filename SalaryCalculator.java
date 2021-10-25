import javax.swing.*;
import java.awt.*;

public class SalaryCalculator extends JFrame{
    JLabel lbl_BasicSalary,lbl_Bonus,lbl_TotalSalary,lbl_Tax,lbl_NetSalary,lbl_AnnualNetSalary;
    JLabel lblTSalary,lblTax,lblNetSalary,lblANetSalary;
    JTextField txt_BasicSalary,txt_Bonus;
    JButton btn_Calculate,btn_Clear;
    SalaryCalculator(){
        setTitle("Salary Calculator");
        lbl_BasicSalary = new JLabel("Basic Salary ");
        lbl_Bonus= new JLabel("Bonus ");
        lbl_TotalSalary= new JLabel("Total Salary ");
        lbl_Tax= new JLabel("Tax@6% ");
        lbl_NetSalary= new JLabel("Net Salary ");
        lbl_AnnualNetSalary= new JLabel("Annual Net Salary ");

        txt_BasicSalary = new JTextField(12);
        txt_Bonus = new JTextField(12);
        lblTSalary= new JLabel();
        lblTax= new JLabel();
        lblNetSalary= new JLabel();
        lblANetSalary= new JLabel();
        btn_Calculate = new JButton("Calculate");
        btn_Clear = new JButton("Clear");
        GridBagLayout lay_out = new GridBagLayout();
        Container container = getContentPane();
        container.setLayout(lay_out);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 20, 10, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lbl_BasicSalary, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(txt_BasicSalary, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lbl_Bonus, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(txt_Bonus, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(lbl_TotalSalary, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(lblTSalary, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(lbl_Tax, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(lblTax, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth=2;
        add(lbl_NetSalary, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth=2;
        add(lblNetSalary, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth=2;
        add(lbl_AnnualNetSalary, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth=2;
        add(lblANetSalary, gbc);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth=1;
        add(btn_Calculate, gbc);
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth=1;
        add(btn_Clear, gbc);
        pack();
        setVisible(true);
        btn_Calculate.addActionListener(e -> {
            float salary,bonus,total_Salary,tax,netSalary,annualNetSalary;
            if(txt_BasicSalary.getText().equals("") ){
                JOptionPane.showMessageDialog(null,"Enter Basic Salary");
            }
            else if(txt_Bonus.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Enter Bonus Amount");
            }
            else
            {
                salary=Float.parseFloat(txt_BasicSalary.getText());
                bonus=Float.parseFloat(txt_Bonus.getText());
                total_Salary=salary+bonus;
                lblTSalary.setText(""+total_Salary);
                tax=total_Salary*6/100;
                lblTax.setText(""+tax);
                netSalary=total_Salary-tax;
                lblNetSalary.setText(""+netSalary);
                annualNetSalary=netSalary*12;
                lblANetSalary.setText(""+annualNetSalary);
            }
        });
        btn_Clear.addActionListener(e -> {
            txt_BasicSalary.setText("");
            txt_Bonus.setText("");
        });
    }

    public static void main(String[] args) {
        new SalaryCalculator();
    }
}
