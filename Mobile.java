package week1;

public class Mobile {

					
			String mobileModel = "Nokia";
			int mobileWeight = 150;
			Boolean isFullCharge = true;
			double mobileCost = 23456.7659;
			
			public void makeCall() {
				System.out.println("Call Connected");
			}
			
			public void sendMsg() {
				System.out.println("Message Sent");

			}

			public static void main(String[] args) {
				Mobile phone = new Mobile();
				
				phone.makeCall();
				phone.sendMsg();
				
				System.out.println(phone.mobileModel);
				System.out.println(phone.mobileWeight);
				System.out.println(phone.isFullCharge);
				System.out.println(phone.mobileCost);
			}
		
}
