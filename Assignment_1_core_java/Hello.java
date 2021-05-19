lass ObjectDemo {
	public static void main(String[] args) {
		//boxingExample();
		//equalsOperation();
		classInfoDemo();
	}

	static void classInfoDemo(){
		Object data  = 123;
		//Know the data type....
		Class details = data.getClass();
		System.out.println("The Data type of this object is " + details.getName());
	}