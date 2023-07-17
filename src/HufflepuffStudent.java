public class HufflepuffStudent extends HogwartsStudent{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name,magicPower, transgressionDistance);
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

    public void compare (HufflepuffStudent hufflepuffStudent) {
        if (this.calculateCompositePower() > hufflepuffStudent.calculateCompositePower()) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + hufflepuffStudent.getName());
        }else {
            System.out.println(hufflepuffStudent.getName() + " лучший Пуффендуец, чем " + this.getName());
        }
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
