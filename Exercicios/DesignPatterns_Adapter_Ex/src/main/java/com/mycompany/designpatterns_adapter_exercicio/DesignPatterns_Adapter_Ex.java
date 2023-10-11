package com.mycompany.designpatterns_adapter_exercicio;
/**
 *
 * @author Felipe
 */
public class DesignPatterns_Adapter_Ex {

    public static void main(String[] args) {
        EmailProvider gmailAdapter = new GmailAdapter();
        EmailClient emailClient = new EmailClient(gmailAdapter);
        emailClient.checkEmails();
    }
}
