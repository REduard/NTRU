# Description:
We will create an application for allowing two users to communicate in a secure way. The application will establish an connection between two users and allow them to exchange messages, protecting the information from possible attackers. 

The major components of the application will be:
- The NTRU cryptosystem component
- The comunication component
- The application interface 


# Interests

# Actors and Objectives
### Objectives
- NTRU cryptosystem: encrypt the messages
- The comunication component: delivers the message to the other user
- The interface: allow the user to interact with the application 	

  
### Actors
	
- The application: will make use of the NTRU cryptosystem to help the users exchange messages in a sercure way with another user
- human users: people who want to exchange secret information betweeen them.

# Use case scenarios:

### The user establishes a connection with a different user

#### Objective/Context
The user obtains the ip and port of the other user and establishes a connection with him.
	
#### Steps
1) User2 give to user1 the ip and port at which he can establish a connection.
2) User1 sets the ip and the port of the other user.
3) User1 clicks the "establish connection" button.
4) User2 recieves a connection request.
5) User2 can accept or decline the connection.
6) If user2 accepts the connection request then the connection is established

####  Extensions
- The connection is not established succesfully because of the user2 declining the connection -> user1 recieves a warnning message "Failed to establish connection" with the reason "The other user refused the connection." 
- The connection is not established succesfully because of a network problem -> user1 recieves a error message "Failed to establish connection" with the reason "An network error has occure, please check your internet connection"

### The user send a message to the other user

#### Objective/Context
The user has established a connection and send a private message to the other user
	
#### Steps
1) User1 types the message he want to send to user2.
2) User1 presses the "send" button.
3) User2 receives the message.
4) User1 receives a confirmation of message delivery.

	
####  Extensions
- The message is not sent due to a connection problem user1 recieves a warnning message "Failed to send message" with the reason "An network error has occure while sending the message. Please check your internet connection and try again."

### The user end the connection

#### Objective/Context
The user has established a connection, has finished communication with the other user and closes the connection
	
#### Steps
1) User1 presses the "close connection" button.
2) User2 receives a warning with the message "The connection has been closed" and reason "The other user has closed the connection."



