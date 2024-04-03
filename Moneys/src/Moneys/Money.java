package  Moneys;
public class Money {
 private long rubles;
 private int kopecks; // в java нет unsigned поэтому я использовал int.

 public Money(long rubles, int kopecks) {
  if ((rubles < 0 || kopecks < 0) && (rubles == 0 && kopecks == 0)) {
   throw new ArithmeticException("неверно введены данные, или сумма рублей и копеек равно 0");
  } else {
   this.rubles = rubles;
   this.kopecks = kopecks;
  }
 }

 public Money add(Money other) {
  long sumRubles = this.rubles + other.rubles;
  int sumKopecks = this.kopecks + other.kopecks;

  if (sumKopecks >= 100) {
   sumKopecks = sumKopecks - 100;
   sumRubles++;
  }

  return new Money(sumRubles, (short) sumKopecks);
 }

 public Money subtract(Money other) {
  long diffRubles = this.rubles - other.rubles;
  int diffKopecks = this.kopecks - other.kopecks;

  if (diffKopecks < 0) {
   diffKopecks = diffKopecks + 100;
   diffRubles--;
  }

  return new Money(diffRubles, (short) diffKopecks);
 }

 public Money divide(double divisor) {
  double totalMoney = this.rubles + (double) this.kopecks / 100;
  totalMoney = totalMoney / divisor;
  long resultRubles = (long) totalMoney;
  int resultKopecks = (int) ((totalMoney - resultRubles) * 100);

  return new Money(resultRubles, resultKopecks);
 }

 public void divisionOfAmounts(Money money1)
 {
  if (money1.rubles != 0) {
   double totalRubles = this.rubles / money1.rubles;
  } else {
   if (money1.kopecks != 0) {
    double totalKopecks = this.kopecks / money1.kopecks;
   } else {
    throw new ArithmeticException("Рубли и копейки равны нулю, невозможно разделить");
   }
  }
 }
  public Money multiply(double divisor)
  {
  double totalMoney = this.rubles + (double) this.kopecks / 100;
  totalMoney = totalMoney * divisor;
  long resultRubles = (long) totalMoney;
  int resultKopecks = (int) ((totalMoney - resultRubles) * 100);

  return new Money(resultRubles, resultKopecks);
 }
 public String toString()
 {
  return rubles + "," + String.format("%02d", kopecks) + " рублей";
 }
}