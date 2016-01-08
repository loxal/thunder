package network.thunder.core.communication.objects.messages.impl.message.gossip;

import com.google.common.base.Preconditions;
import network.thunder.core.communication.objects.messages.interfaces.message.gossip.Gossip;
import network.thunder.core.communication.objects.messages.impl.message.gossip.objects.P2PDataObject;

import java.util.ArrayList;

/**
 * Created by matsjerratsch on 30/11/2015.
 */
public class GossipSendMessage implements Gossip {
    public ArrayList<P2PDataObject> dataObjects;

    public GossipSendMessage (ArrayList<P2PDataObject> dataObjects) {
        this.dataObjects = dataObjects;
    }

    @Override
    public void verify () {
        Preconditions.checkNotNull(dataObjects);
    }
}
