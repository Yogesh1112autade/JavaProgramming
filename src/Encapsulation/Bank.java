package Encapsulation;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       customer c=new customer();
       c.setAccno(578567);
       c.setCusname("Yogesh");
       
       System.out.println("Costomer account no is:"+c.getAccno());
       System.out.println("Customer name is:"+c.getCusname());
	}

}
