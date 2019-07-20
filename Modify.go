package main

import "fmt"

func Modify() {
	var x int
	var Name, Name1 string
	fmt.Println("Enter the name of the account you want to modify:")
	fmt.Scanln(&Name)
	fmt.Println("Which field you want to modify:")
	fmt.Printf("1.Name\n2.Id\n3.Balance\n")
	fmt.Scanln(&x)
	switch x {
	case 1:
		fmt.Println("Enter new name for the account:")
		fmt.Scanln(&Name1)
		m[Name1] = m[Name]
		delete(m, Name)
		fmt.Println("Name is successfully changed.")
	case 2:
		fmt.Println("Enter new Id for the account:", Name)
		fmt.Scanln(&x)
		y := m[Name]
		m[Name] = Account{x, y.Balance}
		fmt.Println("Id is successfully changed.")
	case 3:
		fmt.Println("Enter new Balance for the account:", Name)
		fmt.Scanln(&x)
		y := m[Name]
		m[Name] = Account{y.Id, x}
		fmt.Println("Balance is successfully changed.")
	}
}
