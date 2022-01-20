public class Cube {
    private int edge;


    public Cube(int edgeLength) {
        this.edge = edgeLength;
    }

    public int volume() {
        return this.edge * this.edge * this.edge;
    }


    public String toString() {
        return "This length of the edge is " +  this.edge  + " and the volume " + volume();
    }


}
