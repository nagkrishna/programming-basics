package main

import "fmt"

func Register() {
	var Name string
	var x, y int
	fmt.Println("Enter the Name of the new account:")
	fmt.Scanln(&Name)
	fmt.Println("Enter Id of the new account:")
	fmt.Scanln(&x)
	fmt.Println("Enter Balance of the new account:")
	fmt.Scanln(&y)
	m[Name] = Account{x, y}
}
