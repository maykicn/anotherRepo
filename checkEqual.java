package lab.lab04;

public class checkEqual {

	public static void main(String[] args) {
		int [] num= {1};
		checkFirsLast(num);
	}

	public static void checkFirsLast(int[] num) {
		// TODO Auto-generated method stub
		
		
		if(num.length<=1) {
			System.out.println("not valid array");
		}else {
			if(num[0]==num[num.length-1]) {
				System.out.println("true equal");
			
		}else {
			System.out.println("false not equal");}
		}

	}

}
