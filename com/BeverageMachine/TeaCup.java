/*

You have been tasked with designing the software for a vending machine that sells tea, coffee, and fruit juices. The vending machine should allow users to select the type of beverage they desire, along with the size of cup they prefer.

To ensure that the user can make informed decisions, the vending machine should display the nutritional information and calorie count of each beverage. The calorie count should be calculated based on the sugar amount, size of the cup, and other factors.

The vending machine should offer two subclasses each for tea and coffee, representing different types of the beverage. For fruit juices, the vending machine should offer subclasses that represent different flavors of juice.

The `VendingMachine` class should have the following attributes:
- `inventory`: a dictionary that holds the available beverages and their quantities
- `prices`: a dictionary that holds the prices of the beverages
- `sugar_levels`: a dictionary that holds the sugar levels of the beverages in grams per serving
- `sizes`: a dictionary that holds the available cup sizes and their volumes in milliliters

The `VendingMachine` class should have the following methods:
- `display_inventory()`: displays the available inventory and quantities of each beverage
- `display_prices()`: displays the prices of each beverage
- `display_sugar_levels()`: displays the sugar levels of each beverage
- `display_sizes()`: displays the available cup sizes
- `calculate_calories(beverage, size, sugar_amount)`: calculates the calorie count of a specific beverage based on its sugar amount, cup size, and other factors.
- `make_purchase(beverage, size, sugar_amount, payment)`: handles the purchase of a specific beverage by updating the inventory and processing the payment. Raises an exception if the beverage is not available or if the payment is insufficient.

The `Tea` and `Coffee` classes should inherit from the `Beverage` class and have the following attributes:
- `tea_types` or `coffee_types`: a list that holds the available types of tea or coffee and their quantities
- `brew_time`: the time required to brew the tea or coffee in seconds

The `FruitJuice` class should also inherit from the `Beverage` class and have the following attributes:
- `juice_types`: a list that holds the available types of fruit juice and their quantities
- `pulp_levels`: a dictionary that holds the pulp levels of the fruit juices in grams per serving

The `Beverage` class should have the following attributes:
- `name`: the name of the beverage
- `size`: the size of the cup in milliliters
- `price`: the price of the beverage
- `sugar`: the amount of sugar in grams per serving
- `calories`: the calorie count of the beverage

The calorie count for each beverage should be calculated as follows:
- For black tea: `calories = (sugar * 3.87) + (milk * 20) + 10`
- For green tea: `calories = (sugar * 3.87) + (milk * 20) + 5`
- For espresso: `calories = (sugar * 3.87) + (milk * 20) + 2`
- For latte: `calories = (sugar * 3.87) + (milk * 20) + 70`
- For fruit juice: `calories = (sugar * 3.87) + (fruit * 50) + 15`, where `sugar` is the amount of sugar in grams per serving and `fruit` is the amount of fruit juice in mill
 */