import net.dv8tion.jda.api.entities.Emote;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;

import java.util.List;

public class GuildMessageReactionAdd extends ListenerAdapter {

    public void onGuildMessageReactionAdd(GuildMessageReactionAddEvent event){

        //System.out.println("1. "+ event.getMember().getUser());
        //System.out.println("2. " + event.getJDA().getSelfUser());
        //System.out.println("3. " + event.getMessageId());
        //System.out.println("4. " + event.getChannel().retrieveMessageById(event.getMessageId()).complete().getAuthor().getId());

        String messageID = event.getMessageId();

        /*System.out.println("5. " + event.getReactionEmote().getEmote().getName() + ":" + event.getReactionEmote().getEmote().getId());

        System.out.println("10. " + event.getReactionEmote());
        System.out.println("11. " + event.getReaction());
        System.out.println("12. " + event.getReactionEmote().getEmote());
*/



        try{
            if(event.getChannel().retrieveMessageById(event.getMessageId()).complete().getAuthor().getId().equals("259741955372613632")){
                event.getChannel().removeReactionById(messageID, event.getReactionEmote().getEmote(), event.getMember().getUser()).queue();
            }
        }
        catch (IllegalStateException e){

        }

    }

}
