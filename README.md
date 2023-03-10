# 3311-Project

# What's new?

Here in this iteration, we have set up some basic functionality. Users will be able to access two pages from the main menu. Here users can check the requests page and the rooms page.

![image](https://user-images.githubusercontent.com/77425637/218041274-aa06a927-b24b-4d85-8d0b-672d4d39df84.png)

Within the room page, we show all the available and unavailable rooms, for the user to better serve the customer in an organized fashion. Users can then go into each room and complete various tasks like adding customers, extending stays, removing customers, or simply viewing that room's information. Users can also search rooms based on availability, names, and more.

![image](https://user-images.githubusercontent.com/77425637/218042134-b890c5da-603d-4b79-b1c3-27e385795d92.png)

For the requests page, users can view and add requests sent to them, to keep them all organized. When completed, the user can remove requests to keep track of what requests have been completed, and what requests have not been completed or cancelled.

![image](https://user-images.githubusercontent.com/77425637/218042827-42084eca-c769-485e-8c7a-01bd6da1cd80.png)

Along with the database, we have also added `Inventory` functionality for the hotel, this includes:
- Tracking how many items should a room get based on its `Tier`. Rooms with high tiers would contain more expensive amenities.
- Tracking the total inventory in `InventoryRepository`. 
