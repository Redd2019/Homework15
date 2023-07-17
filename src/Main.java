public class Main {
    public static void main(String[] args){
        GriffindorStudent harryPotter = new GriffindorStudent(14, 99, 78, 88, 100);
        GriffindorStudent hermioneGranger = new GriffindorStudent(40, 75, 22, 90, 80);
        GriffindorStudent ronWeasley = new GriffindorStudent(2, 55, 15, 68, 90);

        SlytherinStudent dracoMalfoy = new SlytherinStudent(44,67,88, 77,91, 44,32);
        SlytherinStudent grahamMontagu = new SlytherinStudent(22,15,1, 35,0, 5,11);
        SlytherinStudent gregoryGoyle = new SlytherinStudent(1,2,3, 3,4, 5,6);

        HufflepuffStudent zachariasSmith = new HufflepuffStudent(12,13,11,10,9);
        HufflepuffStudent cedricDiggory = new HufflepuffStudent(99,98,10,93,100);
        HufflepuffStudent justinFinchFletchley = new HufflepuffStudent(35,43,40,33,39);

        RavenClawStudent zhouChang = new RavenClawStudent(98,88,95,99,100);
        RavenClawStudent padmaPatil = new RavenClawStudent(10,9,8,7,6);
        RavenClawStudent marcusBelby = new RavenClawStudent(55,60,55,50,0);

        System.out.println(harryPotter.compare(ronWeasley));
        System.out.println(gregoryGoyle.compare(justinFinchFletchley));
    }


}