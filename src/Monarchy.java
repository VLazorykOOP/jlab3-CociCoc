public class Monarchy extends Kingdom {
    private String royalFamily;

    public Monarchy(String name, int population, String monarch, String royalFamily) {
        super(name, population, monarch);
        this.royalFamily = royalFamily;
    }

    public String getRoyalFamily() {
        return royalFamily;
    }

    public void setRoyalFamily(String royalFamily) {
        this.royalFamily = royalFamily;
    }
    @Override
    public String toString() {
        return "royalFamily: " + royalFamily + " " + super.toString();
    }
}
