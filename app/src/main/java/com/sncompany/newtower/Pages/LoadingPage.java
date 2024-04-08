package com.sncompany.newtower.Pages;

import com.sncompany.newtower.GameRenderer;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NewTower;

public class LoadingPage extends TPage {

    public LoadingPage(TPage par) { //Highly WIP Page
        super(par);
        GameRenderer.loadCount_GAME_MENU_IMAGE_LOAD = 0;
        GameThread.gameStatus = 5;
        GameThread.gameLoadFlag = 0;
        GameThread.loadingStatus = 1006;
        parent.load();
        NewTower.switchPage(par);
    }
}
