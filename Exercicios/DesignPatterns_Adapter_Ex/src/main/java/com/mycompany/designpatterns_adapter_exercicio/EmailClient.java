package com.mycompany.designpatterns_adapter_exercicio;
/**
 *
 * @author Felipe
 */
public class EmailClient {
    private EmailProvider provider;

    public EmailClient(EmailProvider provider) {
        this.provider = provider;
    }
    public void checkEmails() {
        provider.connect();
        provider.fetchEmails();
    }
}
