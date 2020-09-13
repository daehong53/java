public class Tv {
	
	boolean power;
	int channel;
	int volume;
	
	public void power(){ power = !power;}
	public void channelUp(){ channel ++ ;}
	public void channelDown(){ channel -- ;}
	public void volumeUp(){ volume ++ ;}
	public void volumeDown(){ volume -- ;}

}
