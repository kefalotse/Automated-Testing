Feature: feature to test Add to Cart Functionality

Scenario: Validate Add To Cart is working
Given  user is on automaticpractise page
And user clicks on blouse
When page displays option to add to cart or more 
And user clicks add to cart
Then Pop up displays Product succesfully added to your shopping cart
And user clicks close window icon 