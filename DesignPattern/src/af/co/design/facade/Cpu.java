package af.co.design.facade;

import af.co.design.utils.Log;

public class Cpu implements IWork {
	@Override
	public void startUp() {
		Log.d("CPU startup");
	}

	@Override
	public void shutDown() {
		Log.d("CPU shutdown");
	}
}
