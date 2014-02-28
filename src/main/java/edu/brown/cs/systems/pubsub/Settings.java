package edu.brown.cs.systems.pubsub;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Settings {

    private static final Config CONFIG = ConfigFactory.load();

    public static final String SERVER_HOSTNAME =            CONFIG.getString("pubsub.server");
    public static final int OUTGOING_MESSAGE_BUFFER_SIZE =  CONFIG.getInt("pubsub.hwm");
    public static final int CLIENT_PUBLISH_PORT =           CONFIG.getInt("pubsub.client-publish-port");
    public static final int CLIENT_SUBSCRIBE_PORT =         CONFIG.getInt("pubsub.client-subscribe-port");
}
