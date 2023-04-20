public class Kingdom extends Country {
    private String monarch;

    public Kingdom(String name, int population, String monarch) {
        super(name, population);
        this.monarch = monarch;
    }

    public String getMonarch() {
        return monarch;
    }

    public void setMonarch(String monarch) {
        this.monarch = monarch;
    }
    @Override
    public String toString() {
        return "Monarch: " + monarch + " " + super.toString();
    }
}
