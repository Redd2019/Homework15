public class GriffindorStudent extends HogwartsStudent {

    private int nobility;
    private int honor;
    private int courage;

    public GriffindorStudent(int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(magicPower, transgressionDistance);
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
