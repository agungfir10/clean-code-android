## Class Objectives

- Save a lot of time
- Create a clean programming mindset
- Learng coding tips and tricks

## Class Contents

- Identify which code can be cleaned
- Split and shortent giant methods
- Keeps the logic simple and clean
- Simplify hardcoded content handling
- Use tips and tricks for code cleanup
- Simplify coode for lists operations
- Do correct null checks
- Use package structuring strategies
- Apply code guidelines and styles

## Is this class for you ?

- Starting out on Android
- Working for some time with Android
- Hardcodore Android Developer

## Shorten Methods

```
fun showRestaurants()                     +->fun showRestaurants()
    +---------------------------------+   | getRestaurantsResposne()
    | Get restaurants from server     | ->|     parseRestaurants()
    +---------------------------------+   |     filterRestaurants()
                                          |     prepareRestaurants()
                                          +->
    +---------------------------------+
    | Parse restaurants               | -> fun getRestaurantsResponse()
    +---------------------------------+ 
    +---------------------------------+ -> fun parseRestaurants()
    | Order and filter restaurants    | 
    +---------------------------------+ -> fun filterRestaurants()
    +---------------------------------+
    | Prepare restaurants for display | -> fun preparesRestaurants()
    +---------------------------------+
```

### Shortening and splitting methods

- Always aim for decent sized methods
    - shorter than 30-45 lines
      "The first role of functions is that they should be small. The second rule of functions is
      that they should be smaller than that" - Robert C. Martin
    - longer than 3-5 lines
- Shorten a method by splitting it
    - Identify core actions
    - Create new smaller methods for each action
    - Chain new methods inside the big method

## Simple Logic

- Always look for simpler implementations
    - Make sure to refactor your initial logic if something simpler can be implemented
- Don't re-invent the wheel
    - If the functionallity already exists and is stable
    - If your implementation adds nothing new

## Use Enum For Static Content

- What is enum ? An enum is a special "class" that represents a group of contents (unchangeable
  variables, like final variables)
- When should you use enums?
    - Store static content based on multiple predefined cases
        - Entity type with multiple hardcoded values
        - Screen type with multiple layout variations
    - Define class types insted of Strings for predefined entity types
        - View types for different ViewHolders in Adapter

## Clean Your Code Often

- Reformat your code and remove unused imports
    - Using the built-in Android Studio formatting shortcut Ctrl + Alt + L or Cmd + Option + L
- Remove unnecessary logs and commendted code
- Rename classes, methods or variables with poor naming
- Reorder methods within classes

## Collectiokn Operators: Filter and Map

- When you work on lists you can use collection operators
    - Write more concise code
    - Reduce loops nesting
    - Create sequential actions that makes code more readable
- Filter
- Map

### Sort and Find

- Write more concise code
- Reduce loops nesting
- Create sequential actions that makes code more readable

- Map
    - You can use onEach in Kotlin 1.4
- sortedBy
- Find

## When to check for null, Fail Fast

- Checking for null values within your app is beneficial
- When should you check for null?
    - Whenever the null values are obtained from external sources
    - Whenever the null values are out of your control
- When should you NOT check for null?
    - When the field/variable should NOT be null according to your flow

## Split App Responsibilities

- Have your logic delegated to specialized entities
- Avoid having god objects i.e. Activities
- Prevent having to copy paste
- Encourage code reusability
- Less code to maintain and update

## Structure your packages

- Optimize how your porject's classess are arranged
- Adopt a package structuring strategy
    - Package by type
    - Package by layer
    - Package by feature
- Need to expand all folders
- Keep scrolling up and down
- Need to understand dependencies
- No idea what the app does
- Less folders to expand
- No more scrolling
- Easy to understand what the app does

## Code Styles

- https://github.com/ribot/android-guidelines

## Clean Your Code : Summary

- How to identify which portions of the code can be refactored
- How to split or shortent huge methods
- How to keep the logic simple and refactor existing code
- How to use Enum for harcoded content withing the app
- How to consistenly clean and refactor code with the use of IDE
- How to use Kotlin Collection operators to simplify and avod nesting of code
- How to use correctly use null checks to catch bugs faster
- How to split responsibilities of giant class this reducsing its size
- How to organize project's classes by applying package structuring strategies
- How to apply code styles and guidelines for consistent code base
- How to keep the code clean and easy to maintain

### Shortcut

- Ctrl + Alt + M --> Refactor code to function
- Ctrl + B --> Goto Function