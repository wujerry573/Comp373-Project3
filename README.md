Comp 373/473- Project 3

Bridge, Observer and Visitor Patterns

Project Description: Demonstrating the implementation of Bridge, Observer and Visitor patterns. 

Bridge Example: Modifying cake orders
- Problem: If a client wants to buy a chocolate cake but modify the size then they could be altering the vanilla cake size as well. 
- Solution: Instead of changing the size of all the cakes for one order the size choice would be decoupled from the flavor of the cake. This allows the client to select different sizes for their cakes independently and later add more choices if they want. 

Observer Example: Website updates for followers
- Problem: Followers of a webpage would like to know when new posts are added. 
- Solution: Using the observer pattern, when a new post is added to the webpage, all followers of the page will be notified. 

Visitor Example: Displaying various Pizza ingredients
- Problem: Pizza is a food that can accept various toppings and ingredients but what if we want to include new toppings on the menu or make changes to the old toppings?
- Solution: Utilizing the Visitor Pattern, any changes in logic of operation would only require changing the visitor implementation rather than changing all toppings/ingredients. Adding new toppings and ingredients would be simple as it only requires change in the visitor interface while implementation and already existing classes will not be affected.

Instructions:
1. Download the file or import through version control
2. Enter the pattern folder of your choice
3. Next, enter the src folder
4. To run pattern:
	- Bridge: CakeTest.java
	- Observer: BridgeWebsite.java
	- Visitor: PizzaTest.java
