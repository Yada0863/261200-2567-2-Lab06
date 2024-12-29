public class Duck extends Animal implements Flyable{
    String name;
    public Duck(String name){
        this.name = name;
    }

    public String toString(){
        return "เป็ด:" + this.name;
    }

    @Override
    void sound() {
        System.out.println("quack quack (ก๊าบ ก๊าบ)");
    }

    @Override
    public void fly() {
        System.out.println("prbbb prbbb (พรึ่บๆ)");
    }

    @Override
    public void glide() {
        System.out.println("hi-yahh!");
    }

    void clean(Animal animal){
        System.out.println(this.toString() + " is cleaning " + animal);
    }


    public void beCrispy() {
        System.out.println("เรากินไม่ได้น้าาา");
    }
}
