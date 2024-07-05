public class AggresiveStyle extends PlayStyle {

    public AggresiveStyle(String styleName, double winProbability, int requiredPlayers) {
        super(styleName, winProbability, requiredPlayers);
    }

    @Override
    public double estimateEffort() {
        return this.getWinProbability() * getRequiredPlayers();
    }
}