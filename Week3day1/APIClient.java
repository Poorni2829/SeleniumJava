//Assignment 3

package Week3day1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Sending request to: " + endpoint);
		
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Sending request to: " + endpoint);
        System.out.println("Request Body: " + requestBody);
		
	
	
		if (requestStatus == true) {  

            System.out.println("Request was successful.");
        } else {
            System.out.println("Request failed.");
        }
		
		
	}

	public static void main(String[] args) {
	
		APIClient  Ap = new APIClient();
		
		Ap.sendRequest("Sending successfully");
		
		Ap.sendRequest("Sending successfully", "Requested Successfully", true);

	}

}
