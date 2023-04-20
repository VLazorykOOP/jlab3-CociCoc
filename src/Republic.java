public class Republic extends Kingdom {
    private String president;

    public Republic(String name, int population, String monarch, String president) {
        super(name, population, monarch);
        this.president = president;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }
    @Override
    public String toString() {
        return "President: " + president + " " + super.toString();
    }
}
