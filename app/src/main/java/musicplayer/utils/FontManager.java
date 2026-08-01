package musicplayer.utils;

import java.awt.Font;

import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class FontManager {

    private static Font regular;
    private static Font medium;
    private static Font semiBold;
    private static Font bold;
    private static Font light;


    private static Font loadFont(String path) {
    try {
        InputStream is = FontManager.class.getResourceAsStream(path);

        if (is == null) {
            throw new RuntimeException("Font not found: " + path);
        }

        return Font.createFont(Font.TRUETYPE_FONT, is);

    } catch (FontFormatException | IOException e) {
        throw new RuntimeException(e);
    }
  }

  static {

    regular = loadFont("/assets/fonts/Inter-Regular.ttf");

    medium = loadFont("/assets/fonts/Inter-Medium.ttf");

    semiBold = loadFont("/assets/fonts/Inter-SemiBold.ttf");

    bold = loadFont("/assets/fonts/Inter-Bold.ttf");

    light = loadFont("/assets/fonts/Inter-Light.ttf");

   }

   public static Font regular(float size) {
    return regular.deriveFont(size);
   }

    public static Font medium(float size) {
    return medium.deriveFont(size);
    }

    public static Font semiBold(float size) {
    return semiBold.deriveFont(size);
    }

    public static Font bold(float size) {
    return bold.deriveFont(size);
    }

    public static Font light(float size) {
    return light.deriveFont(size);
    }
    




}