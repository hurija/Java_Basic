package staticClass;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("x", "x");
        User user2 = new User("y", "y");
        User user3 = new User("z", "z");
        System.out.println(user1);
        System.out.println(User.globalId);
        System.out.println(user2);
        System.out.println(User.globalId);
        System.out.println(user3);
        System.out.println(User.globalId);

        // odwoanie do składowej statycznej
        // 1. Nie wymaga utworzenia obiektu
        // 2. Odwołujemy się poprzedzając składową nazwą klasy
        // 3. Jest tylko jedna kopia składowej statycznej w ramach klasy


    }
}