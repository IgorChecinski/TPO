import java.io.Serializable;

public class EchoResponse implements Serializable {
    private String echoedMessage;

    public EchoResponse(String echoedMessage) {
        this.echoedMessage = echoedMessage;
    }

    public String getEchoedMessage() {
        return echoedMessage;
    }

    public void setEchoedMessage(String echoedMessage) {
        this.echoedMessage = echoedMessage;
    }
}
