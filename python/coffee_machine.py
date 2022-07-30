water = 400
milk = 540
coffee_beans = 120
cups = 9
money = 550


def information():
    print("The coffee machine has:")
    print(water, "of water")
    print(milk, "of milk")
    print(coffee_beans, "of coffee beans")
    print(cups, "of cups")
    print(money, "of money")


def take():
    global money
    print("I gave you $" + str(money))
    money = 0


def fill():
    global water, milk, coffee_beans, cups
    print("Write how many ml of water you want to add:")
    water += int(input())
    print("Write how many ml of milk you want to add:")
    milk += int(input())
    print("Write how many grams of coffee beans you want to add:")
    coffee_beans += int(input())
    print("Write how many disposable coffee cups you want to add:")
    cups += int(input())


def buy():
    global water, milk, coffee_beans, cups, money
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
    choice = input()
    if cups < 1 and choice != "back":
        print("Sorry, not enough disposable cups!")
        return
    if choice == "1":
        if water < 250:
            print("Sorry, not enough water!")
            return
        elif coffee_beans < 16:
            print("Sorry, not enough coffee beans!")
            return
        else:
            water -= 250
            coffee_beans -= 16
            money += 4
    elif choice == "2":
        if water < 350:
            print("Sorry, not enough water!")
            return
        elif milk < 75:
            print("Sorry, not enough milk!")
            return
        elif coffee_beans < 20:
            print("Sorry, not enough coffee beans!")
            return
        else:
            water -= 350
            milk -= 75
            coffee_beans -= 20
            money += 7
    elif choice == "3":
        if water < 200:
            print("Sorry, not enough water!")
            return
        elif milk < 100:
            print("Sorry, not enough milk!")
            return
        elif coffee_beans < 12:
            print("Sorry, not enough coffee beans!")
            return
        else:
            water -= 200
            milk -= 100
            coffee_beans -= 12
            money += 6
    else:
        cups += 1
    cups -= 1


while True:
    print("Write action (buy, fill, take, remaining, exit):")
    word = input()
    if word == "buy":
        buy()
    elif word == "fill":
        fill()
    elif word == "take":
        take()
    elif word == "remaining":
        information()
    else:
        break
