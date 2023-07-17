public class RavenClawStudent extends HogwartsStudent{
    private int mind;
    private int wisdom;
    private int creativity;

    public RavenClawStudent(int magicPower, int transgressionDistance, int mind, int wisdom, int creativity) {
        super(magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "RavenClawStudent{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", creativity=" + creativity +
                '}';
    }
}
