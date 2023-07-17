public class GriffindorStudent extends HogwartsStudent {

    private int nobility;
    private int honor;
    private int courage;

    public GriffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    private int calculateCompositePower() {
        return this.courage+this.honor+this.nobility;
    }


    public void compare (GriffindorStudent griffindorStudent) {
        if (this.calculateCompositePower() > griffindorStudent.calculateCompositePower()) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + griffindorStudent.getName());
        }else {
            System.out.println(griffindorStudent.getName() + " лучший Гриффиндорец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return "GriffindorStudent{" +
                "hogwartsStudent=" + super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }
}
