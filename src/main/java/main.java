import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import javax.security.auth.login.LoginException;

public class main {

    public static void main(String[] args) throws LoginException {

        Token tokenClass = new Token();

        String token = tokenClass.getToken();

        JDA jda = JDABuilder.createDefault(token).build();


    }
}
