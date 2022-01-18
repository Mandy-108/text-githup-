class Test{

	
	public static void test(){
		System.out.println("父类test方法");
	}
	
	static void test(String i, int y){
		System.out.println("父类test方法-string" + i + y);
	} 
	
	protected static void test(String i){
		System.out.println("父类test方法-string" + i);
	} 
	
	private static void test(int i){
		System.out.println("父类test方法-int" + i);
	} 
	

}