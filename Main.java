package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        // Bilgi mesajı
        logger.info("Bu bir bilgi mesajıdır.");

        // Hata mesajı
        logger.error("Bu bir hata mesajıdır.");
        }
    }
