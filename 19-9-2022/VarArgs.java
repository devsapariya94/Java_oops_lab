class VarArgTest{

	public static double average(double first, double second, double... remaining){
		double total = first + second;
		for(double value : remaining)
			total += value;
		return total / (remaining.length + 2);
	}

	public static void main(String[] args){

		System.out.printf("Average = %.3f%n", average(12.3, 13.7, 11.9, 19.8, 14.1, 17.7));
	}
	public static int maximum (String SubName , int DivisionNo, int...marks){
		int max = marks[0];
		for(int num: marks){
			if (num>max){
				max=num;
			}
		}
		return max;
	}
}


public class VarArgs {
 public static void main(String[] args) {
	double avg=VarArgTest.average(10, 20, 30,40,50,60,70);
	System.out.println(avg);
	int max = VarArgTest.maximum("Maths",5,20,30,40,50);
	System.out.println(max);
 }
}

/*Create a function naming maximum which will have following prototype : int maximum(String subName, String divisionName, int... marks)
*/





