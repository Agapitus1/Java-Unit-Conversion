# Java-Unit-Conversion

# Part A – Constants & Functions

1. Create a new class Conversion in a new project called week8. DELETE ALL CODE in class Conversion and start typing your class from scratch.

2. The Conversion class will need to declare two constants for the conversion ratios. The first one has been done for you:

private final double F_RATIO = 9/5;

Now create another ratio called K_RATIO and assign it the value 8/5.
3. Create the function toFahrenheit that converts Celsius to fahrenheit:

public double toFahrenheit(double celsius)
{
	double fahrenheit = F_RATIO * celsius + 32;
	return fahrenheit;
}

4. Test the function toFahrenheit – enter 20 degrees celsius, what does the function return? 68F

5. Now create the function toKilometres(double miles) that converts miles to kilometres. Use the formula km = K_RATIO * miles.

6. Test the function toKilometres – enter 40 miles, what does the function return?

7. Open the Week 8 Code Example.doc from the lecture and copy the methods menu() , help() and readChoice(). Paste these three methods into your Conversion class. Now change the three methods so that they offer these options:

Please enter your choice (F, K, X, ?):
Where F is to convert celsius to fahrenheit, and K is to convert miles to kilometres.

 
8. In the menu() method, insert code for the options K & F so that the user can enter the miles and celsius amounts to convert. See below for the example output:

 
 
# Part B – While loops and do loops

10. Create a procedure called mileConversion().  Allow the user to enter a mile range (high and low value), and display messages showing the conversion to Kilometres. 
For example, if the user enters 60 and 63, your program should display:
60 miles is equal to 96.0 km
61 miles is equal to 97.6 km
62 miles is equal to 99.2 km
63 miles is equal to 100.8 km
NOTE: USE A WHILE LOOP

11. Write a method called averageTemp() that asks a user to enter 6 temperature readings in degrees celsius. After all 6 numbers have been entered, calculate the average temperature and display it to the user in degrees Fahrenheit. 
NOTE: USE A DO WHILE LOOP

12. Add code to the menu() method so that mileConversion() and averageTemp() are options in the menu. The new options are:

Please enter your choice (F, K, M, A, X, ?):
Where M is to convert using mileConversion(), and A is to find the average temperature using averageTemp().

