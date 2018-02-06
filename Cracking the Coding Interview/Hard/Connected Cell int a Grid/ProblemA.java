public class ProblemA{
	public static void main(String [] args){
		Scanner input = new Scanner();
		int fbear = input.nextInt();
		int mbear = input.nextInt();
		int sbear = input.nextInt();
		int masha = input.nextInt();
		
		int scar = 0;
		int mcar = 0;
		int fcar = 0;
		
		if(masha<=sbear){
			scar = sbear;
			mcar = mbear;
			fcar = fbear;
			System.out.println(fcar);
			System.out.println(mcar);
			System.out.println(scar);
		}
		else{
			System.out.pritnln(-1);
		}
	}
}
		
			
			
		
		

		