
@SuppressWarnings("serial")
public class InvalidInputException extends IllegalArgumentException {
	public InvalidInputException(String message) {
        super(message);
    }
	
}


public class BankAccount {
	private String owner;//계좌주 이름
	private int balance;//은행잔고
	
	public BankAccount() {
		this("모름", -1);
	}
	public BankAccount(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
	
	public String toString() {//잔고 현황
		String rslt = "";
		rslt += getOwner()+"\t\t"+getBalance();
			
		return rslt;
	}

	public void deposit(int m) {
		if (m > 0) 
			balance += m;
	}
	
	public void withdraw(int n) throws InvalidInputException {
		if (balance >= n) 
			balance -= n;
		
		else {
			throw new InvalidInputException("입력된 금액이 잘못되었습니다. 다시 입력하세요.\n");
		}
	}

}

import java.util.Scanner;

public class Practice_62 {
//입금과 출금 금액이 잘못된 경우 예외 발생, 처리
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BankAccount[] b = new BankAccount[3];

		for (int i = 0; i < b.length; i++) {
			b[i] = new BankAccount();
			
			System.out.print("예금주 이름을 입력하세요: ");
			String n = sc.next();
			b[i].setOwner(n);
			
			System.out.print("잔고를 입력하세요: ");
			int m = sc.nextInt();
			b[i].setBalance(m);
		}
		
		System.out.println("현재 잔고현황입니다.");
		System.out.println("계좌번호\t계좌주\t\t잔고");
		
		for (int i = 0; i < b.length; i++) {
			System.out.println((i+1)+ "\t"+ b[i].toString());			
		}	
		
		System.out.print("업데이트할 계좌번호를 입력하세요 (종료-0): ");
		int num = sc.nextInt();
		
		while (true) {
			if (num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("원하는 작업을 선택하세요 (1-입금/2-출금): ");
			int s = sc.nextInt();
			
			if (s == 1) {//입금
				System.out.print("입금액을 입력하세요: ");
				
				int in_money = 0;
				try {
					in_money = sc.nextInt();
					b[num-1].withdraw(in_money);
					System.out.println("출금이 완료되었습니다.");
				}
				catch (InvalidInputException ex){
					System.out.println(ex.getMessage());
				}
			}
			
			else if (s == 2) {//출금
				System.out.print("출금액을 입력하세요: ");
				
				int out_money = 0;
				try {
					out_money = sc.nextInt();
					b[num-1].withdraw(out_money);
					System.out.println("출금이 완료되었습니다.");
				}
				catch (InvalidInputException ex){
					System.out.println(ex.getMessage());
				}
				
				//try문 안밖 위치 잘 생각*
				/*b[num-1].withdraw(out_money);
				System.out.println("출금이 완료되었습니다.");*/
			}
			
			System.out.println("현재 잔고현황입니다.");
			System.out.println("계좌번호\t계좌주\t\t잔고");
			for (int i = 0; i < b.length; i++) {
				System.out.println((i+1)+ "\t"+ b[i].toString());			
			}	
			
			System.out.print("업데이트할 계좌번호를 입력하세요 (종료-0): ");
			num = sc.nextInt();
		}
		
		
		sc.close();
	}

}
