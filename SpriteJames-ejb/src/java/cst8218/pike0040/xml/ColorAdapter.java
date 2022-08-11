package cst8218.pike0040.xml;

import java.awt.Color;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * This class is for converting a color in xml format to a color object.
 * @author James Pike
 */
public class ColorAdapter extends XmlAdapter<ColorAdapter.ColorValueType, Color> {
    /**
     * Convert a ColorValueType object to a color object.
     * @param v a ColorValueType object
     * @return a color object
     * @throws Exception if there is an error during the conversion to color object
     */
    @Override
    public Color unmarshal(ColorValueType v) throws Exception {
        return new Color(v.red, v.green, v.blue);
    }
    
    /**
     * Convert a color object to a ColorValueType object
     * @param v a color
     * @return a ColorValueType object
     * @throws Exception if there is an error during the conversion to ColorValueType
     */
    @Override
    public ColorValueType marshal(Color v) throws Exception {
        return new ColorValueType(v.getRed(), v.getGreen(), v.getBlue());
    }
    
    /**
     * This class is for getting color values from xml.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ColorValueType {
        private int red;
        private int green;
        private int blue;
        
        /**
         * Default constructor
         */
        public ColorValueType() {
        }
        
        /**
         * Initial constructor
         * @param red red color value
         * @param green green color value
         * @param blue blue color value
         */
        public ColorValueType(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
    }
}
