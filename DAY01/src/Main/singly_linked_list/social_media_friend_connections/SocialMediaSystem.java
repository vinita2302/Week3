package Main.singly_linked_list.social_media_friend_connections;


import java.util.HashSet;



class SocialMediaSystem {
    private User head = null;

    // Add a new user
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
        System.out.println("User added: " + name);
    }

    // Search for a user by User ID
    private User findUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Search for a user by Name
    public void searchUser(String name) {
        User temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("User Found: ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No user found with the name: " + name);
        }
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friendIds.contains(userId2)) {
            user1.friendIds.add(userId2);
        }
        if (!user2.friendIds.contains(userId1)) {
            user2.friendIds.add(userId1);
        }
        System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
    }

    // Remove a friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendIds.remove(Integer.valueOf(userId2));
        user2.friendIds.remove(Integer.valueOf(userId1));
        System.out.println("Friend connection removed between " + user1.name + " and " + user2.name);
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        User user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        if (user.friendIds.isEmpty()) {
            System.out.println("No friends found.");
        } else {
            for (int friendId : user.friendIds) {
                User friend = findUserById(friendId);
                System.out.println("Friend ID: " + friendId + ", Name: " + (friend != null ? friend.name : "Unknown"));
            }
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        HashSet<Integer> mutualFriends = new HashSet<>(user1.friendIds);
        mutualFriends.retainAll(user2.friendIds);

        System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ":");
        if (mutualFriends.isEmpty()) {
            System.out.println("No mutual friends.");
        } else {
            for (int friendId : mutualFriends) {
                User friend = findUserById(friendId);
                System.out.println("Friend ID: " + friendId + ", Name: " + (friend != null ? friend.name : "Unknown"));
            }
        }
    }

    // Count the number of friends for each user
    public void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friend(s).");
            temp = temp.next;
        }
    }
}