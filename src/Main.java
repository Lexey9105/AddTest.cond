public class Main {
    public static void main(String[] args) {
        test6();
        test7();

    }
    public static void test6(){
        int age=19;
        int salary=58000;

        if (age<23&&salary<50000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+(double)salary*2+" рублей");}
            if (age>=23&&salary<50000){
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+(double)salary*3+" рублей");}
       if (age<23&&salary>=50000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+(double)salary*3.2+" рублей");}
        if (age>=23&&salary>=50000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+(double)salary*4.2+" рублей");}
        if (age<23&&salary>=80000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+(double)salary*3.5+" рублей");}
        if (age>=23&&salary>=80000){
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "+(double)salary*4.5+" рублей");}
    }


    public static void test7(){
        int age=25;
        int salary=60000;
        int wantedSum=330000;
        double baseRate=0.1;
        if (age<23&&salary<=80000){baseRate+=0.01;}
        if (age>=23&&salary<=80000){baseRate+=0.005;}
        if (age<23&&salary>80000){baseRate+=0.003;}
        if (age>=23&&salary>=80000){baseRate-=0.002;}
        System.out.println(baseRate);
        if ((double)salary/2<(double)baseRate*wantedSum){
            System.out.println("Максимальный платеж при ЗП " +salary+ " равен "+(double)salary/2+" рублей. Платеж по кредиту "+(double)baseRate*wantedSum+" рублей. Отказано");
        }
        if ((double)salary/2>=(double)baseRate*wantedSum){
            System.out.println("Максимальный платеж при ЗП " +salary+ " равен "+(double)salary/2+" рублей. Платеж по кредиту "+(double)baseRate*wantedSum+" рублей. Одобрено");
        }



    }
}