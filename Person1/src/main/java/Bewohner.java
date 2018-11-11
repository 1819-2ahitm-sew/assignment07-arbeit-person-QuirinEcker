public class Bewohner {

    private String vorname;
    private String nachnaem;

    //region Description
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachnaem() {
        return nachnaem;
    }

    public void setNachnaem(String nachnaem) {
        this.nachnaem = nachnaem;
    }
    //endregion

    public Bewohner() {}

    public Bewohner(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachnaem = nachname;
    }
}
