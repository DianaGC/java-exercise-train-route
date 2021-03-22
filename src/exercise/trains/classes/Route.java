package exercise.trains.classes;

public class Route {
    private Town town;
    private int weight;

    public Route(Town town, int weight){
        this.town = town;
        this.weight = weight;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
