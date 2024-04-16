package org.example;

import java.util.Iterator;
import java.util.List;



public class MainSystem {
    private static final ChatServer chatServer = new ChatServer();

    public static void main(String[] args) {
        //creating 4 users and adding them to system
        User user1 = new User("Naruto", chatServer);
        User user2 = new User("Jiraiya", chatServer);
        User user3 = new User("Minato", chatServer);
        User user4 = new User("Kakashi", chatServer);
        System.out.println("\n===== User's Created =====");


        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(user1, List.of(user2), "Hey, Jiraiya! What book are we reading today?"));
        chatServer.sendMessage(new Message(user4, List.of(user2), "Hi Jiraiya, How is your training going?!"));
        chatServer.sendMessage(new Message(user2, List.of(user4), "Hey Kakashi, Thanks for asking, but Naruto is doing way better than i expected. "));
        chatServer.sendMessage(new Message(user4, List.of(user1), "Naruto, Thanks for not asking me how i am doing. "));
        chatServer.sendMessage(new Message(user1, List.of(user3), "Hi Minato, Will you be continuing your training or not!"));
        chatServer.sendMessage(new Message(user1, List.of(user4), "I'm so sorry Kakashi, what do you want to do? "));
        chatServer.sendMessage(new Message(user3, List.of(user1), "Hello, Naruto, I will be conyinuing my training."));
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("\n===== Demonstrating block function =====");
        user2.blockerUsers(user1);
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(user1, List.of(user2, user3), "Minato, I want to go to demon land today"));
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(user3, List.of(user1), "Why demon land, Naruto?"));
        System.out.println("----------------------------------");
        System.out.println("\n===== Demonstrating unsent function =====");
        System.out.println("Minato unsent last message");
        chatServer.undoLastMessage(user3);
        System.out.printf("Now, Minato last message is '%s'\n", user3.getChatHistory().getLastSentMessages());
        System.out.println("----------------------------------");
        System.out.println("\n===== Demonstrating unsent function =====");
        System.out.println("Jiraiya unsent last message:");
        chatServer.undoLastMessage(user2);
        System.out.println("----------------------------------");
        // Trying iterating over all messages in user3's chat history
        System.out.println("Iterating over all messages in Minato chat history:");
        Iterator<Message> allMessagesIterator = user3.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.printf("------------------------------------\n");
        // Trying iterating over all messages in user1's chat history
        System.out.println("Iterating over all messages in Naruto chat history:");
        allMessagesIterator = user1.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.printf("------------------------------------\n");
        // Trying iterating over all messages in user4's chat history
        System.out.println("Iterating over all messages in Kakashi chat history:");
        allMessagesIterator = user4.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.printf("------------------------------------\n");
        chatServer.unregisterUser(user1);
        chatServer.sendMessage(new Message(user3, List.of(user1), "Because I want to do traning there."));
    }
}
