## TeachMeSkills_C27_lesson_6_HW
Homework for the ninth lesson

**task1** This is a program from HW7 witch was improve by using modifier "Sealed" to class GeometricFigure. 

**task2** This program multiplies two matrices (multidimensional arrays). Was created a class "Utils", witch contains a 
static method to print the matrix on the screen. Test class "Main" creates and multiplies two arrays. After that, arrays 
and result of multiplying are print on the screen.

**task3** This is a program for transferring from one client’s bank card to his other card. There is a class "Client" 
whose object stores information about the client’s first name, last name, passport number, date of birth and address (postal 
code, country, city, street and house number). As well as object "Client" has array witch stores his cards. Cards are extends 
abstract class and each card contains the card number, CVC/CVV, current amount on the card, card code(id), transfer limit, 
commission for the transfer (field "transferFee") and currency. Cards can be of three types: BelCard, MasterCard, VisaCard.
Class "Service" has methods to do transfer and print transfer status, and carries out checks of input data. Class 
"CurrencyConverter" converts the transfer currency depending on the currency of the selected cards. Test class "Main" 
accepts entry id of cards to transfer and transfer amount, after that carries out transfer.
