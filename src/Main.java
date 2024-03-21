public class Main {
    public static void main(String[] args){
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("1 Задача");
        System.out.println ("Dog " + dog);
        System.out.println("Cat " + cat);
        System.out.println("Paper " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("2 Задача");
        System.out.println("Dog " + dog);
        System.out.println("Cat " + cat);
        System.out.println("Paper " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("3 Задача");
        System.out.println("Dog " + dog);
        System.out.println("Cat " + cat);
        System.out.println("Paper " + paper);

        var friend = 19;
        System.out.println("4 Задача");
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println("5 Задача");
        System.out.println("Frog I - " + frog);
        frog = frog*10;
        System.out.println("Frog II - " + frog);
        frog = frog/3.5;
        System.out.println("Frog III - " + frog);
        frog = frog + 4;
        System.out.println("Frog IV - " + frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("6 Задача");
        System.out.println("Общий вес боксеров - " + totalWeight + "кг.");
        System.out.println("Разница в весе боксеров составляет - " + weightDifference + "кг.");

        var modulo = secondBoxer % firstBoxer;
        System.out.println("7 Задача");
        System.out.println(modulo);


        var workHours = 640;
        var workTime = 8;
        var totalEmployees = workHours/workTime;
        System.out.println("8 Задача");
        System.out.println("Всего сотрудников в компании - " + totalEmployees + " человек.");

        var moreEmployees = totalEmployees + 94;
        var moreWorkHours = moreEmployees * 8;
        System.out.println("Если в компании работает " + moreEmployees + " человека, то всего " + moreWorkHours + " часа работы в день может быть поделено между сотрудниками.");

    }
}