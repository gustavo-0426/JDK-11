package com.co.softworld.java11.StringMethods;

import lombok.extern.slf4j.Slf4j;
import java.util.stream.Collectors;

@Slf4j
public class App {

    void isBlank(String text) {
        log.info("isBlank...");
        log.info(text + ": " + text.isBlank());
    }

    void repeat(String text, int amount) {
        log.info("repeat...");
        log.info(text + " * " + amount + ": " + text.repeat(amount));
    }

    void toList(String text) {
        log.info("toList...");
        log.info("" + text.lines().collect(Collectors.toList()));
    }

    void stripLeading(String text) {
        log.info("stripLeading...");
        log.info(text.stripLeading());
    }

    void stripTrailing(String text) {
        log.info("stripTrailing...");
        log.info(text.stripTrailing());
    }

    void strip(String text) {
        log.info("strip...");
        log.info(text.strip());
    }

    void trim(String text) {
        log.info("trim...");
        log.info(text.trim());
    }

    public static void main(String[] args) {
        App app = new App();
        app.isBlank(" ");
        app.isBlank("text");
        app.repeat("Hi! ", 3);
        app.repeat("Google! ", 2);
        app.toList("lineOne\nlineTwo\nlineThree");
        app.toList("this\nis\na test\n");
        app.stripLeading("  text with double space at the beginning and end  ");
        app.stripLeading("  double space  ");
        app.stripTrailing("  text with double space at the beginning and end  ");
        app.stripTrailing("  double space  ");
        app.strip(" \n\t   text with double space at the beginning and end   \u2005");
        app.strip(" \n\t   double space    \u2005");
        app.trim(" \n\t   text with double space at the beginning and end   \u2005");
        app.trim(" \n\t   double space   \u2005");
    }
}
