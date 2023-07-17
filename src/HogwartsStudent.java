public abstract class HogwartsStudent {
    private int magicPower;
    private int transgressionDistance;

    public HogwartsStudent(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
