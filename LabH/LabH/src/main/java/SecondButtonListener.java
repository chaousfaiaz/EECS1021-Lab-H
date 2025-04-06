import org.firmata4j.IODeviceEventListener;
import org.firmata4j.IOEvent;
import org.firmata4j.Pin;
import org.firmata4j.ssd1306.SSD1306;

//some libraries of potential use!
import java.util.HashMap;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.ArrayList;

public class SecondButtonListener implements IODeviceEventListener {
    private final Pin button; //note that a FINAL attribute can't be changed once initialized
    private final SSD1306 oledDisplay; //FINAL attributes are constants!

    /**
     * Constructor.
     * @param button a Pin object referencing the BUTTON pin on the Grove
     * @param oledDisplay a SSD1306 object referencing the OLED on the Grove
     */
    SecondButtonListener(Pin button, SSD1306 oledDisplay) {
        this.button = button;
        this.oledDisplay = oledDisplay;
    }

    /**
     * Handle a "Pin Change" event.
     * In this method:
     * 1. GET the value of this.button.
     * 2. If it is 1 ... call your formatList method on an array containing the words: ``Civil", ``Electrical", ``Mechanical" and ``Software".
     *    Then write the string value returned by formatList to the OLED display.
     * 3. If it is 0 ... clear the OLED display.
     * @param event, the IO event that triggered the handler
     */
    @Override
    public void onPinChange(IOEvent event) {

        // Return right away if the event isn't from the Button.
        if (event.getPin().getIndex() != button.getIndex()) {
            return;
        }

        //WRITE YOUR CODE HERE


    }

    /**
     * Accepts a String as input and returns a String
     * that is the same as the input yet without any
     * duplicate words and with words that are separated
     * by a comma and a space.  For example if the input
     * is ``Java is fun and Java is powerful" the output
     * should read ``Java, is, fun, and, powerful".
     * @param input input String
     * @return input String minus word duplicates and with commas
     */
    public String cleanSentence(String input) {
        throw new UnsupportedOperationException(); //replace this line!
    }

    /**
     * This method should accept a String as input and
     * return a HashMap<String, Integer> object that maps
     * each word in the sentence onto the number of times
     * it appears in the sentence.
     * @return a HashMap<String, Integer> of word counts
     */
    public HashMap<String, Integer> hashSentence(String input) {
        throw new UnsupportedOperationException(); //replace this line!
    }

    /**
     * This method should accept an ArrayList of Strings as
     * input and return a String object that formats every
     * entry in the input ArrayList into a numbered list.
     * For example if the input ArrayList contains the strings
     * ``Shahin", ``Sonya" and ``Mohammed", the output String
     * should read:
     *
     *     1. Shahin
     *     2. Sonya
     *     3. Mohammed
     *
     * Remember that the character '\n' represents a newline.
     * @param list an arraylist of words
     * @return a string that is a bulleted list of the words in the input list.
     */
    String formatList(ArrayList<String> list) {
        throw new UnsupportedOperationException(); //replace this line!
    }

    /* BELOW ARE ADDITIONAL METHODS from the IODeviceEventListener interface.
    We need to declare these, but we can leave the implementation
    blank.*/
    @Override
    public void onMessageReceive(IOEvent ioEvent, String s) {

    }


    @Override
    public void onStart(IOEvent ioEvent) {

    }

    @Override
    public void onStop(IOEvent ioEvent) {

    }


}