package Ejercicio06_variables_args;

public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operaciones op = new operaciones();
		System.out.println("Pr1: "+op.getPromedio(15,18,15.5,19));
		System.out.println("Pr2: "+op.getPromedio(14.5,18,19));
		System.out.println("Pr3: "+op.getPromedio(15,18));
		System.out.println("Pr4: "+op.getPromedio(15,18,15.5,19,15.14,18,17,16,20,18,19.25));

		double [] notas = {15,16.25,18};
		System.out.println("Pr5:" +op.getPromedio(notas));

		System.out.println("Suma: "+op.getSuma(notas));
		double [] nums = new double[5];
		nums[0] =15.25;
		nums[1] =10.25;
		nums[2] =18.25;
		nums[3] =17.25;
		nums[4] =15.25;

		System.out.println("suma "+op.getSuma(nums));
		System.out.println("Pr6:"+op.getPromedio(nums));
	
	}

}
