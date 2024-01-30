import model.Kotik;

public class Application {

    public static void main(String[] args) {


/*два экземпляра класса Kotik. Для первого экземпляра использовать конструктор с параметрами,
для второго конструктор без параметров в сочетании с методом setKotik(int prettiness, String name, int weight,
String meow) для инициализации переменных.*/

        Kotik kotik1 = new Kotik(2, "Pushok", 1, "meow");
        Kotik kotik2 = new Kotik();
        kotik2.setKotik(1, "Tom", 2, "mau");

        /*Вызвать у любого созданного экземпляра котика метод liveAnotherDay(),
        а так же вывести на экран (в консоль) его имя и вес*/
        kotik1.liveAnotherDay();
        System.out.println("\n" + "Имя котика: " + kotik1.getName());
        System.out.println("Вес котика: " + kotik1.getWeight());

        //Вывести на экран результат сравнения одинаково ли разговаривают котики (сравнить переменные meow).
        System.out.println("Одинаково ли разговаривают котики? " + kotik1.getMeow().equals(kotik2.getMeow()));

        //Вывести на экран количество котиков, созданных в процессе выполнения программы
        System.out.println("Количество котиков: " + Kotik.getCount());
    }
}
