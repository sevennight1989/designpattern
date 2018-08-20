package af.co.design.facade;

import af.co.design.utils.Log;

public class Disk implements IWork {

	@Override
	public void startUp() {
		// TODO Auto-generated method stub
		Log.d("Disk startUp");
	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub
		Log.d("Disk shutDown");
	}

}
