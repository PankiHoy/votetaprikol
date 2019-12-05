package ZHABI;

public class Amphibian {
    public void moveInWater() {
        System.out.println("Я акула туруру");
    }

    public void moveOnLand() {
        System.out.println("ПАААМ ПАРАААААМ");
    }

    public static void main(String[] args) {
        Frog zhaba = new Frog();
        zhaba.moveInWater();
        zhaba.moveOnLand();
        Frog zhabaDodik = (Frog) zhaba;
        zhabaDodik.sayKva();
        Amphibian triton = new RoflanTriton();
        if (triton instanceof Frog) {
            ((Frog)triton).sayKva();
        }
        else {
            System.out.println("Не чел, тритон то не жаба), так не пойдет");
        }
    }

}

class Frog extends Amphibian {
    void sayKva() {
        System.out.println("ЖАБА ИЗДАЕТ РЫК");
    }

    @Override
    public void moveInWater() {
        System.out.println("roflanПлывуПоЖабьи");
    }

    @Override
    public void moveOnLand() {
        System.out.println("ПРИВЕТСТВУЮ СМОТРЯЩИХ");
    }
}

class RoflanTriton extends Amphibian {

}