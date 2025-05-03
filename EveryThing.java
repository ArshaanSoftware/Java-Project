import java.util.*;
public class EveryThing {
        public class Atm{
                private double balance;
                private int pin;

        public Atm(double initialBalance , int pin){
                this.balance = initialBalance;
                this.pin = pin;
        }
        public boolean auth(int enteredPin){
                return this.pin == enteredPin;
        }

        public void showMenu(){
                System.out.println("\nATM Menu");
                System.out.println("\nCheck Balance");
                System.out.println("\nDeposit");
                System.out.println("\nWithdraw");
                System.out.println("\nExit");
        }
        public void checkBalance(){
                System.out.println("Current Balance : $%.2f%n");
        }

        public void deposit(){
               
        }
        }


        public static void main(String[] args){
                System.out.println("Successful");
        }
}
