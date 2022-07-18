# sportradar-test

This project simulates the current matches in a football game
Teams are:
    a. Mexico - Canada: 0 - 0
    b. Spain - Brazil: 0 – 0
    c. Germany - France: 0 – 0
    d. Uruguay - Italy: 0 – 0
    e. Argentina - Australia: 0 - 0

The system has menu with following options:
    a. Input 1 to enter new scores
    b. Input 2 to enter print results
    c. Input 3 to finish a game
    d. Input 4 to Exit
    @brief {
        if user_input is not between 1-4 system will warn user.
        if user_input is not integer system will warn user.
    }

After Input 1:
    Enter Home Team Name : {user_input},
    Enter Home Team Score : {user_input},
    Enter Away Team Name : {user_input},
    Enter Away Team Score : {user_input},
    @brief{
        If system cannot find the name inputs it will warn the users.
        If the score inputs below 0 it will warn users.
    }
After Input 2:
    @brief{
        System will print scoreboard.
    }
After Input 3:
    Enter Home Team Name : {user_input},
    Enter Away Team Name : {user_input},
    @brief{
        If system cannot find the name inputs it will warn the users.
    }
After Input 4:
    @brief{
        System will exit.
    }
