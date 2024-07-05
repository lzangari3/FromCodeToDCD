public class Manager extends LeagueEmployee{

    public Manager(String name, double salary, int rating) {
        super(name, salary, rating);
    }

    public void CoachAndGuide(Player player) {
        System.out.println(this.getName() + " is helping coach " + player.getName());
    }
}