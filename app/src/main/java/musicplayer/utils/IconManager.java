package musicplayer.utils;

import com.formdev.flatlaf.extras.FlatSVGIcon;


public class IconManager {

    //implemented a get function which we call only when we need it and pass the iconname and size parameters
    public static FlatSVGIcon get(String iconName , int size){

        return new FlatSVGIcon("assets/icons/"+iconName+".svg",size,size);

    }
    
}
