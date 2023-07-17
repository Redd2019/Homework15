public abstract class HogwartsStudent {
    private final String name;
    private int magicPower;
    private int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
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

    public String getName() {
        return name;
    }


    public void compare (HogwartsStudent hogwartsStudent) {
        if (this.magicPower+this.transgressionDistance >
                hogwartsStudent.magicPower+ hogwartsStudent.transgressionDistance) {
            System.out.println(this.getName() + " обладает бОльшей мощностью магии и расстоянию трансгрессии, чем "
                    + hogwartsStudent.getName());
        }else {
            System.out.println(hogwartsStudent.getName() + " обладает бОльшей мощностью магии и расстоянию трансгрессии, чем "
                    + this.getName());
        }
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
