public class HufflepuffStudent extends HogwartsStudent{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int calculateCompositePower() {
        return this.honesty+this.industriousness+this.loyalty;
    }

    public boolean compare (HufflepuffStudent hufflepuffStudent) {
        return this.calculateCompositePower() > hufflepuffStudent.calculateCompositePower();
    }

    @Override
    public String toString() {
        return "HufflepuffStudent{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
