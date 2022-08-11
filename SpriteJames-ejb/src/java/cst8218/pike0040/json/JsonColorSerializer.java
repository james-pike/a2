package cst8218.pike0040.json;

import java.awt.Color;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;

/**
 * Convert a color object to json format.
 * @author James Pike
 */
public class JsonColorSerializer implements JsonbSerializer<Color> {
    /**
     * Generate a json format color.
     * @param c a color object 
     * @param jg json generator 
     * @param ctx serialization context 
     */
    @Override
    public void serialize(Color c, JsonGenerator jg, SerializationContext ctx) {
        jg.writeStartObject();
        jg.write("red", c.getRed());
        jg.write("green", c.getGreen());
        jg.write("blue", c.getBlue());
        jg.writeEnd();
    }
}

