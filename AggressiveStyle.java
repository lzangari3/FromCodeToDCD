public class AggressiveStyle extends PlayStyle {

    public AggressiveStyle(String styleName, double winProbability, int requiredPlayers) {
        super(styleName, winProbability, requiredPlayers);
    }

    @Override
    public double estimateEffort() {
        return this.getWinProbability() * getRequiredPlayers();
    }
}