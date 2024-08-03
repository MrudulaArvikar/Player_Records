# Players Management System

## Overview

This Java application provides a simple command-line interface to manage cricket players. You can add, remove, edit, search, and display players. It maintains player details such as name and runs scored.

## Features

1. **Add a Player**: Enter the player's name and runs scored.
2. **Show All Players**: Display all players in the list.
3. **Search a Player by Name**: Search for a player by their name.
4. **Remove a Player**: Remove a player from the list by their name.
5. **Edit a Player**: Update the details of an existing player.
6. **Exit**: Exit the application.


## License
This project is licensed under the Apache License 2.0. See the LICENSE file for details.

## Code Sample and Output

Here is a sample session of the application:

```plaintext
1--->Add a Player
2--->Show all Players
3--->Search a Player by name
4--->Remove a Player
5--->Edit a Player
6--->Exit
Enter your choice
1
Enter data (name, runs)
Name:   Dhoni
Runs:   76
Player added successfully...

1--->Add a Player
2--->Show all Players
3--->Search a Player by name
4--->Remove a Player
5--->Edit a Player
6--->Exit
Enter your choice
1
Enter data (name, runs)
Name:   Kohli
Runs:   90
Player added successfully...

1--->Add a Player
2--->Show all Players
3--->Search a Player by name
4--->Remove a Player
5--->Edit a Player
6--->Exit
Enter your choice
1
Enter data (name, runs)
Name:   Sharma
Runs:   60
Player added successfully...

1--->Add a Player
2--->Show all Players
3--->Search a Player by name
4--->Remove a Player
5--->Edit a Player
6--->Exit
Enter your choice
2
The data entered:
Players [name=Dhoni, runs=76]
Players [name=Kohli, runs=90]
Players [name=Sharma, runs=60]

1--->Add a Player
2--->Show all Players
3--->Search a Player by name
4--->Remove a Player
5--->Edit a Player
6--->Exit
Enter your choice
3
Enter name of player to be searched
Dhoni
Player found: Players [name=Dhoni, runs=76]

1--->Add a Player
2--->Show all Players
3--->Search a Player by name
4--->Remove a Player
5--->Edit a Player
6--->Exit
Enter your choice
4
Enter player name to be removed
Dhoni
Player removed successfully

1--->Add a Player
2--->Show all Players
3--->Search a Player by name
4--->Remove a Player
5--->Edit a Player
6--->Exit
Enter your choice
2
The data entered:
Players [name=Kohli, runs=90]
Players [name=Sharma, runs=60]

1--->Add a Player
2--->Show all Players
3--->Search a Player by name
4--->Remove a Player
5--->Edit a Player
6--->Exit
Enter your choice
5
Enter name of player to be edited
Kohli
Enter new name for the player:
Virat Kohli
Enter new runs for the player:
89
Player details updated successfully

1--->Add a Player
2--->Show all Players
3--->Search a Player by name
4--->Remove a Player
5--->Edit a Player
6--->Exit
Enter your choice
2
The data entered:
Players [name=Virat Kohli, runs=89]
Players [name=Sharma, runs=60]

1--->Add a Player
2--->Show all Players
3--->Search a Player by name
4--->Remove a Player
5--->Edit a Player
6--->Exit
Enter your choice
5
Enter name of player to be edited
Sharma
Enter new name for the player:
Rohit Sharma
Enter new runs for the player:
78
Player details updated successfully

1--->Add a Player
2--->Show all Players
3--->Search a Player by name
4--->Remove a Player
5--->Edit a Player
6--->Exit
Enter your choice
6
