public class Player extends LeagueEmployee {

    private Agent playerAgent;

    public Player(String name, double salary, int rating, Agent playerAgent) {
        super(name, salary, rating);
        this.playerAgent = playerAgent;
    }

    public Agent getPlayerAgent() {
        return playerAgent;
    }

    public void setPlayerAgent(Agent playerAgent) {
        this.playerAgent = playerAgent;
    }
}