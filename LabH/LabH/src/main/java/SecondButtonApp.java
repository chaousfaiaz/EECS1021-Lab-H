import org.firmata4j.IODevice;
import org.firmata4j.Pin;
import org.firmata4j.firmata.FirmataDevice;
import org.firmata4j.ssd1306.SSD1306;
import org.firmata4j.I2CDevice;

import java.io.IOException;

public class SecondButtonApp {

    private final String myPort = "/dev/cu.SLAB_USBtoUART"; // modify for your own computer & setup.
    private IODevice myGroveBoard;
    private SSD1306 theOledObject;

    /**
     * Constructor for a SecondButtonApp.  In the constructor you must
     * 1. Initialize a Pin object with the value of pin 6 (the button)
     * 2. Set the mode of the button pin to Pin.Mode.INPUT.
     * 3. Create a theSecondButtonListener and add it an event listener on the grove board using the method addEventListener.
     */
    public SecondButtonApp() {

        this.myGroveBoard = new FirmataDevice(this.myPort);

        try {
            this.myGroveBoard.start(); // start communication with board;
            this.myGroveBoard.ensureInitializationIsDone();
            System.out.println("Board started."); //hopefully we make it here.

            // Initialize the OLED (SSD1306) object
            I2CDevice i2cObject = this.myGroveBoard.getI2CDevice((byte) 0x3C); // Use 0x3C for the Grove OLED
            this.theOledObject = new SSD1306(i2cObject, SSD1306.Size.SSD1306_128_64); // 128x64 OLED SSD1515
            this.theOledObject.init();
        } catch (Exception ex) { // if not, detail the error.
            System.out.println("couldn't connect to board.");
            return; //no point continuing at this point.
        }

        //START YOUR CODE HERE



        //END YOUR CODE HERE

        try {
            Thread.sleep(20000);
            this.myGroveBoard.stop();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Stop the Board
     * @throws IOException
     */
    private void stopApp() throws IOException {
        this.myGroveBoard.stop();
    }

    public static void main(String[] args) {
        //test your app with this line!
        SecondButtonApp x = new SecondButtonApp();
    }

}