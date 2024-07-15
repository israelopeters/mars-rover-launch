# Mars Rover Launch
This is a basic, interactive command-line app to launch hypothetical rovers on Mars. Each rover can rotate and move forward, and the entire mission is run from a mission control centre.

## Getting Started
No installations are needed to use the app. Simply fork and clone the repo, and then run the application from the command line on your local machine.

### The Plateau
The surface of the planet is assumed to be a rectangular plateau. 

### The Rover Position
The position of a rover is represented by x and y co-ordinates followed by N, S, W, E, representing North, South, West, East, respectively. 

Example
```
0 0 E
```
This is the bottom-left corner on the plateau grid, and the rover is facing East.

## Inputs
### Initializing mission control
Upon starting the app, the user is prompted to enter a name for the mission control center

```
Initializing Mission Control Center...

What is the name of this Mission Control Center? 
```

### Initializing plateau
The size of the plateau is taken next.

Example
```
10 10
```

This means the plateau is a 10-by-10 grid (size = 11 by 11 as the origin is assumed to be 0, 0).

### Launching rover

The next inputa required are the name and initial position of the first rover.

Example
```
Let's launch your rover(s)!

Please enter rover name: 
```

```
Please enter rover position (e.g., 1 2 N): 
```

### Instructing a rover
Multiple rovers can be launched at once, so the user is required to specify the rover to instruct by name. The following movement options are available to each rover:<br/>

L - rotate left <br/>
R - rotate right <br/>
M - move forward one step in same direction <br/>

Multiple instructions can be entered at once.

Example
```
MMMRMRMRR
```

## Output
The output of instructing a rover is its new position and facing direction. For the input instructions above, assuming the rover begins from an initial position ```1 2 E```, then the following output is obtained:

```
3 1 E
```

## Shutting Down
After instructing a rover, the user is prompted whether they would like to instruct another reover. A response in the negative retires the rover and shuts donw the mission control.

## Built With
The app is written entirely in Java.

## Contributing

Please reach out if you would like to contribute to this project.

## Author

* **Israel Peters** - *Entire Project* - [israelopeters](https://github.com/israelopeters)
