
//Week3 day2 assignment
package Week3Day2;

public abstract class ConcreteClass implements DatabseConnection{
	
	

	@Override
	public void connect() {
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		System.out.println("DisConnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("ExecuteUpdate");
		
		
	}

	public static void main(String[] args) {
		
	
	}

}
