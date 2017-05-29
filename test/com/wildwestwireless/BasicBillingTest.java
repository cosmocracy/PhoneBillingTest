// ***************************************************************************
// Copyright (c) 2014, Industrial Logic, Inc., All Rights Reserved.
//
// This code is the exclusive property of Industrial Logic, Inc. It may ONLY be
// used by students during Industrial Logic's workshops or by individuals
// who are being coached by Industrial Logic on a project.
//
// This code may NOT be copied or used for any other purpose without the prior
// written consent of Industrial Logic, Inc.
// ****************************************************************************

package com.wildwestwireless;

import junit.framework.TestCase;
import org.junit.Test;

// Feel free to rename this class 
public class BasicBillingTest extends TestCase {
    private static final int ONE_LINE = 1;
    private static final int TWO_LINES = 2;
    private static final int THREE_LINES = 3;
    private static final int NUMBER_OF_MINS_USED = 999;
    private int INCLUDED_MINS = 1000;
    private double ADDITIONAL_PER_MIN_CHARGE = 0.45;

    public void testGoldAccount() {

       // assertEquals(49.95, goldAccountWith(ONE_LINE).computeBill());
       // assertEquals(64.45, goldAccountWith(TWO_LINES).computeBill());
        assertEquals(49.95, goldAccountWith(ONE_LINE, NUMBER_OF_MINS_USED).computeBill());
    }

  /*  public void testSilverAccount() {

        assertEquals(29.95, silverAccountWith(ONE_LINE).computeBill());
        assertEquals(72.95, silverAccountWith(THREE_LINES).computeBill());
    }

    public Account silverAccountWith(int numberOfLines) {
        return new Account(numberOfLines, 29.95, 21.50);
    }*/
    public Account goldAccountWith(int numberOfLines, int numberOfMins) {
        return new Account(numberOfLines, 49.95, 14.50, NUMBER_OF_MINS_USED, INCLUDED_MINS, ADDITIONAL_PER_MIN_CHARGE);
    }

}

