public class Main {
    public static void main(String[] args) {
        int temperature = 25;
        int studentsAmount = 4;
        boolean isRainy = false;

        switch (temperature){
            case 20:
                System.out.println("The weather is nice");
                break;
            case 10:
                if (temperature > 0){
                    System.out.println("Above the zero");
                } else {
                    System.out.println("Below the zero");
                }
                break;
            case 40:
                System.out.println("Burn out");
                break;
            default:
                System.out.println("Unknow weather");
                break;
        }

        if (temperature > 20 && studentsAmount > 5){ // && - И
            System.out.println("Let's do picnic");
        }
        if (temperature > 20 || studentsAmount > 5){ // || - ИЛИ
            // 25 > 20=> t || 4 > 5
            System.out.println("Let's do picnic");
        }
        if (temperature > 20 && studentsAmount < 0 || isRainy){
            // t && f || f = f
            System.out.println("Here we go2");
        }
        if (temperature > 20 && !(studentsAmount < 5 || isRainy)){ // ! - НЕ NOT
            // t && t = t
            System.out.println("Here we go3");
        }

        //DRY
        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeCoffee();

        System.out.println("УЖИН");
        makeTea();
        System.out.println(area(7,4));
        coolestMethod("Elvis Presley", 55);
    }
    public static void makeTea(){
        //Here is my commentary
        System.out.println("Налить воду в чайник");
        System.out.println("Поставить чайник на плиту");
        System.out.println("Включить плиту");
        System.out.println("Заварить чай в чайнике");
        System.out.println("Насладиться");
        System.out.println("На чай добавлено молоко");
        System.out.println(magicNumber());
    }
    public static void makeCoffee(){
        System.out.println("Made delicuos coffee");
    }
    public static int magicNumber(){
       return 8;
    }
    public static double area(double length, double width){
        return length * width;
    }

    public static void coolestMethod(String name, int age){
        System.out.println("Hello " + name + " you're " + age + " years old");
    }

}