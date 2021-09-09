package org.cloudbus.cloudsim.examples;

import org.cloudbus.cloudsim.User;
import java.util.ArrayList;

public class SocialNetworkExample {
	
	
	public static void main(String args [])
	{
		User alice = new User("alice", 1);
		User bob = new User("bob", 2);
		User charlie = new User("charlie", 3);
		User diana = new User("diana", 4);
		User edward = new User("edward", 5);
		
		 ArrayList<User> full_user_list = new ArrayList<User>();
		 full_user_list.add(alice);
		 full_user_list.add(bob);
		 full_user_list.add(charlie);
		 full_user_list.add(diana);
		 full_user_list.add(edward);
		
		alice.make_friend(bob);
		alice.make_friend(charlie);
		charlie.make_friend(diana);
		charlie.make_friend(edward);
		alice.make_friend(edward);
		
		alice.update_network(full_user_list);
		alice.print_adjacency_list();
	}
	

}
