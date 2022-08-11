package cst8218.pike0040.json;

import java.awt.Color;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.stream.JsonParser.Event;

/**
 * Convert a color in json format to a color object.
 * @author James Pike
 */
public class JsonColorDeserializer implements JsonbDeserializer<Color> {
    /**
     * Parse the json to reconstruct a color in json to a color object.
     * @param parser json parser
     * @param ctx deserialization context
     * @param rtType reflect type
     * @return a color object
     */
    @Override
    public Color deserialize(javax.json.stream.JsonParser parser, javax.json.bind.serializer.DeserializationContext ctx, java.lang.reflect.Type rtType) {
        String keyname = ""; //name in a name/value pari of the json 
        int value = 0; //value after the keyname
        int red = 0; 
        int green = 0; 
        int blue = 0;
        
        while (parser.hasNext()) {
            Event event = parser.next();
            switch (event) {
                case KEY_NAME: {
                    keyname = parser.getString();
                    break;
                }
                case VALUE_NUMBER: {
                    value = parser.getInt();
                    if (keyname.equals("red")) red = value;
                    else if (keyname.equals("green")) green = value;
                    else if (keyname.equals("blue")) blue = value; 
                    break;
                }
            }
        } 
        return new Color(red,green,blue);
    } 
}

