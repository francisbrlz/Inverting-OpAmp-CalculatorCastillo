/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.opampcalculator;

/**
 *
 * @author Francis
 */
public class InvertingOpAmp {
    private double gain;
    private double outputVoltage;

    // initialization
    public InvertingOpAmp(double r1, double r2, double inputVoltage) {
        this.gain = -r2 / r1;  // Inverting amplifier gain formula
        this.outputVoltage = gain * inputVoltage; // Output voltage calculation
    }

    // kuhaon niya ang value sa gain based sa formula sa line 17
    public double getGain() {
        return gain;
    }

    // kuhaon niya ang value sa output voltage based sa formula sa line 18
    public double getOutputVoltage() {
        return outputVoltage;
    }
}
