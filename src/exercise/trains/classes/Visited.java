package exercise.trains.classes;

public class Visited {
    private Town town;
    private boolean visited;

    public Visited(Town town, boolean visited) {
        this.town = town;
        this.visited = visited;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

}
