/*
    Recall that abstract classes and interfaces can often be interchanged.
 */

public abstract class PlayStyle {
    private String styleName;
    private double winProbability;
    private int requiredPlayers;

    public PlayStyle(String styleName, double winProbability, int requiredPlayers) {
        this.styleName = styleName;
        this.winProbability = winProbability;
        this.requiredPlayers = requiredPlayers;
    }

    public abstract double estimateEffort();

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public double getWinProbability() {
        return winProbability;
    }

    public void setWinProbability(double winProbability) {
        this.winProbability = winProbability;
    }

    public int getRequiredPlayers() {
        return requiredPlayers;
    }

    public void setRequiredPlayers(int requiredPlayers) {
        this.requiredPlayers = requiredPlayers;
    }
}