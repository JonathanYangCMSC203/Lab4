/**
 * This class will set and get the Manufacturer, set and get screen size of a tv, set and get the channel chosen, power on and off the television, 
 * change the volume of the television, 
 * @author yangj
 *
 */
public class Television {
	//fields
	private final String MANUFACTURER;//the brand of the tv
	private final int SCREEN_SIZE;//the screensize of the tv
	private int channel;//the channel of the tv
	private int volume;//the volume of the tv
	private boolean powerOn;//this variable determines if the tv is on.
	
	/**
	 * Constructor method of the television.
	 * MANUFACTUERER is the brand of the television.
	 * SCREEN_SIZE is the size of the screen of the television.
	 * volume is the noise level of the television.
	 * powerOn is if the television is off or on.
	 * channel is what the channel is set to.
	 * @param brand is the brand of the television
	 * @param size is the size of the screen
	 */
	public Television(String brand, int size) {
		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
		volume = 20;
		powerOn = false;
		channel = 2;
	}
	/**
	 * This mutator method lets the user sets the channel.
	 * @param station is the channel the user wish to set 
	 */
	public void setChannel(int station) {
		this.channel = station;
	}
	/**
	 * This method turns the television on or off.
	 */
	public void power(){
		if(!powerOn)
			powerOn = true;
		else
			powerOn = false;
	}
	/**
	 * This method increases the volume of the television
	 */
	public void increaseVolume() {
		volume++;
	}
	/**
	 * This method decreases the volume of the television. However, it can't go below 0.
	 */
	public void decreaseVolume() {
		if(volume > 0)
			volume--;
	}
	/**
	 * This accessor method gets the channel.
	 * @return the channel of the television.
	 */
	public int getChannel() {
		return channel;
	}
	/**
	 * Accessor method that gets the volume value
	 * @return volume
	 */
	public int getVolume() {
		return volume;
	}
	/**
	 * accessor method that gets the manufacturer
	 * @return manufacturer
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	/**
	 * accessor method that gets the screen size
	 * @return size of screen
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
}
