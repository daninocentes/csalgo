package coins;

public class coins {

     public static void main (String args[]) {

     double  money = 572.75;

    double tenpesobills = (double) Math.floor (money/10);
    money -= tenpesobills * 10;

    double fivepesocoins = (double) Math.floor(money/5);
    money -= fivepesocoins * 5;

    double onepesocoin = (double) Math.floor(money/1);
    money -= onepesocoin * 1;

    double tfcentscoins = (double) Math.floor(money/0.25);
    money -= tfcentscoins * 0.25;

  
    System.out.println("10 Peso Bills: " + tenpesobills);
    System.out.println("5 Peso Coins: " + fivepesocoins);
    System.out.println("1 Peso Coin: " + onepesocoin);
    System.out.println("25 Cents Coins: " + tfcentscoins);
    
  }
}