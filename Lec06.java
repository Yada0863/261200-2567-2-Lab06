public class Lec06 {
    public static void main(String[] args) {
//        Animal animal = new Animal();
        Cow wagyu = new Cow();
        Duck donald = new Duck("โดนัลด์");
        Duck daisy = new Duck("เดซี่");
        Pig burin = new Pig();
        Owl hedwig = new Owl();

        wagyu.sound();
        donald .sound();
        burin.sound();
        hedwig.sound();
        System.out.println();

        donald.clean(wagyu);
        daisy.clean(donald);
        System.out.println();

        Duck jiaTongHeng = new PekingDuck("JHT");
        jiaTongHeng.clean(daisy);
        jiaTongHeng.fly();
        System.out.println();

        donald.clean(new Cow());
        System.out.println();

        jiaTongHeng.beCrispy();
    }
}