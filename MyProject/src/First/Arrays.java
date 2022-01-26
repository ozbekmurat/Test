

package First;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] students=new int[60];
//		students[3] =6000;
//				System.out.println(students[3]);
		
		int[] ap = new int[10];
				ap [0]=5;
				ap [1]=7;
				ap[2]=9;
				ap[3]=56;
		/*System.out.println(ap[0]);
		System.out.println(ap[1]);
		System.out.println(ap[2]);
		System.out.println(ap[3]);
		System.out.println(ap[4]);
		System.out.println(ap[5]);
		System.out.println(ap[6]);
		System.out.println(ap.length);*/
				/*for (int i=0; i<ap.length; i++) {
					System.out.println("ap["+i+"]="+ap[i]); }*/
				
				for(int student :ap) {
					System.out.println(student);
				         }
				int[][]	countries=new int[6][2];
				countries[0][0]=6000;
				countries[1][0]=60000;
				countries[3][1]=600;
				countries[4][1]=60;
				System.out.println(countries[3][1]);

	}

}
