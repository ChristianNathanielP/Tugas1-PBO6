import java.text.DecimalFormat;

class Dog{ //Class
    String name;
    String race;
    int age;
    double weight;
    String barking;
//    ^= State/Atribut/Properti

    public Dog(String name, String race, int age, double weight, String barking){
        this.name = name;
        this.race = race;
        this.age = age;
        this.weight = weight;
        this.barking = barking;
    }

    void hello(){
        System.out.println(name + " said " + barking);
        System.out.println("Translate: Nama Aku " + name);

        System.out.println(barking);
        System.out.println("Translate: Aku termasuk kedalam ras " + race);

        System.out.println(barking);
        System.out.println("Translate: Aku sekarang berumur " + age + " tahun");
    }

    void sit(){
        System.out.println(name + " sedang duduk...");
        System.out.println(barking);
        System.out.println("Translate: Nyantai dl ngabb...");
    }

    void eat(){
        System.out.println(name + " sedang makan...");
        weight = ++weight;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Berat badan " + name + " saat ini: " + df.format(weight) + "kg");
    }

    void poop(){
        System.out.println(name + " sedang poop...");
        weight = weight - 0.5;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Berat badan " + name + " saat ini: " + df.format(weight) + "kg");
    }
//    ^= Method/Behaviour
}


public class Main {
    public static void main(String[] agrs){

        Dog Loly = new Dog("Loly", "Kintamani", 2, 15.12, "Guk Guk Guk"); //Instantion Loly
        Dog Momo = new Dog("Momo", "Husky", 3, 20.00, "GRUKK GRUKK GRUKK"); //Instantion Momo
        Dog Jazz = new Dog("Jazz", "Golden", 2, 16.90, "Huk Huk Huk");//Instantion Jazz
//      Object = Loly, Momo, Jazz
        Loly.hello();
        Loly.sit();
        System.out.println();
        Momo.hello();
        Momo.eat();
        Momo.poop();
        System.out.println();
        Jazz.hello();
        Jazz.poop();
        Jazz.poop();
        Jazz.eat();
    }
}