package converter;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 * This class is for converting a color object to a hex color code and converting a hex color code string to a color object.
 * @author James Pike
 */
//@FacesConverter(forClass=Color.class)
@FacesConverter("colorconverter")
public class ColorConverter implements Converter {

    private static final String HEX_COLOR_CODE_PATTERN = "^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$";
 
    private static final Pattern pattern = Pattern.compile(HEX_COLOR_CODE_PATTERN);

    /**
     * Check whether a string is hex color code or not.
     * @param hexCode a hex color code
     * @return true if the string is hex color code otherwise return false
     */
    public static boolean isValid(final String hexCode) {
        Matcher matcher = pattern.matcher(hexCode);
        return matcher.matches();
    }
    /**
     * Convert a hex color code string to a color object.
     * @param fc faces context
     * @param uic ui component
     * @param string a hex color code
     * @return a color object
     */
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if(string==null) return null;
        if(isValid(string)==false){
            FacesMessage errMsg = new FacesMessage("must be hex color code");
            throw new ConverterException(errMsg);
        }
        return new Color(Integer.parseInt(string.substring(1,3),16),  //red
                         Integer.parseInt(string.substring(3,5),16),  //green
                         Integer.parseInt(string.substring(5,7),16)); //blue
    }

    /**
     * Convert a color object to a string of hex color code. 
     * @param fc faces context
     * @param uic ui component
     * @param t a color object
     * @return a hex color code string if it is color object otherwise return illegal argument exception
     */
    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        if(t==null) return null;
        if(t instanceof Color){
            return String.format("#%02X%02X%02X",
                       ((Color)t).getRed(),
                       ((Color)t).getGreen(),
                       ((Color)t).getBlue());
        }
        else{
            throw new IllegalArgumentException("error in color object");
        }
    }    
}
