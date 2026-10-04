package DesignPatterns.TemplatePattern;

public class Main {
    public static void main(String[] args) {
        PayToFriendFlow payToFriendFlow = new PayToFriendFlow();
        payToFriendFlow.send();

        PayToMerchantFlow payToMerchantFlow = new PayToMerchantFlow();
        payToMerchantFlow.send();
    }
}
