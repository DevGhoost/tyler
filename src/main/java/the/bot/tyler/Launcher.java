package the.bot.tyler;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import the.bot.tyler.commands.minecraft.McHead;
import the.bot.tyler.commands.minecraft.McServerIcon;
import the.bot.tyler.commands.minecraft.McServerStatus;

import javax.security.auth.login.LoginException;

public class Launcher {

    public static String prefix = "$";
    public static JDA jda;


    public static void main(String[] args) {
        try {
           jda = new JDABuilder(AccountType.BOT).setToken("NDkzOTE1NDMyMjY1MTg3MzM1.Dor6pw.VXF-8qPIG23xhW7m4-W_1ewgexk").build();
        } catch (LoginException e) {
            e.printStackTrace();
        }

        jda.addEventListener(new McHead());
        jda.addEventListener(new McServerIcon());
        jda.addEventListener(new McServerStatus());


    }


}
