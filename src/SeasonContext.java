public class SeasonContext {
    private Season season;

    public SeasonContext(Season season) {
        this.season = season;
    }

    public void displaySeason() {
        season.displaySeason();
    }
}
