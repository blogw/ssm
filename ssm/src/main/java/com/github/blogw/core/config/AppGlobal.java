package com.github.blogw.core.config;

import com.github.blogw.core.spring.SpringContextUtils;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import static org.fusesource.jansi.Ansi.Attribute.INTENSITY_BOLD;
import static org.fusesource.jansi.Ansi.Attribute.INTENSITY_FAINT;
import static org.fusesource.jansi.Ansi.Color.*;
import static org.fusesource.jansi.Ansi.ansi;

/**
 * AppConfig
 * Created by blogw on 2017/04/13.
 */
public class AppGlobal {
    public static void printWelcome() {
        System.out.println(ansi().eraseScreen().fgBright(BLUE).a(INTENSITY_BOLD).a("---------------------------------------------------------------------------------------------------").reset());
        System.out.println(ansi().eraseScreen().bgDefault().fgBrightCyan()
                .a("  ___   ___   _ __ ___             __ _   _ __    ___  | |__     ___  | |_   _   _   _ __     ___ \n")
                .a(" / __| / __| | '_ ` _ \\   _____   / _` | | '__|  / __| | '_ \\   / _ \\ | __| | | | | | '_ \\   / _ \\\n")
                .a(" \\__ \\ \\__ \\ | | | | | | |_____| | (_| | | |    | (__  | | | | |  __/ | |_  | |_| | | |_) | |  __/\n")
                .a(" |___/ |___/ |_| |_| |_|          \\__,_| |_|     \\___| |_| |_|  \\___|  \\__|  \\__, | | .__/   \\___|\n")
                .a("                                                                             |___/  |_|           ").reset());
        System.out.print(ansi().eraseScreen().a("          ").bg(BLUE).fgBright(WHITE).a(INTENSITY_FAINT).a(" ").a("Welcome to use ssm-archetype !").a(" ").reset());
        System.out.println(ansi().eraseScreen().a("         ").fg(CYAN).a("https://github.com/blogw/ssm-archetype").reset());
        System.out.println(ansi().eraseScreen().fgBright(BLUE).a(INTENSITY_BOLD).a("---------------------------------------------------------------------------------------------------").reset());
    }


    public static void formatJson(boolean b) {
        MappingJackson2HttpMessageConverter jsonConverter = SpringContextUtils.getBean(MappingJackson2HttpMessageConverter.class);
        jsonConverter.setPrettyPrint(b);
    }
}