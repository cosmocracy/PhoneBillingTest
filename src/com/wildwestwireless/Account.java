package com.wildwestwireless;

/**
 * Created by matt on 2017-05-29.
 */
public class Account {
    private final int numberOfLines;
    private final double monthlyPrimaryLineRate;
    private final double monthlyAdditionalLineRate;
    private final int numberOfMinsUsed;
    private final int includedMins;
    private final double additionalPerMinCharge;
    private double additionalMinsSurcharge = 0.0;


    public Account (int numberOfLines, double monthlyPrimaryLineRate, double monthlyAdditionalLineRate,
                    int numberOfMinsUsed, int includedMins, double additionalPerMinCharge) {
        this.numberOfLines = numberOfLines;
        this.monthlyPrimaryLineRate = monthlyPrimaryLineRate;
        this.monthlyAdditionalLineRate = monthlyAdditionalLineRate;
        this.numberOfMinsUsed = numberOfMinsUsed;
        this.includedMins = includedMins;
        this.additionalPerMinCharge = additionalPerMinCharge;
    }

    public double computeBill(){
        if(numberOfMinsUsed > includedMins)
            additionalMinsSurcharge = additionalPerMinCharge*(numberOfMinsUsed-includedMins);
        return monthlyPrimaryLineRate + (numberOfLines - 1)*monthlyAdditionalLineRate + additionalMinsSurcharge;
    }
}
