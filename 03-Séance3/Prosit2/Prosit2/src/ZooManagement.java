public class ZooManagement {
    static void main(String[] args) {
    Zoo MyZoo = new Zoo();
    Animal lion = new Animal();
    lion.family = "Faliale  or something";
    lion.name = "Lion";
    lion.age=30;
    lion.isMammal=true;
    MyZoo.name="belvedere";
    MyZoo.nbrCage=20;
    MyZoo.city="Tunis";

    Animal lion2 = new Animal(family: "Simba", name: "FAlial", age:10);


    }
}
