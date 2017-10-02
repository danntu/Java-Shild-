package glava33;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class Annuity extends JApplet implements ActionListener {
    JTextField regWDText,initialText,periodText,rateText,numWDText;
    JButton doIt;

    double regWDAmount;
    double rateofRet;
    double numYears;
    int numPerYear;

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

        JLabel heading = new JLabel("Initial Investment Need for Regular Withdrawals");
        JLabel regWDLab = new JLabel("Desired Withdrawal");
        JLabel periodLab = new JLabel("Years");
        JLabel rateLab = new JLabel("Rate of Return");
        JLabel numWDLab = new JLabel("Number of Withdrawals per Year");
        JLabel initialLab = new JLabel("Initial Investment Required");

        regWDText = new JTextField(10);
        periodText = new JTextField(10);
        initialText = new JTextField(10);
        rateText = new JTextField(10);
        numWDText = new JTextField(10);

        initialText.setEditable(false);
        doIt = new JButton("Compute");

        gbc.weighty=1.0;
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;
        gbag.setConstraints(heading,gbc);

        gbc.anchor=GridBagConstraints.EAST;

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(regWDLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(regWDText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(periodLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(periodText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(rateLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(rateText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(numWDLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(numWDText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(initialLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(initialText,gbc);

        gbc.anchor=GridBagConstraints.CENTER;
        gbag.setConstraints(doIt,gbc);

        add(heading);
        add(regWDLab);
        add(regWDText);
        add(periodLab);
        add(periodText);
        add(rateLab);
        add(rateText);
        add(numWDLab);
        add(numWDText);
        add(initialLab);
        add(initialText);
        add(doIt);
        regWDText.addActionListener(this);
        periodText.addActionListener(this);
        rateText.addActionListener(this);
        numWDText.addActionListener(this);
        doIt.addActionListener(this);

        nf= NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double result=0.0;
        String regWDStr = regWDText.getText();
        String periodStr = periodText.getText();
        String rateStr =  rateText.getText();
        String numWDStr =  numWDText.getText();

        try{
            if(regWDStr.length() !=0 &&
                    periodStr.length() !=0 &&
                    rateStr.length() !=0 &&
                    numWDStr.length() !=0){
                regWDAmount = Double.parseDouble(regWDStr);
                numYears = Double.parseDouble(periodStr);
                rateofRet = Double.parseDouble(rateStr)/100;
                numPerYear=Integer.parseInt(numWDStr);
                result=compute();
                initialText.setText(nf.format(result));
            }
            showStatus("");
        }catch (NumberFormatException exc){
            showStatus("Invalid Data");
            initialText.setText("");
        }
    }
    double compute(){
        double b,e;
        double t1,t2;
        t1=(regWDAmount*numPerYear)/rateofRet;
        b=(1+rateofRet/numPerYear);
        e=numPerYear*numYears;
        t2=1-(1/Math.pow(b,e));
        return t1*t2;
    }
}
