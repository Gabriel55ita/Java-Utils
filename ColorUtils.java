import java.awt.*;

public class ColorUtils {

    /**
     * Converts hex color value to RGB
     * @param hex string (including the #)
     * @return RGB value from the hex
     */
    public static Color hexToRGB(String hex) {
        return new Color(
                Integer.valueOf(hex.substring(1, 3), 16),
                Integer.valueOf(hex.substring(3, 5), 16),
                Integer.valueOf(hex.substring(5, 7), 16)
        );
    }

    /**
     * Converts RGB color value to hex
     * @param color
     * @return hex string
     *
     * Found on Stackoverflow a while ago
     */
    public static String rgbToHex(Color color) {
        String hex = String.format("#%06x", Integer.valueOf(color.getRGB() & 0x00FFFFFF));
        return hex;
    }

    /**
     * @return cool Rainbow animated color (i used this in mc)
     */
    public static int getRainbow() {
        final long time = System.currentTimeMillis();
        return Color.HSBtoRGB(time % 2000L / 2000.0f, 0.8f, 0.8f);
    }
}
