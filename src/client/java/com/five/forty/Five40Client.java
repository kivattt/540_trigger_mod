package com.five.forty;

import com.fox2code.foxloader.loader.ClientMod;

import java.time.LocalDateTime;

public class Five40Client extends Five40 implements ClientMod {
    LocalDateTime now;
    boolean alreadyTriggered = false;

    @Override
    public void onTick() {
        now = LocalDateTime.now();

        boolean is540 = now.getHour() == 5 && now.getMinute() == 40;
        if (!alreadyTriggered && is540){
            ClientMod.getGameInstance().thePlayer.displayChatMessage("its 5:40");
            alreadyTriggered = true;
        } else if (!is540){
            alreadyTriggered = false;
        }
    }
}
