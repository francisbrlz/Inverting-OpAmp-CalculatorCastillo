/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.opampcalculator;

/**
 *
 * @author Francis
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvertingOpAmpGUI extends JFrame {
        private JTextField r1Field, r2Field, inputVoltageField, outputVoltageField, gainField;

    public InvertingOpAmpGUI() {
       //nag set kog title sa calculator ("Inverting Op-Amp Gain and Output Voltage Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        // sa design ni sya(frame) nag set ko ug components niya diria ug labels
        JLabel r1Label = new JLabel("Enter R1 (Ohms):");
        JLabel r2Label = new JLabel("Enter R2 (Ohms):");
        JLabel inputVoltageLabel = new JLabel("Enter Input Voltage (V):");
        JLabel gainLabel = new JLabel("Gain (Calculated):");
        JLabel outputVoltageLabel = new JLabel("Output Voltage (V) (restricted to OpAmp supp. voltage):");

        r1Field = new JTextField();
        r2Field = new JTextField();
        inputVoltageField = new JTextField();
        gainField = new JTextField();
        outputVoltageField = new JTextField();

        gainField.setEditable(false);
        outputVoltageField.setEditable(false);

        // para sa frames sa display (got aided by someone on this part. kudos to you)
        add(r1Label);
        add(r1Field);
        add(r2Label);
        add(r2Field);
        add(inputVoltageLabel);
        add(inputVoltageField);
        add(gainLabel);
        add(gainField);
        add(outputVoltageLabel);
        add(outputVoltageField);

        // para ni sya sa botton sa "calculate"
        JButton calculateButton = new JButton("Calculate");
        add(calculateButton);
        
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // i set niya ang values sa r1,r2 ug input voltage
                    double r1 = Double.parseDouble(r1Field.getText());
                    double r2 = Double.parseDouble(r2Field.getText());
                    double inputVoltage = Double.parseDouble(inputVoltageField.getText());

                    // buhat ug object para sa opamp
                    InvertingOpAmp opAmp = new InvertingOpAmp(r1, r2, inputVoltage);

                    // i show niya ang gain aswell as ang output voltage
                    gainField.setText(String.format("%.2f", opAmp.getGain()));
                    outputVoltageField.setText(String.format("%.2f", opAmp.getOutputVoltage()));
                } catch (NumberFormatException ex) {
                    // error mess. incase letters or dili number ang i input sa user sa calculator.
                    JOptionPane.showMessageDialog(null, "Please enter numerical values for R1, R2, and Input Voltage.");
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para ma end ang error once clicked ok
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InvertingOpAmpGUI(); // i display na niya ang gui
            }
        });
    }
}

//mao ni ang pinakahasul nga part ani nga project, it requires me to ask someone for help, sa youtube pud, and anything nga makaya nako
// ang pinakalisud ani niya is ang sa mga frames ug sa display sa gui, kapila nko gibalikan bacauses of bugs 
//overall, thanks to the help and youtube, finally got this part done