public class PekingDuck extends Duck{
    PekingDuck(String name) {
        super(name);
    }

    @Override
    void clean(Animal animal) {
        System.out.println("พี่แจ๊คครับ...ผมตุยแล้ว");
    }

    @Override
    public void fly() {
        System.out.println("ผมนั้นบินไม่ได้");
    }

    @Override
    public void beCrispy(){
        System.out.println("กรุ๊บ กรุ๊บ! ตัวผมนั้นอร่อยกว่าใครเขา");
    }
}
