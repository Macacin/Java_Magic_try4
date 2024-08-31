import java.util.Scanner;
public class Birdamen {
    public void sort() {
        Scanner sc = new Scanner(System.in);

        String q1 = "Ты предпочитаешь пикать пуджа? (Да/Нет)";
        String q2 = "Ты любишь хукать дальников? (Да/Нет)";
        String q3 = "Ты ливаешь когда пуджа банят? (Да/Нет)";
        String q4 = "Тебя отчисляли из ФУ трусы? (Да/Нет)";

        System.out.println(q1);
        String a1 = sc.nextLine();
        System.out.println(q2);
        String a2 = sc.nextLine();
        System.out.println(q3);
        String a3 = sc.nextLine();
        System.out.println(q4);
        String a4 = sc.nextLine();

        if (a1.equals("Да")) {
            if (a3.equals("Да")) {
                System.out.println("Вы радж обыкновенный");
            } else if (a4.equals("Да")) {
                System.out.println("Кажется вы саня бердмен");
            } else if (a2.equals("Да")) {
                if (a4.equals("Да")) {
                    System.out.println("Вы определенно бердамен");
                } else if (a3.equals("Да")) {
                    System.out.println("Я не уверен что вы бердмен?");
                } else {
                    System.out.println("Вы точно не бердамен!");
                }
            } else if (a3.equals("Да")) {
                System.out.println("Вы просто зомби пуджик");
            } else {
                System.out.println("Паааааааажж");
            }
        }
    }
}
