import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;

import java.util.List;

public class GuildMessageReactionAdd extends ListenerAdapter {

    public void onGuildMessageReactionAdd(GuildMessageReactionAddEvent event){

        System.out.println(event.getMember().getUser());
        System.out.println(event.getJDA().getSelfUser());
        System.out.println(event.getMessageId());

        List<String> myMessages = DarkBot.getMyMessages();
        for(String s : myMessages){
            if(s.equals(event.getMessageId())){
                //delete reaction code
            }
        }

    }

}
