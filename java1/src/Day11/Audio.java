package Day11;

public class Audio implements Remote {
	
	int sound = 0;
	
	@Override
	public void ����() {
		// TODO Auto-generated method stub
		System.out.println("����� ����");
	}

	@Override
	public void ����() {
		// TODO Auto-generated method stub
		System.out.println("����� ����");
	}

	@Override
	public void ���弳��(int sound) {
		// TODO Auto-generated method stub
		if(sound>Remote.max) {
			this.sound = Remote.max;
		}else if(sound<Remote.min) {
			this.sound = Remote.min;
		}else {
			this.sound=sound;
		}
		
		System.out.println("���� ���� ũ�� : "+this.sound);
	}
	 
}
