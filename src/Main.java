
public class Main {
    public static void main(String[] args) {
        // Используем стратегии для разных времен года
        SeasonContext summerContext = new SeasonContext(new Summer());
        SeasonContext winterContext = new SeasonContext(new Winter());
        SeasonContext autumnContext = new SeasonContext(new Autumn());
        SeasonContext springContext = new SeasonContext(new Spring());

        summerContext.displaySeason(); // Вывод: Лето
        winterContext.displaySeason(); // Вывод: Зима
        autumnContext.displaySeason(); // Вывод: Осень
        springContext.displaySeason(); // Вывод: Весна
    }
}





