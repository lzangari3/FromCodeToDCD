public class LeagueEmployee {
    private String name;
    private double salary;
    private int rating;

    public LeagueEmployee(String name, double salary, int rating) {
        this.name = name;
        this.salary = salary;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}