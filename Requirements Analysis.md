# Description:
We will create an application for transfering files over the internet. The application will establish adn peer-to-peer connection between two users and allow them to transfer files between them protecting the informations stored in the files from possible attackers. 

The major components of the application will be:
- The NTRU cryptosystem
- The AES cryptosystem
- The desktop application 


# Interests

# Actors and Objectives
### Objectives
- NTRU cryptosystem: encrypt the symetric key
- The AES cryptosystem: encrypt the infromation stored in the file
- The application: establish the comunication between users and allow them to send files to each other in a secure way	

  
### Actors
	
- The application: will make use of the two cryptosystems to help the users exchange files in a sercure way
- human users: people who want to send files in a secure way

# Use case scenarios:

### The user sends a file to a different user

#### Objective/Context
The user obtains the ip and port of the other user.
	
#### Steps
1) The User1 sets the ip and the port of the other user.
2) The User1 clicks the establish connection button.
3) The User2 accepts or declines the connection.
4) The User1 waits for a response from User2 if the connection is established succesfully then he may procede to the next step otherwise he goes back to step 1 or 2.
5) The User1 chooses the file or the files that he wants to send on the other user.
6) The User1 presses the send button.
7) The encrypted file or files are sent to the User2.
8) The User2 can accepts or declines the files sent. If he accepts he the chooses a place to store the files on the local machine.
9) The users may close the connection or reuse it to send aditional files.

	
####  Extensions
- The connection is not established succesfully because of the other user declining the connection the user is shown a warning message.
- The file or files are not sent to the other user because of the other user declining the recieving of the files -> the user is shown a error message.
- The file or files are not sent to the other user due to some connection errors -> the user is shown a error message.
