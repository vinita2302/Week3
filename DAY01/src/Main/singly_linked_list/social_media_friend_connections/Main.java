package Main.singly_linked_list.social_media_friend_connections;



public class Main {
    public static void main(String[] args) {
        SocialMediaSystem system = new SocialMediaSystem();

        // Adding users
        system.addUser(1, "Alice", 25);
        system.addUser(2, "Bob", 30);
        system.addUser(3, "Charlie", 28);
        system.addUser(4, "Daisy", 22);

        // Adding friend connections
        system.addFriendConnection(1, 2);
        system.addFriendConnection(1, 3);
        system.addFriendConnection(2, 3);

        // Display friends of a user
        system.displayFriends(1);

        // Find mutual friends between users
        system.findMutualFriends(1, 2);

        // Remove a friend connection
        system.removeFriendConnection(1, 2);

        // Display friends after removal
        system.displayFriends(1);

        // Count the number of friends for each user
        system.countFriends();

        // Search for a user
        system.searchUser("Alice");
        system.searchUser("Eve");
    }
}
