package main

import (
	"fmt"
)

type Account struct {
	Id      int
	Balance int
}

var m map[string]Account

func main() {
	m = make(map[string]Account)
	var Name string
	var x, y, z int
	fmt.Println("Create Default data for activating few functionalities of the program.")
	fmt.Println("Enter Name of your default account:")
	fmt.Scanln(&Name)
	fmt.Println("Enter Id of your default account(only intergers):")
	fmt.Scanln(&y)
	fmt.Println("Enter Balance of your default account:")
	fmt.Scanln(&z)
	m[Name] = Account{y, z}
Loop:
	for {
		fmt.Printf("\n1.Register/Create New Account\n2.View Account\n3.Modify Existing Account\n4.Transfer Balance\n5.Exit\n")
		fmt.Println("Enter your choice:")
		fmt.Scanln(&x)
		switch x {
		case 1:
			Register()
		case 2:
			View()
		case 3:
			Modify()
		case 4:
			Transfer()
		case 5:
			break Loop
		default:
			fmt.Println("Wrong Input!")
		}
	}
}
