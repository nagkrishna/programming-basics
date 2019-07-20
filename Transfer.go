package main

import "fmt"

func Transfer() {
	var Name string
	var Name1 string
	var x int
	fmt.Println("Enter name of the account from which you want to tranfer money from:")
	fmt.Scanln(&Name)
	fmt.Println("You have", m[Name].Balance, "in your", Name, "account.")
	fmt.Println("Enter how much amount you want to tranfer:")
	fmt.Scanln(&x)
	fmt.Println("Enter name of the account you want to tranfer your money to:")
	fmt.Scanln(&Name1)
	y := m[Name]
	z := m[Name1]
	y.Balance = y.Balance - x
	z.Balance = z.Balance + x
	m[Name] = Account{y.Id, y.Balance}
	m[Name1] = Account{z.Id, z.Balance}
	fmt.Println("Amount tranfer is successfully executed.")
}
