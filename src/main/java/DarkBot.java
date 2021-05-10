import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class DarkBot extends ListenerAdapter {

    //public static String myID = new String("259741955372613632");
    int myHash = -1529165330;
    public static JDA jda;

    public static void main(String[] args) throws LoginException {

        Token tokenClass = new Token();

        String token = tokenClass.getToken();

        jda = JDABuilder.createDefault(token).build();

        jda.addEventListener(new DarkBot());

    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event){

        String message = event.getMessage().getContentRaw();
        //String authorID = event.getAuthor().getId();
        int hash = event.getAuthor().hashCode();

        System.out.println(hash + ", " + message);
        //System.out.println(myID);
        System.out.println(hash);

        if(hash == myHash){
            System.out.println("Hello Boss!");

        }

        //event.getMessage().getReactions().remoe



    }
}
