package com.example.model;

import net.corda.core.serialization.CordaSerializable;

/**
 * A simple class representing an IOU.
 *
 * This is the data structure that the parties will reach agreement over. These data structures can be arbitrarily
 * complex. See https://github.com/corda/corda/blob/master/samples/irs-demo/src/main/kotlin/net/corda/irs/contract/IRS.kt
 * for a more complicated example.
 *
 */
@CordaSerializable
public class IOU {
    private int value;
    public int getValue() { return value; }

    private String name;
    public String getName() { return name; }

    private String address;
    public String getAddress() { return address; }

    private String eligibleCollateral;
    public String getEligibleCollateral() { return eligibleCollateral; }

    private String interestCashCollateral;
    public String getInterestCashCollateral() { return interestCashCollateral; }

    private String threshold;
    public String getThreshold() { return threshold; }

    private String mta;
    public String getMta() { return mta; }

    private String initialMarginCollateral;
    public String getInitialMarginCollateral() { return initialMarginCollateral; }

    private String variationMarginCollateral;
    public String getVariationMarginCollateral() { return variationMarginCollateral; }

    private String comments;
    public String getComments() { return comments; }

    public IOU(int value, String name, String comments) {
        this.value = value;
        this.comments = comments;
        this.name = name;
    }

    // Dummy constructor used by the create-iou API endpoint.
    public IOU() {}

    @Override public String toString() {
        return String.format("IOU(value=%d, name=%s, comments=%s)", value,name,comments);
    }
}