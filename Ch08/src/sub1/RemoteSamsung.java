package sub1;

public class RemoteSamsung implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("Samaung powerOn...");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Samaung powerOff...");
		
	}

	@Override
	public void chUp() {
		System.out.println("Samaung chUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("Samaung chDown...");
		
	}

	@Override
	public void soundUp() {
		System.out.println("Samaung soundUp...");
		
	}

	@Override
	public void soundDown() {
		System.out.println("Samaung soundDown...");
		
	}

}
