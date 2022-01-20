import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messageList;


    //Parameterless constructor used to make new ArrayList
    public MessagingService() {
        this.messageList = new ArrayList<>();
    }

    // If content of massage is <280 words it'll be added into the MessageService
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.messageList.add(message);
        }
    }

    //Returns messageList
    public ArrayList<Message> getMessages(){
        return this.messageList;
    }

}
