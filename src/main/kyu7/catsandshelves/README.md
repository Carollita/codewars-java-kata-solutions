## [Cats and shelves](https://www.codewars.com/kata/62c93765cef6f10030dfa92b/train/java)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnity-100000?style=for-the-badge&logo=JUnit5&logoColor=24995d&labelColor=d14d46&color=d14d46)
![Codewars](https://img.shields.io/badge/Codewars-B1361E?style=for-the-badge&logo=codewars&logoColor=grey)

### Instructions
An infinite number of shelves are arranged one above the other in a staggered fashion.
The cat can jump up to 3 shelves at the same time: from shelf 1 to shelf 2 or 4 (the cat cannot climb on the shelf directly above its head), according to the illustration:

```
                 ┌────────┐
                 │-6------│
                 └────────┘
┌────────┐       
│------5-│        
└────────┘  ┌─────► OK!
            │    ┌────────┐
            │    │-4------│
            │    └────────┘
┌────────┐  │
│------3-│  │     
BANG!────┘  ├─────► OK! 
  ▲  |\_/|  │    ┌────────┐
  │ ("^-^)  │    │-2------│
  │ )   (   │    └────────┘
┌─┴─┴───┴┬──┘
│------1-│
└────────┘
```

### Input
Start and finish shelf numbers (always positive integers, finish no smaller than start)

### Task
Find the minimum number of jumps to go from start to finish

### Example
Start ```1```, finish ```5```, then answer is ```2```
```(1 => 4 => 5 or 1 => 2 => 5)```

### Inspirers
<img src='https://i.ibb.co/BymvZtL/Inspirers.jpg' height='500px'>