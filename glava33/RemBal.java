package glava33;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class RemBal extends JApplet implements ActionListener {
    JTextField orgPText,paymentText,remBalText,
            rateText,numPayText;
    JButton doIt;

    double orgPrincipal;
    double intRate;
    double payment;
    double numPayments;

    final int payPerYear = 12;


    NumberFormat nf;

    public void init(){
        try{
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI();
                }
            });
        } catch (Exception e){
            System.out.println("Can't create because of "+e);
        }
    }
    private void makeGUI(){
        GridBagLayout gbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbag);

        JLabel heading = new JLabel("Find Loan Balance");
        JLabel orgPLab = new JLabel("Original Principal");
        JLabel paymentLab = new JLabel("Amount of Payment");
        JLabel numPayLab = new JLabel("Number of payments Made");
        JLabel rateLab = new JLabel("Intereset Rate");
        JLabel remBalLab = new JLabel("Remaining Balance");

        orgPText = new JTextField(10);
        paymentText = new JTextField(10);
        remBalText = new JTextField(10);
        rateText = new JTextField(10);
        numPayText = new JTextField(10);

        remBalText.setEditable(false);
        doIt = new JButton("Compute");

        gbc.weighty=1.0;
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;
        gbag.setConstraints(heading,gbc);

        gbc.anchor=GridBagConstraints.EAST;

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(orgPLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(orgPText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(paymentLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(paymentText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(rateLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(rateText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(numPayLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(numPayText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(remBalLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(remBalText,gbc);

        gbc.anchor=GridBagConstraints.CENTER;
        gbag.setConstraints(doIt,gbc);

        add(heading);
        add(orgPLab);
        add(orgPText);
        add(paymentLab);
        add(paymentText);
        add(numPayLab);
        add(numPayText);
        add(rateLab);
        add(rateText);
        add(remBalLab);
        add(remBalText);
        add(doIt);
        orgPText.addActionListener(thistest);
        numPayText.addActionListener(thistest);
        rateText.addActionListener(thistest);
        paymentText.addActionListener(thistest);
        doIt.addActionListener(thistest);

        nf= NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double result=0.0;
        String orgPstr = orgPText.getText();
        String numPayStr = numPayText.getText();
        String rateStr =  rateText.getText();
        String payStr =  paymentText.getText();

        try{
            if(orgPstr.length() !=0 &&
                    numPayStr.length() !=0 &&
                    rateStr.length() !=0 &&
                    payStr.length() !=0){
                orgPrincipal = Double.parseDouble(orgPstr);
                numPayments = Double.parseDouble(numPayStr);
                intRate = Double.parseDouble(rateStr)/100;
                payment=Double.parseDouble(payStr);
                result=compute();
                remBalText.setText(nf.format(result));
            }
            showStatus("");
        }catch (NumberFormatException exc){
            showStatus("Invalid Data");
            remBalText.setText("");
        }
    }
    double compute(){
        double bal = orgPrincipal;
        double rate = intRate/payPerYear;

        for (int i = 0; i <numPayments ; i++) {
            bal-=payment-(bal*rate);
        }
        return bal;
    }
}
