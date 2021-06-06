import math
import random
comMove=""
int = ""
wins=0
lose=0
tie=0
def computer():
    global comMove
    comNum = random.randrange(1,4)
    if comNum == 1:
        comMove = "rock"
    if comNum == 2:
        comMove = "paper"
    if comNum == 3:
        comMove = "scissors"
    #print(comMove)
    return comMove
def player():
    global int
    int = input("Type Rock, Paper, or Scissors here:")
    int = int.lower()
    print("The Computer's Move: " + str(comMove))
    print("Your move: "+str(int))
    if int.lower()=="rock" or int.lower()=="paper" or int.lower()=="scissors":
        return int
    else:
        print("That is an invalid answer.")
        player()
def checkTie():
    global tie
    if int=="rock" and comMove=="rock":
        tie+=1
    if int=="paper" and comMove=="paper":
        tie += 1
    if int=="scissors" and comMove=="scissors":
        tie += 1
    return tie
def checkWin():
    global wins
    if int=="rock" and comMove=="scissors":
        wins += 1
    if int == "scissors" and comMove == "paper":
        wins += 1
    if int=="paper" and comMove=="rock":
        wins += 1
    return wins


def checkLose():
    global lose
    if comMove=="rock" and int=="scissors":
        lose+=1
    if comMove == "scissors" and int == "paper":
        lose += 1
    if comMove=="paper" and int=="rock":
        lose += 1
    return lose
def runGame():
    while wins != 3 and lose != 3:
        a = computer()
        b = player()
        c = checkTie()
        d = checkLose()
        e = checkWin()
        if wins == 3:
            print("GAME FINISHED! YOU WIN")
            play()
        if lose == 3:
            print("GAME FINISHED! YOU LOSE")
            play()
        print("The number of Wins are:" + str(wins))
        print("The number of Loses are:" + str(lose))
        print("The number of Ties are:" + str(tie))
def play():
    start=input("Would you like to play or play again? Type Yes or No here:")
    start= start.lower()
    if start=="yes":
        runGame()
play()