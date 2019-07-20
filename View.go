package main

import "fmt"

func View() {
	var Name string
	fmt.Println("Enter the name of the Account to view Id and Balance{ID Balance}:")
	fmt.Scanln(&Name)
	fmt.Println(m[Name])
}
