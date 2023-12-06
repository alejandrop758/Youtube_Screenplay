package com.youtube.UI;

import com.youtube.tasks.BuscarTask;
import net.serenitybdd.screenplay.targets.Target;



public class TitulosCancionUI {

    public static Target LBL_TICANCIONES=Target.the("Titulos de canciones")
            .locatedBy("//yt-formatted-string[contains(text(),'"+ BuscarTask.getCancionSelected() +"')]");
}
