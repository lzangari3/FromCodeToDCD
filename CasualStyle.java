public class CasualStyle extends PlayStyle {

    public CasualStyle(String styleName, double winProbability, int requiredPlayers) {
        super(styleName, winProbability, requiredPlayers);
    }

    @Override
    public double estimateEffort() {
        return 100 - this.getWinProbability() * (1 - this.getWinProbability() * this.getRequiredPlayers());
    }
}