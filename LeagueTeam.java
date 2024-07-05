/*
    Recall that getters and setters are NOT to be included in UML documentation. This includes constructors
 */

import java.util.ArrayList;
import java.util.List;

public class LeagueTeam {
    private String name;
    private int fanCount;
    private double budget;
    private List<Player> roster = new ArrayList<Player>(20);
    private double threshold;
    private Manager teamManager;
    private PlayStyle style;

    public PlayStyle getStyle() {
        return style;
    }

    public void setStyle(PlayStyle style) {
        this.style = style;
    }

    public Manager getTeamManager() {
        return teamManager;
    }

    public void setTeamManager(Manager teamManager) {
        this.teamManager = teamManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFanCount() {
        return fanCount;
    }

    public void setFanCount(int fanCount) {
        this.fanCount = fanCount;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<Player> getRoster() {
        return roster;
    }

    public void setRoster(List<Player> roster) {
        this.roster = roster;
    }

    public LeagueTeam(String name, int fanCount, double budget, List<Player> roster, double threshold) {
        this.name = name;
        this.fanCount = fanCount;
        this.budget = budget;
        this.roster = roster;
        this.threshold = threshold;
    }

    public LeagueTeam(String name, int fanCount, double budget, List<Player> roster,
                      double threshold, Manager teamManager, PlayStyle style) {
        this.name = name;
        this.fanCount = fanCount;
        this.budget = budget;
        this.roster = roster;
        this.threshold = threshold;
        this.teamManager = teamManager;
        this.style = style;
    }

    public void play(LeagueTeam opponent) {
        System.out.println(this.getName() + " is playing " + opponent.getName());
    }

    public boolean isWorth() {
        return threshold >= style.estimateEffort();
    }

}