package glava33;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class RegPay extends JApplet implements ActionListener{
    JTextField amountText,paymentText, periodtext, rateText;
    JButton doIt;
    double principal;
    double intRate;
    double numYears;
    final int payPerYear =12;
    NumberFormat nf;
    @Override
    public void init() {
        try{
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI();
                }
            });
        }catch (Exception e){
            System.out.println("Can't create beacuse of "+e);
        }
    }

    private void makeGUI(){
        GridBagLayout gbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbag);
        JLabel heading = new JLabel("Compute Monthly Loan Payments");
        JLabel amountLab = new JLabel("Principal");
        JLabel periodLab = new JLabel("Years");
        JLabel rateLab = new JLabel("Interest Rate");
        JLabel paymentLab = new JLabel("Monthly Payments");

        amountText = new JTextField(10);
        periodtext = new JTextField(10);
        paymentText = new JTextField(10);
        rateText = new JTextField(10);

        paymentText.setEditable(false);
        doIt = new JButton("Compute");

        gbc.weighty=1.0;
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;
        gbag.setConstraints(heading,gbc);
        gbc.anchor=GridBagConstraints.EAST;

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(amountLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(amountText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(periodLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(periodtext,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(rateLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(rateText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(paymentLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(paymentText,gbc);

        gbc.anchor=GridBagConstraints.CENTER;
        gbag.setConstraints(doIt,gbc);

        add(heading);
        add(amountLab);
        add(amountText);
        add(periodLab);
        add(periodtext);
        add(rateLab);
        add(rateText);
        add(paymentLab);
        add(paymentText);
        add(doIt);

        amountText.addActionListener(this);
        periodtext.addActionListener(this);
        rateText.addActionListener(this);
        doIt.addActionListener(this);

        nf= NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double result=0.0;
        String amountStr = amountText.getText();
        String periodStr = periodtext.getText();
        String rateStr =  rateText.getText();

        try{
            if(amountStr.length() !=0 &&
                    periodStr.length() !=0 &&
                    rateStr.length() !=0){
                principal = Double.parseDouble(amountStr);
                numYears = Double.parseDouble(periodStr);
                intRate = Double.parseDouble(rateStr)/100;
                result=compute();
                paymentText.setText(nf.format(result));
            }
            showStatus("");
        }catch (NumberFormatException exc){
            showStatus("");
            paymentText.setText("");
        }
    }
    double compute(){
        double number,denom,b,e;

        number=intRate*principal/payPerYear;

        e=-(payPerYear*numYears);
        b =(intRate/payPerYear)+1.0;

        denom =1.0 -Math.pow(b,e);
        return  number/denom;
    }
}
