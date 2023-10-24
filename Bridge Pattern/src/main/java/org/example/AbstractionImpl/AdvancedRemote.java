package org.example.AbstractionImpl;

import org.example.Implementor.Deceive;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Deceive device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
