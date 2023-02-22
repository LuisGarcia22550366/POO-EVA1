package eva_1_8_function;

public class FunctionCalled {

	public static void main(String[] args) {
		System.out.println("Inica el metodo main()");
		Function();
		System.out.println("Termina la funcion main()");

	}
	
	public static void Function() {
		System.out.println("Inicia Function()");
		FunctionB();
		System.out.println("Termina Function()");
	}
	
	public static void FunctionB() {
		System.out.println("Inicia FunctionB()");
		System.out.println("Termina FunctionB()");
	}

}
