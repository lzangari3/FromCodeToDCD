public class Agent extends LeagueEmployee {

    private Player agentPlayer;

    public Agent(String name, double salary, int rating, Player agentPlayer) {
        super(name, salary, rating);
        this.agentPlayer = agentPlayer;
    }

    public Player getAgentPlayer() {
        return agentPlayer;
    }

    public void setAgentPlayer(Player agentPlayer) {
        this.agentPlayer = agentPlayer;
    }

    public void negotiateDeal(Player player) {
        System.out.println("I am currently negotiating a deal for " + player.getName());
    }
}