public class Bank {
    private int numbercount;
    private String name;
    private double balance;
    private final double taxSake = 5.0;


    public Bank(String name, int numbercount){
        balance = 0;
        this.name = name;
        this.numbercount = numbercount;
    }

    public Bank(String name, int numbercount, double balance){
        this.balance = balance;
        this.name = name;
        this.numbercount = numbercount;
    }

    public boolean DepositBank(double deposit){
        if (deposit > 0){
            balance = balance + deposit;
            return true;
        }else{
            return  false;
        }
    }

    public boolean SakeBank ( double sake) {
        if (sake > 0) {
            balance = balance - (sake + taxSake);
            return true;
        } else {
            return false;
        }
    }

    public double getBalance(){
        return balance;
    }
    public int getNumbercount(){
        return  numbercount;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "Account " + numbercount +
                ", Holder: " + name +
                ", Balance: $ " + String.format("%.2f", balance );
    }
}
