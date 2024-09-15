

import de.telran.hw_12_ArrayLists.Human;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainArrList {
//   1) Создать ArrayList с объектами вашего собственного класса (например Human)
//    и вывести их на экран. Создать ArrayList с объектами вашего собственного класса
//    и вывести только те, которые удовлетворяют определенному условию.
//    (например цвет глаз = голубой) Создать ArrayList с объектами вашего собственного класса
//    и удалить все элементы, удовлетворяющие определенному условию.
//    (например возраст человека < 16 лет)
//    *Создать ArrayList с объектами вашего собственного класса и отфильтровать
//    только уникальные элементы.


    public static void main(String[] args) {
        // 1. Создаём ArrayList с объектами класса Human
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Max", "Maximov", 18, "liegthBroun"));
        humans.add(new Human("Olga", "Olgova", 32, "green"));
        humans.add(new Human("Sam", "Samov", 16, "blue"));
        humans.add(new Human("Luisa", "Luisova", 25, "brown"));
        humans.add(new Human("Tom", "Tompson", 14, "gray"));
        humans.add(new Human("Klara", "Karlova", 45, "gray"));


        // Выводим созданный ArrayList на экран
        for (Human human : humans) {
            System.out.println(human);
        }

        // Теперь отфильтруем  только людей с голубыми глазами
        System.out.println();
        System.out.println("люди с голубыми глазами:   ");
        for (Human human : humans) {
            if (human.eyeColor.equals("blue")) {
                System.out.println(human);
            }
        }


        //   удалить все элементы, удовлетворяющие определенному условию
//    (например возраст человека < 16 лет)
        System.out.println();
        // удаление по условию
        for (Human human : humans) {
            if (human.age < 16) {
                System.out.println("Удаление из списка " + human.name + " ,которому/которой меньше 16 лет");
                humans.remove(human);
            }
        }
// вывод оставшихся в списке  людей, старше  16 лет
        System.out.println();
        System.out.println("оставшиеся в списке ( люди старше  16 лет):    ");
        for (Human human : humans) {
            System.out.println(human);
        }


//    отфильтруем  только уникальные элементы. Для этого преобразуем наш ArrayList в
// HashSet, для удаления дубликатов. После этого преобразуем результат обратно в ArrayList.

        Set<Human> setH = new HashSet<>(humans);

        // просмотрим созданное множество
        System.out.println();
        System.out.println("--------------созданное из ArrayList множество: ");
        Iterator itr = setH.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // После этого преобразуем результат обратно в ArrayList.
        ArrayList<Human> returnHuman = new ArrayList<>(setH);

        //Проверим результат преобразования
        System.out.println();
        System.out.println("----наш ArrayList после преобразования из HashSet:    ");
        for (Human human : returnHuman) {
            System.out.println(human);
        }


    }
}
