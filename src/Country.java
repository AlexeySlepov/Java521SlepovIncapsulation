public class Country {

    private String name;
    private int population;
    private double square;
    private String capital;
    private boolean hasSea;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean isHasSea() {
        return hasSea;
    }

    public void setHasSea(boolean hasSea) {
        this.hasSea = hasSea;
    }
}
