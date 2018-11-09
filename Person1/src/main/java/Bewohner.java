public class Bewohner {
    private String bewohner;
    private String vorname;
    private String nachnaem;

    public Bewohner() {}

    public Bewohner(String bewohner) {
        this.bewohner = bewohner;
    }

    public void splitToTwoString() {
        String[] parts = bewohner.split(";");
    }
}
