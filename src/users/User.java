package users;

import exceptions.ContactAlreadyExistsException;
import exceptions.ContactDoesNotExistException;

public interface User extends UserGetters {
	
	/**
	 * Adds a new contact.
	 * @param contact New contact.
	 */
	void addContact(User contact) throws ContactAlreadyExistsException;
	
	/**
	 * Removes an existing contact.
	 * @param contact Contact to remove.
	 */
  void removeContact(User contact) throws ContactDoesNotExistException;
  
  /**
   * @param contact Contact to check for.
   * @return Return true if the specified contact exists, false if otherwise.
   */
  boolean hasContact(User contact);
	
}
