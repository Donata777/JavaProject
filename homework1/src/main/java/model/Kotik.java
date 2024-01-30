package model;

public class Kotik {

    private int prettiness;
    private String name;
    private int weight;
    private String meow;

    //числовая переменная экземпляра, показывающая степень сытости котика
    private int degreeSatiety = 5;

    /*Добавить в класс Kotik статическую переменную, отвечающую за количество созданных экземпляров класса.
    К переменной должна применяться арифметическая операция «инкремент» при создании экземпляра класса.*/
    private static int count;

    {
        count++;
    }

    //конструктор с параметрами
    public Kotik(int prettiness, String name, int weight, String meow) {
        setKotik(prettiness, name, weight, meow);
    }

    //конструктор без параметров
    public Kotik() {

    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    //Для доступа к переменным из других классов создать геттеры (public методы getName(), getWeight(), и т.д.)

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public int getDegreeSatiety() {
        return degreeSatiety;
    }

    public static int getCount() {
        return count;
    }

    /*Методы (5 шт), описывающие его поведение. Если котик действие выполнил, то сытость должна уменьшаться.
    Методы, описывающее поведение кота, должны сигнализировать о том, выполнил его котик или нет.
    Если котик голоден - он будет просить есть, а не выполнять указанное действие.*/

    public boolean wash() {
        if (degreeSatiety > 0) {
            degreeSatiety--;
            System.out.println("Умылся от души, " + "степень сытости: " + degreeSatiety);
            return true;
        }
        return false;
    }

    public boolean sleep() {
        if (degreeSatiety > 0) {
            degreeSatiety--;
            System.out.println("Хорошо поспал, " + "степень сытости: " + degreeSatiety);
            return true;
        }
        return false;
    }

    public boolean play() {
        if (degreeSatiety > 0) {
            degreeSatiety--;
            System.out.println("Поиграл, " + "степень сытости: " + degreeSatiety);
            return true;
        }
        return false;
    }

    public boolean chaseMouse() {
        if (degreeSatiety > 0) {
            degreeSatiety--;
            System.out.println("Поймал несколько мышек, " + "степень сытости: " + degreeSatiety);
            return true;
        }
        return false;
    }

    public boolean walk() {
        if (degreeSatiety > 0) {
            degreeSatiety--;
            System.out.println("Погулял на улице, " + "степень сытости: " + degreeSatiety);
            return true;
        }
        return false;
    }

    /*Сделать три перегрузки метода eat(), одна из них будет принимать только количество условных единиц сытости,
    и увеличивать на них соответствующую переменную экземпляра, другая единицы сытости и название еды,
    третья не принимает параметров, но содержит внутри себя вызов перегрузки принимающей название еды и единицы сытости.*/

    public void eat(int foodUnits) {
        degreeSatiety += foodUnits;
    }

    public void eat(int foodUnits, String nameFood) {
        degreeSatiety += foodUnits;
        System.out.println("Время кушать " + nameFood + ", cтепень сытости стала: " + degreeSatiety);
    }

    public void eat() {
        eat(7, "viskas");
    }

    /*Создать в классе котик метод liveAnotherDay(), в котором будет цикл на 24 итерации,
    в каждой из которых будет случайным образом вызываться один из методов котика, отвечающих за его поведение,
    и если котик вместо выполнения метода будет просить есть - его надо будет покормить.*/

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            boolean done;
            switch ((int) (Math.random() * 5 + 1)) {
                case 1:
                    done = play();
                    break;
                case 2:
                    done = sleep();
                    break;
                case 3:
                    done = chaseMouse();
                    break;
                case 4:
                    done = wash();
                    break;
                default:
                    done = walk();
                    break;
            }

            if (!done)
                eat();
        }
    }
}
