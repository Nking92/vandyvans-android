package edu.vanderbilt.vandyvans;

public final class Van {

    public final int id;
    public final int percentFull;
    public final FloatPair location;
    
    public Van(int _id, int _percentFull, FloatPair loc) {
        id = _id;
        percentFull = _percentFull;
        location = loc;
    }
    
    public static final String TAG_ID = "ID";
    public static final String TAG_PERCENT_FULL = "APCPercentage";
    public static final String TAG_LATS = "Latitude";
    public static final String TAG_LOND = "Longitude";
    
}
