public class Main {
    public static void main(String[] args) {
        test6();
        test7();

    }
    public static void test6(){
        int age=25;
        int salary=100;
        final int minAge=23;

        if (age<minAge&&salary<50000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+(double)salary*2+" рублей");}
            else if (age>=minAge&&salary<50000){
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+(double)salary*3+" рублей");}
        else if (age<minAge&&salary>=50000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+(double)salary*3.2+" рублей");}
        else if (age>=minAge&&salary>=50000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+(double)salary*4.2+" рублей");}
        else if (age<minAge&&salary>=80000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+(double)salary*3.5+" рублей");}
        else if (age>=minAge&&salary>=80000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+(double)salary*4.5+" рублей");}
    }


    public static void test7(){
        int age=23;
        final int minAge=23;
        int salary=60000;
        int wantedSum=330000;
        double baseRate=0.1;
        if (age<minAge&&salary<=80000){baseRate+=0.01;}
        else if (age>=minAge&&salary<=80000){baseRate+=0.005;}
        else if (age<minAge&&salary>80000){baseRate+=0.003;}
        else if (age>=minAge&&salary>=80000){baseRate-=0.002;}
        System.out.println(baseRate);
        if ((double)salary/2<(double)baseRate*wantedSum){
            System.out.println("Максимальный платеж при ЗП " +salary+ " равен "+(double)salary/2+" рублей. Платеж по кредиту "+(double)baseRate*wantedSum+" рублей. Отказано");
        }
        else if ((double)salary/2>=(double)baseRate*wantedSum){
            System.out.println("Максимальный платеж при ЗП " +salary+ " равен "+(double)salary/2+" рублей. Платеж по кредиту "+(double)baseRate*wantedSum+" рублей. Одобрено");
        }



    }
}