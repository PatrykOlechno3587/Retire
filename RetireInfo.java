import java.awt.*;

 class RetireInfo {

    private double savings;
    private double contrib;
    private double income;
    private int currentAge;
    private int retireAge;
    private int deathAge;
    private double inflationPercent;
    private double investPercent;
    private int age;
    private double balance;

    public double getBalance(int year) {
        if (year < currentAge) return 0;
        else if (year == currentAge) {
            age = year;
            balance = savings;
            return balance;

        } else if (year == age) return balance;
        if (year != age + 1) getBalance(year - 1);
        age = year;
        if (age < retireAge) balance += contrib;
        else balance -= income;
        balance = balance * (1 + (investPercent - inflationPercent));
        return balance;

    }

    public double getSavings()    {
         return savings;

    }
    public void setSavings(double newValue)
    {
         savings = newValue;

    }
    public double getContrib()


    {
        return contrib;

    }

    public void setContrib(double newValue)
 {
         contrib = newValue;
 }
         public double getIncome()
{
         return income;
         }
    public void setIncome(double newValue)
            {
         income = newValue;
         }

         public int getCurrentAge()
        {
         return currentAge;
         }
         public void setCurrentAge(int newValue)
 {
        currentAge = newValue;
         }

    public int getRetireAge()
 {

         return retireAge  ;
         }


     public void setRetireAge(int newValue)
 {
          retireAge = newValue;
          }

    public int getDeathAge()
    {
         return deathAge;
         }

         public void setDeathAge(int newValue)
 {
         deathAge = newValue;
         }


         public double getInflationPercent() {
         return inflationPercent;
        }

         public void setInflationPercent(double newValue)
 {
         inflationPercent = newValue;
         }


       public double getInvestPercent()
 {
         return investPercent;
         }


        public void setInvestPercent(double newValue)
 {
         investPercent = newValue;
         }




 }


