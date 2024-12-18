/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.opampcalculator;

/**
 *
 * @author Francis
 */
public class OpAmpCalculator {

    public static void main(String[] args) {
       new InvertingOpAmpGUI();
    }
}
//Ang objective aning akong program is to create a calculator wherein ma calculate niya ang gain sa
//inverting operational amplifier aswell as ang output voltage sa circuit based sa gain ug input voltage. Ang max output voltage ani niya sir mag depende sa
// supply voltage sa OpAmp. For example, if ang supply voltage nga gigamit nko sa LM358 OpAmp IC is +-12Volts, ang max output voltage lng niya is going to be
//12v lng regardless if the shown output voltage sa calculator is higher than 12v. Ang formula sa gain based sa r1 ug r2 is -R2/R1=GAIN and 
// output voltage is GAIN X input voltage.
//