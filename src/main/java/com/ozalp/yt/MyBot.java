package com.ozalp.yt;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;

public class MyBot extends TelegramLongPollingBot {
    TelegramBot telegramBot = new TelegramBot("6383677695:AAHBvYLMiT6jMIR5IehZNeCdtm4fD0he9bw");

    @Override
    public void onUpdateReceived(Update update) {
        // String message = update.getMessage().getChat().getFirstName();
        // System.out.println(message);

        // String message = update.getMessage().getText();
        // System.out.println(message);
        // System.out.println(update.getMessage().getChat());

        System.out.println(update.getMessage().getText());

        Long myId = (long) 812672293;
        Long chatId = update.getMessage().getChatId();
        String name = update.getMessage().getChat().getUserName();

        SendMessage sendMessage = new SendMessage(chatId, "seni kırmışlar yarim");
        try {
            telegramBot.execute(sendMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getBotUsername() {
        // TODO Auto-generated method stub
        return "ozalpYoutube_bot";
    }

    public String getBotToken() {
        return "6383677695:AAHBvYLMiT6jMIR5IehZNeCdtm4fD0he9bw";
    }

}
