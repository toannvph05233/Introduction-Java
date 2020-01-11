package ke_thua._inteface;

public class Chicken extends Animal implements Edible {
    public static void main(String[] args) {
        Chicken chiken = new Chicken();
        System.out.println(chiken.makeSounds());
        System.out.println(chiken.howtoeat());
    }

    @Override
    public String howtoeat() {
        return "bạn phải mổ";
    }
}
