import Unit.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        Animal animal = new Animal() {
        };
        Cat cat = new Cat(0, null, null, null, null, null);
        Dog dog = new Dog(0, null, null, null, null, null);
        Namster namster = new Namster(0, null, null, null, null, null);
        Horse horse = new Horse(0, null, null, null, null, null);
        Camel camel = new Camel(0, null, null, null, null, null);
        Donkey donkey = new Donkey(0, null, null, null, null, null);
        animals.add(camel);
        animals.add(cat);
        animals.add(dog);
        animals.add(donkey);
        animals.add(horse);
        animals.add(namster);


        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).getInfo());
        }

        Counter counter = new Counter(0);
        String main_instruction = "Введите команду 1 -(завести новое животное),2 -(список команд), 3 -(добавить команду), 0 -(выход): ";
        int command = 9;
        while (command != 0) {
            System.out.println(main_instruction);
            command = iScanner.nextInt();

            switch (command) {
                case 1:
                    int id_ = counter.add(animals.size());
                    System.out.println(("Введите имя: "));
                    String name_ = iScanner.next();
                    System.out.println(("Введите тип (pet, pack): "));
                    String typeAnimal_ = iScanner.next();
                    System.out.println(("Введите класс (camel,cat,dog,donkey,horse,namster): "));
                    String classAnimal_ = iScanner.next();
                    System.out.println(("Введите команду, выполняемую: "));
                    String commands_ = iScanner.next();
                    System.out.println(("Введите дату рождения (yyyy-MM-dd): "));
                    String birthday_ = iScanner.next();

                    animal.setId(id_);
                    animal.setName(name_);
                    animal.setTypeAnimal(typeAnimal_);
                    animal.setClassAnimal(classAnimal_);
                    animal.setCommands(commands_);
                    animal.setBirthday(birthday_);
                    animals.add(animal);

                    for (int i = 0; i < animals.size(); i++) {
                        System.out.println(animals.get(i).getInfo());
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Повторите команду");
            }
        }


    }

}
