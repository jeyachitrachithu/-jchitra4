package BankSub;

public class Bank3 extends Bank1 {
public void banNam() {
	System.out.println("icici");
	}
public void banIdd() {
	System.out.println("768");
}
public static void main(String[] args) {
	Bank3 b =new Bank3 (); 
	b.banIdd();
	b.bankId();
	b.bankName();
	b.banNam();

}
}
