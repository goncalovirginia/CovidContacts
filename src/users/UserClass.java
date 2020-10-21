package users;

import comparators.UserComparator;
import dataStructures.*;
import exceptions.ContactAlreadyExistsException;
import exceptions.ContactDoesNotExistException;
import groups.Group;

public class UserClass implements User {
	
	/* Constants */
	private static final int MAX_GROUPS = 10;
	
	/* Variables */
	private String login, username, location, profession;
	private int age, numJoinedGroups;
	private List<Group> joinedGroups;
	private OrderedList<User> contacts;
	
	/**
	 * Constructor.
	 * @param login Users' login.
	 * @param username Users' username.
	 * @param age Users' age.
	 * @param location Users' location.
	 * @param profession Users' profession.
	 */
	public UserClass(String login, String username, int age, String location, String profession) {
		this.login = login;
		this.username = username;
		this.age = age;
		this.location = location;
		this.profession = profession;
		joinedGroups = new DoublyLinkedList<>();
		contacts = new OrderedDoublyLinkedList<>(new UserComparator());
	}
	
	@Override
	public String getLogin() {
		return login;
	}
	
	@Override
	public String getUsername() {
		return username;
	}
	
	@Override
	public String getLocation() {
		return location;
	}
	
	@Override
	public String getProfession() {
		return profession;
	}
	
	@Override
	public int getAge() {
		return age;
	}
	
	@Override
	public void addContact(User contact) throws ContactAlreadyExistsException {
		if (contacts.find(contact) == -1) {
			throw new ContactAlreadyExistsException();
		}
		contacts.insert(contact);
	}
	
	@Override
	public void removeContact(User contact) {
		contacts.
	}
	
	@Override
	public Iterator<User> listContacts() {
		return null; //TODO
	}
	
}
