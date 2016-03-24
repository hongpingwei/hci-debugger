package fr.bmartel.bluetooth.hcidebugger.model;

import java.util.Date;

/**
 * @author Bertrand Martel
 */
public class PacketHciScoData extends Packet {

    public PacketHciScoData(int num, Date timestamp, PacketDest dest, ValuePair type, String jsonFormattedHciPacket, String jsonFormattedSnoopPacket) {
        super(num, timestamp, dest, type, jsonFormattedHciPacket, jsonFormattedSnoopPacket);
    }

    @Override
    public String getDisplayedInfo() {
        return "";
    }
}
