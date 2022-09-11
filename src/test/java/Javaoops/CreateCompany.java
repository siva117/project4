package Javaoops;

public class CreateCompany extends Abstractcreatecompany implements Intrf1,Intrf2 {

	
	
	 int u=10;
	 
	public CreateCompany(int t, int r) {
		super(t, r);
		
	}
	public  CreateCompany(int t,int r,int y) {
		super(t,r,y);
	}
	


	
	public void m1() {

		System.out.println("i am in m1");
		System.out.println(u);
		u=20;
		System.out.println(u);
	}

	
	  public void m() {
		// TODO Auto-generated method stub
		System.out.println("i am in m");
	}

	@Override
	   public void m3() {
		// TODO Auto-generated method stub
		System.out.println("i am in m3");
	}

	
	   public void m4() {
		System.out.println("i am in m4");
	}


	    public void m6() {
	    		
		
		
	}

	
	    public void m7() {
		
		
	}


	    public void m8() {
		
		
	}

	
	    public void m2() {
		
		 
	}
		@Override
		public void m17(int e, int f) {
			int res=e+f;
			
			System.out.println(res);
			
		}

	
	
	
}
