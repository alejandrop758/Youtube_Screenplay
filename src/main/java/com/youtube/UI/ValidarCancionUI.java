package com.youtube.UI;

import net.serenitybdd.screenplay.targets.Target;

public class ValidarCancionUI {
    public static Target LBL_SELECTCANCION=Target.the("cancion seleccionada")
            .locatedBy("//*[@id='title']/h1/yt-formatted-string");
}
