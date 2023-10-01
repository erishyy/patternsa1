public class Main {
    public static void main(String[] args) {
        SeasonContext summerContext = new SeasonContext(new Summer());
        SeasonContext winterContext = new SeasonContext(new Winter());
        SeasonContext autumnContext = new SeasonContext(new Autumn());
        SeasonContext springContext = new SeasonContext(new Spring());

        winterContext.displaySeason();
        springContext.displaySeason();
        summerContext.displaySeason();
        autumnContext.displaySeason();
    }
}





