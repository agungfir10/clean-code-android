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
    
