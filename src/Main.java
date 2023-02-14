public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int a = 2147483647;
        byte b = 127;
        short c = 32767;
        long d = 322337203;
        float e = 1.7F;
        double f = 5.3;

        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");

        float a = 27.12F;
        long b = 987678965549l;
        double c = 2.786;
        int d = 569;
        int e = -159;
        short f = 27897;
        char g = 67;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g + "\n");
    }

    public static void task3() {
        System.out.println("Задача 3");

        int Ludmila = 23;           // У Людмилы Павловны — 23 ученика
        int Anna = 27;          // У Анны Сергеевны — 27 учеников
        int Ekaterina = 30;         // У Екатерины Андреевны — 30 учеников

        int listov = 480;           // закупили все вместе 480 листов бумаги
        int ychenkov = Ludmila + Anna + Ekaterina;
        int listov1 = listov / ychenkov;            // достанется листов каждому ученику
        System.out.println("На каждого ученика рассчитано " + listov1 + " листов бумаги\n");
    }

    public static void task4() {
        System.out.println("Задача 4");

        int kolvo = 16;             // Кол-во бутылок
        int skorost = 2;            // Время затраченое на 16 бутылок (в мин)
        int VMin = kolvo / skorost;             // Кол-во бутылок в мин
        int dvatcatmin = VMin * 20;
        System.out.println("За 20 минут машина произвела " + dvatcatmin + " штук бутылок");
        int vchas = VMin * 60;
        int vsytki = vchas * 24;
        System.out.println("За сутки машина произвела " + vsytki + " штук бутылок");
        int tridna = vsytki * 3;
        System.out.println("За 3 дня машина произвела " + tridna + " штук бутылок");
        int mesac = vsytki * 28;
        System.out.println("За месяц машина произвела " + mesac + " штук бутылок\n");
    }

    public static void task5() {
        System.out.println("Задача 5");

         int banokvsego = 120;
         int beloi = 2;
         int korichevoi = 4;
         int naklass = beloi + korichevoi;          // Сколько краски уходит на класс
         int klassov = banokvsego / naklass;            // Классов всего
         int beloivsego = beloi * klassov;
         int korichevoivsego = korichevoi * klassov;
         System.out.println("В школе, где " + klassov + " классов, нужно " + beloivsego + " банок белой краски и " + korichevoivsego + " банок коричневой краски\n");
    }

    public static void task6() {
        System.out.println("Задача 6");

        int banan = 5;          // Бананов всего
        int vesbaban = 80;          // Вес одного банана
        int moloko = 200;           // Молока всего
        int vesmoloka = 105;        //Вес 100мл. молока
        int morojenoe = 100;        // Вес 1го брикета мороженного
        int morojenogovsego = 2;
        int egg = 4;
        int vesegg = 70;            // Вес 1го яйца
        int banana = banan * vesbaban;              // Вес 5ти бананов
        int milk = vesmoloka * 2;
        int icecream = morojenoe * morojenogovsego;
        int eggs = egg * vesegg;
        int veszavtraka = banana + milk + icecream + eggs;          // Вес завтрака в граммах
        double zavtrak = veszavtraka / 1000;
        System.out.println("Вес спортзавтрака равен " + zavtrak + " кг. \n");
    }

    public static void task7() {
        System.out.println("Задача 7");

        int nadopoxydet = 7;            // Надо похудеть на 7кг
        int teraet = 250;           // В день теряет 250г
        int xydet = nadopoxydet * 1000;         // Надо худеть в граммах
        int vdnax = xydet / teraet;
        System.out.println("В среднем " + vdnax + " дней надо чтобы похудеть на " + nadopoxydet + " кг., если терять в день по 250г");
        teraet = 500;
        vdnax = xydet / teraet;
        System.out.println("В среднем " + vdnax + " дней надо чтобы похудеть на " + nadopoxydet + " кг., если терять в день по 500г \n");
    }

    public static void task8() {
        System.out.println("Задача 8");

        int Masha = 67_760;
        int Denis = 83_690;
        int Kristina = 76_230;
        int trary1 = Masha * 12;
        int trary2 = Denis * 12;
        int trary3 = Kristina * 12;
        System.out.println("Годовой доход Маши до повышения зарплаты " + trary1);
        System.out.println("Годовой доход Дениса до повышения зарплаты " + trary2);
        System.out.println("Годовой доход Кристины до повышения зарплаты " + trary3 + "\n");
        int povyshenie1 = Masha / 10;
        int doxod1 = Masha + povyshenie1;
        int trary4 = doxod1 * 12;
        System.out.println("Годовой доход Маши после повышения зарплаты " + trary4);
        int povyshenie2 = Denis / 10;
        int doxod2 = Denis + povyshenie2;
        int trary5 = doxod2 * 12;
        System.out.println("Годовой доход Дениса после повышения зарплаты " + trary5);
        int povyshenie3 = Kristina / 10;
        int doxod3 = Kristina + povyshenie3;
        int trary6 = doxod3 * 12;
        System.out.println("Годовой доход Кристины после повышения зарплаты " + trary6 + "\n");
        int raznica1 = trary4 - trary1;
        int raznica2 = trary5 - trary2;
        int raznica3 = trary6 - trary3;
        System.out.println("Зарплата Маши повысилась на " + raznica1 + " в год");
        System.out.println("Зарплата Дениса повысилась на " + raznica2 + " в год");
        System.out.println("Зарплата Кристины повысилась на " + raznica3 + " в год");
    }
}