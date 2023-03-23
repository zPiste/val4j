package dev.piste.jva.officer.models.util;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Location {

    @SerializedName("x")
    private double x;
    @SerializedName("y")
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}