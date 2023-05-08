package com.learn.ExceptionHandling;
/*
TODO:Problem Description
You are tasked with creating a program that helps a restaurant manage their reservations. The restaurant has a limited number of tables, and customers can make reservations for a specific time and number of people. The program should allow the restaurant staff to view and manage reservations, as well as handle exceptions that may occur.

Reservation Class:
The Reservation class should have the following attributes:

name: A string representing the name of the customer who made the reservation.
time: A string representing the time of the reservation in the format "HH:mm".
partySize: An integer representing the number of people in the party.
tableNumber: An integer representing the number of the table reserved.
The Reservation class should have the following methods:

getName(): A method that returns the name of the customer who made the reservation.
getTime(): A method that returns the time of the reservation.
getPartySize(): A method that returns the number of people in the party.
getTableNumber(): A method that returns the table number reserved.
Restaurant Class:
The Restaurant class should have the following attributes:

tables: A HashMap where the keys are table numbers and the values are boolean values indicating whether the table is available or not.
reservations: An ArrayList of Reservation objects representing all the reservations made.
The Restaurant class should have the following methods:

addReservation(reservation): A method that adds a Reservation object to the reservations ArrayList. If the table is already reserved for the specified time, throws a custom exception called "TableAlreadyReservedException" with a message saying "The table is already reserved for this time".
cancelReservation(reservation): A method that removes a Reservation object from the reservations ArrayList. If the reservation is not found, throws a custom exception called "ReservationNotFoundException" with a message saying "The reservation was not found".
getAvailableTables(time, partySize): A method that returns a list of available tables for a given time and party size. If there are no available tables, throws a custom exception called "NoTablesAvailableException" with a message saying "There are no tables available for this time and party size".
isTableAvailable(tableNumber, time): A method that checks whether a specific table is available at a given time. If the table number is invalid or the time is invalid, throws a custom exception called "InvalidReservationException" with a message saying "The reservation is invalid".



 */



public class Errors3 {
}
