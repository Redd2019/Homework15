public class Main {
    public static void main(String[] args){
        GriffindorStudent harryPotter = new GriffindorStudent("Гарри Поттер", 14, 99, 78, 88, 100);
        GriffindorStudent hermioneGranger = new GriffindorStudent("Гермиона Грейнджер", 75, 22, 90, 80,44);
        GriffindorStudent ronWeasley = new GriffindorStudent("Рон Уизли", 55, 15, 68, 90, 4);

        SlytherinStudent dracoMalfoy = new SlytherinStudent("Драко Малфой",67,88, 77,91, 44,32,22);
        SlytherinStudent grahamMontagu = new SlytherinStudent("Грэхэм Монтегю",15,1, 35,0, 5,11,77);
        SlytherinStudent gregoryGoyle = new SlytherinStudent("Грегори Гойл",2,3, 3,4, 5,6,0);

        HufflepuffStudent zachariasSmith = new HufflepuffStudent("Захария Смит",13,11,10,9,12);
        HufflepuffStudent cedricDiggory = new HufflepuffStudent("Седрик Диггори",98,10,93,100,74);
        HufflepuffStudent justinFinchFletchley = new HufflepuffStudent("Джастин Финч-Флетли",43,40,33,39,41);

        RavenClawStudent zhouChang = new RavenClawStudent("Чжоу Чанг",88,95,99,100,91);
        RavenClawStudent padmaPatil = new RavenClawStudent("Падма Патил",9,8,7,6,5);
        RavenClawStudent marcusBelby = new RavenClawStudent("Маркус Белби",60,55,50,0,1);

        harryPotter.compare(ronWeasley);
        gregoryGoyle.compare(justinFinchFletchley);
        hermioneGranger.compare(dracoMalfoy);
        grahamMontagu.compare(cedricDiggory);
        zachariasSmith.compare(padmaPatil);
        zhouChang.compare(marcusBelby);
    }
}