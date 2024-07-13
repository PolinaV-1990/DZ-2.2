public class Main {
    public static void main(String[] args) {

        int initialBalance = 500;
        int addend = 1100;

        int bonus = 0;
        if (addend > 1000){
            bonus = addend / 100;
        }
        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итоговый баланс" + finalBalance);
        System.out.println("Бонус" + bonus);
    }
}