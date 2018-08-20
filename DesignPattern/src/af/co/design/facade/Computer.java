package af.co.design.facade;

import af.co.design.utils.Log;

/**
 * 外观模式
 * @author ZhangPeng-PC
 *
 */
public class Computer implements IWork {
	private Cpu cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer(){
		cpu = new Cpu();
		memory = new Memory();
		disk = new Disk();
	}
	
	@Override
	public void startUp() {
		// TODO Auto-generated method stub
		Log.d("Start the computer");
		cpu.startUp();
		memory.startUp();
		disk.startUp();
		Log.d("Start the computer complete");
	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub
		Log.d("Shutdown the computer");
		cpu.shutDown();
		memory.shutDown();
		disk.shutDown();
		Log.d("Shutdown the computer complete");
	}

}
