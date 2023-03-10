# HotelManagement Project work logs

### Feburary 6

Patrick: Started inital version of RoomManagement, created classes and some basic functionality.

Devesh : Created seperate folders for model , view and controller design pattern. Started development on GUI.

Team Meeting: Discussion of what needs to be done, and what type of GUI will be used.

### February 7

Devesh: Created a MainMenu class and laid out some button components. TODO: Create seperate classes for a default window and finish main menu window.

### February 8

Devesh: Created a RoomScreen, CustomerScreen and RequestScreen class. Each are seperate windows for displaying options for the user. Added buttons and did some basic ui design as well.

Patrick: Worked on search functionality, created builder class and intuitive method chain search

Arian: Set up wiki page and completed partial write up

### February 9

Arian: Placed down set up for controller, and completed the `Request` page. Added small coupling between `Booking` and `Requests` to deal with requests and get room detail through connection.

Patrick: Worked on `Person` search functionality.

Devesh: Worked on `Room` and `Request` package. `Customer` was dropped and the features were moved seperately into room and request.

Temi: Created instances for person(testing purposes).

Team Meeting: Discussion of redesign on GUI to better suit iteration 1 requirements. Bit of redesign of model to views were discussed as there was initially a customers page that was not outlined in iteration 0.

### February 10

Arian: Finished up the wiki page and added images.

Devesh: Completed the `View` package. GUI is done for itr1.

Temi: Set up controller classes for the GUI.

### March 6
Assigned tasks:
- Patrick: Items in storage inventory: As a manager, I want to view the list of items in storage.
- Temi: Increase/Decrease Inventories: As a receptionist, I need to increase or decrease inventories if things get restocked or need to be restocked
- Vesh: Items -> Room inventory, "As a receptionist I need to view the list of items in each room"
- Edward:  Max per item in room inventory. "As a caretaker, I need to know how much of each item I should resupply/supply in each room"



### March 9
Temi: Made some adjustments to some screen buttons on the GUI to perform planned functionalities and added the db, implemented methods for the increasing and decreasing of items in inventory
-Edward: Made a class that checks how much each item should be supplied in each room and added more tests in the ItemRepositoryTest class

